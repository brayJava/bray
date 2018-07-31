package com.whiteplanet.im.jiguang.api.service.impl;

import com.whiteplanet.im.jiguang.api.message.MessageListResult;
import com.whiteplanet.im.jiguang.api.message.MessageResult;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
import com.whiteplanet.im.jiguang.api.service.JMessageService;
import com.whiteplanet.im.jiguang.api.util.DateUtil;
import com.whiteplanet.im.jiguang.api.util.IOUtils;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.ImSingleMessageMapper;
import com.whiteplanet.mapper.MessageTypeContentMapper;
import com.whiteplanet.mapper.VisitPersonMapper;
import com.whiteplanet.mapper.data.JMessageBean;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.ImSingleMessage;
import com.whiteplanet.mapper.model.MessageTypeContent;
import com.whiteplanet.mapper.model.VisitPerson;
import com.whiteplanet.push.wechat.WechatTemplateMessageServcie;
import com.whiteplanet.push.wechat.bean.Constant;
import com.whiteplanet.push.wechat.bean.TemplateParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author:wuzhiyuan
 * @description:  iM历史消息同步入库服务
 * @date: Created in 17:20 2018/02/01
 * @modified By:
 */
@Service
@Transactional
public class JMessageServiceImpl implements JMessageService
        ,ApplicationListener<ContextRefreshedEvent> {
    Logger logger = LoggerFactory.getLogger(JMessageServiceImpl.class);
    /**
     * im聊天记录数据接口
     */
    @Autowired
    ImSingleMessageMapper imSingleMessageMapper;
    /**
     * 患者记录表
     */
    @Autowired
    VisitPersonMapper visitPersonMapper;
    /**
     * 医生记录信息
     */
    @Autowired
    DoctorMapper doctorMapper;
    /**
     * 消息处理实现类
     */
    @Autowired
    JMessageHandleService jMessageHandleServiceImpl;
    /**
     * IM消息发送接口
     */
    @Autowired
    WechatTemplateMessageServcie wechatTemplateMessageServcieImpl;
    @Autowired
    MessageTypeContentMapper messageTypeContentMapper;
    //常用语统计集合
    public static Map<String,String> phrasesMap  = new HashMap<>();

    @Value("${task.sendTime}")
    public int sendTime;
    /**
     * 当前时间，前七天时间
     */
    private static  String beginTime = "";
    /**
     * 当前时间
     */
    private static  String endTime = "";

    public JMessageServiceImpl() {
        //时间间隔为7天
        beginTime= getBeginDate();
        endTime= getEndDate();
    }
    /**
     *获取当前日期时间
     * @return
     */
    private String getEndDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
    }
    /**
     * 获取当前时间前七天日期时间
     * @return
     */
    private String getBeginDate() {
        return LocalDateTime.now().minusDays(7).plusSeconds(1).format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
    }
    /**
     * 获取五分钟前IM历史消息
     * @return
     */
    private String getIMBeginDate() {
        return LocalDateTime.now().minusMinutes(sendTime).format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
    }
    /**
     * 获取极光服务器上一次取得的最新时间
     * @param timeMessageList
     * @return
     */
    private Date getStartDate(MessageListResult timeMessageList) {
        Date beginTime;
        Long msgCtime = timeMessageList.getMessages()[timeMessageList.getMessages().length-1].getMsgCtime();
        beginTime = new Date(msgCtime);
        return beginTime;
    }
    /**
     * 处理历史消息尾部多出.0 的问题
     * @param msgText
     * @return
     */
    private String dealTime(String msgText) {
        return msgText.substring(0,msgText.length() -2);
    }
    /**
     * 截取患者id
     * @param visitPerson
     * @return
     */
    private String getVisitPerson(String visitPerson) {
        return visitPerson.substring(0,visitPerson.lastIndexOf(Constant.BSXQ_HZ));
    }
    /**
     * 同步消息列表
     * @return
     */
    public void synchronousJMessage() {
        //查询历史记录进行同步，取上次同步最新时间
        Date maxDate = imSingleMessageMapper.selectMaxMsgCtime();
        logger.info(">>>>>>>>>>>>>>>>>>>>时间:{},开始同步....",DateUtil.formatDate(new Date(),DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
        long startMillis = Clock.systemDefaultZone().millis();
        int totalMessage = 0; //总共处理的消息条数
        if(Objects.isNull(maxDate)) {
            //第一次同步，默认读取前七天数据，极光接口会做校验
            totalMessage = insertLogicMethod(beginTime,endTime);
        } else {
            Date newMaxDate = DateUtil.addTime(maxDate,1,Calendar.SECOND);
            //库中存在数据，进行同步操作
            totalMessage = insertLogicMethod(DateUtil.formatDate(newMaxDate,DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss),getEndDate());
        }
        long endMillis = Clock.systemDefaultZone().millis();
        logger.info(">>>>>>>>>>>>>>>>>>>>>时间点：{}，同步完成，总共同步成功{}条消息数据，消耗{}秒...",DateUtil.formatDate(new Date(),DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss)
                ,totalMessage,(endMillis - startMillis)/1000.0);
    }
    /**
     * 插入的逻辑方法
     * @param originalTime 原始数据时间
     * @param currentTime 当前时间
     */
    private int insertLogicMethod(String originalTime,String currentTime) {
        //第一次同步
        MessageListResult messageList = jMessageHandleServiceImpl.getMessageList(originalTime, currentTime);
        if(messageList.getTotal() >0 && messageList.getTotal() <= 1000 ) {
            //少于1000条批量插入
            insertBatchMessage(messageList);
        } else if(messageList.getTotal() > 1000) {
            int times = messageList.getTotal() / 1000;
            Date beginTime = null;
            for(int i=0; i<=times ; i++) {
                MessageListResult timeMessageList = null;
                if(i == 0) {
                    //第一次插入1000记录
                    insertBatchMessage(messageList);
                    //第一次获取的第一千条数据的最新时间
                    beginTime = getStartDate(messageList);
                } else {
                    timeMessageList = jMessageHandleServiceImpl.getMessageList(DateUtil.formatDate(beginTime
                            , DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss), currentTime);
                    //大于1000条数据，分批次插入
                    insertBatchMessage(timeMessageList);
                    //获取第一次后取得的最后一条数据时间
                    beginTime = getStartDate(timeMessageList);
                }
            }
        }
        return messageList.getTotal();
    }
    /**
     * 批量插入message消息，每次为1000条
     * @param messageList
     */
    private void insertBatchMessage(MessageListResult messageList) {
        List<ImSingleMessage> batchInsertList = setImSingleMessages(messageList);
        try {
            imSingleMessageMapper.insertBatch(batchInsertList);
            //置空处理
            batchInsertList.clear();
        } catch (Exception e) {
            logger.error("历史消息数据同步失败,将进行回滚操作.....");
            e.printStackTrace();
        }
    }
    /**
     * 设置消息记录信息
     * @param messageList
     * @return
     */
    private List<ImSingleMessage> setImSingleMessages(MessageListResult messageList) {
        List<ImSingleMessage> batchInsertList = new ArrayList();
        for(MessageResult messageResult : messageList.getMessages()) {
            ImSingleMessage imSingleMessage = new ImSingleMessage();
            imSingleMessage.setFromType(messageResult.getFromType());
            imSingleMessage.setFromId(messageResult.getFromId());
            imSingleMessage.setCreateTime(new Date(messageResult.getCreateTime()));
            imSingleMessage.setFromAppkey(messageResult.getFrom_appkey());
            imSingleMessage.setTargetType(messageResult.getTargetType());
            if(Objects.isNull(messageResult.getMsgBody().getExtras())){
                imSingleMessage.setMsgExtras("");
            } else {
                String type = messageResult.getMsgBody().getExtras().get(Constant.TYPE);
                if(Constant.PHONE.equals(type)) {
                    imSingleMessage.setMsgExtras(messageResult.getMsgBody().getExtras().get(Constant.CONTENT));
                }
            }
            imSingleMessage.setMsgText(messageResult.getMsgBody().getText());
            imSingleMessage.setMsgType(messageResult.getMsgType());
            //当为常用话术的时候存一个类型
            if(phrasesMap.containsKey(messageResult.getMsgBody().getText())) {
                imSingleMessage.setMsgType(messageResult.getMsgType()+"_"+phrasesMap.get(messageResult.getMsgBody().getText()));
            }
            imSingleMessage.setFromPlatform(messageResult.getFromPlatform());
            imSingleMessage.setTargetId(messageResult.getTargetId());
            imSingleMessage.setVersion(messageResult.getVersion()+"");
            imSingleMessage.setMsgid(messageResult.getMsgId()+"");
            imSingleMessage.setMsgCtime(new Date(Long.valueOf(messageResult.getMsgCtime())));
            imSingleMessage.setMsgLevel(messageResult.getMsgLevel()+"");
            //如果为富媒体，则存储图片路径,存放极光mediaId
            imSingleMessage.setMsgRichmediaPath(messageResult.getMsgBody().getMediaId());
            //富媒体信息存在本地服务器，并保存本地路径
            if(!Constant.TEXT.equals(messageResult.getMsgType())) {
                //获取资源路径
                String resource = jMessageHandleServiceImpl.getResource(messageResult.getMsgBody().getMediaId());
                //将富媒体信息存入本地，并保存对应本地存放路径
                imSingleMessage.setLocalRechmediaPath(IOUtils.saveMediaResource(resource));
            }
            batchInsertList.add(imSingleMessage);
        }
        return batchInsertList;
    }
    /**
     * IM消息下行通知
     */
    @Override
    public void adviceJMessage() {
        String iMendDate = getEndDate();
        String iMBeginDate = getIMBeginDate();
        logger.info(">>>>>>>>>>>>>>>开始IM下行通知患者端");
        //获取最新IM消息，定为2分钟
        List<JMessageBean> jMessageBeans = imSingleMessageMapper.selectJMessageByTime(iMBeginDate, iMendDate);
        if(Objects.isNull(jMessageBeans) || jMessageBeans.size() == 0) return;
        jMessageBeans.forEach(jMessageBean -> {
            Doctor doctor = doctorMapper.selectByPrimaryKey(jMessageBean.getFromId());
            String visitPersonId = getVisitPerson(jMessageBean.getTargetId());
            VisitPerson visitPerson = visitPersonMapper.selectByPrimaryKey(visitPersonId);
            if(Objects.isNull(visitPerson)) return;
            if(Constant.IMAGE.equals(jMessageBean.getMsgType())) {
                jMessageBean.setMsgText(doctor.getRealName()+" 医生给您发送了一条消息【图片】");
            } else if(Constant.BSXQ_HZ_PHONE.equals(jMessageBean.getMsgText().trim())) {
                jMessageBean.setMsgText(doctor.getRealName()+" 医生给您发送了一条消息【手机号:"+jMessageBean.getMsgExtras()+"】");
            } else {
                jMessageBean.setMsgText(doctor.getRealName()+" 医生给您发送了一条消息 \n  【"+jMessageBean.getMsgText()+"】");
            }
            TemplateParam templateParam = new TemplateParam("您有一个新消息","平台消息通知",dealTime(jMessageBean.getMaxTime())+"\n"+jMessageBean.getMsgText(),"查看详情>");
            wechatTemplateMessageServcieImpl.sendTemplateMessage(visitPerson.getOpenId(),jMessageBean.getFromId(), Constant.IM_WECHAT,templateParam);
            logger.info(">>>>>>>>>>>>>>>医生:{},成功推送了一条消息【{}】",doctor.getRealName(),jMessageBean.getMsgText());
        });
        logger.info(">>>>>>>>>>>>>>>推送完成，共下行通知{}条消息",jMessageBeans.size());
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        List<MessageTypeContent> messageTypeContents = messageTypeContentMapper.selectAllMsgWordTypes();
        messageTypeContents.forEach(messageTypeContent -> {
            phrasesMap.put(messageTypeContent.getMsgWordContent(),String.valueOf(messageTypeContent.getMsgWordType()));
        });
    }
}