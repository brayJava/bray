package com.whiteplanet.admin.service;

import com.whiteplanet.config.JMessageType;
import com.whiteplanet.im.jiguang.api.message.MessageListResult;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
import com.whiteplanet.im.jiguang.api.util.DateUtil;
import com.whiteplanet.im.jiguang.api.util.StringUtils;
import com.whiteplanet.mapper.ImSingleMessageMapper;
import com.whiteplanet.mapper.SysAuthCodeMapper;
import com.whiteplanet.push.jg.JPushService;
import com.whiteplanet.push.wechat.bean.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wuzhiyuan
 * @description: IM消息相关逻辑接口
 * @date: Created in 16:41 2018/6/20
 * @modified By:
 */
@Service
public class JMessageService {
    /**
     * IM推送相关
     */
    @Autowired
    private ImSingleMessageMapper imSingleMessageMapper;

    @Autowired
    private SysAuthCodeMapper sysAuthCodeMapper;
    /**
     * IM消息记录获取接口
     */
    @Autowired
    private JMessageHandleService jMessageHandleService;
    /**
     * 推送相关接口
     */
    private JPushService jPushService;
    /**
     * @param doctorId  医生id
     * @param userToken 用户token值
     * @return
     */
    public boolean checkJMessage(String doctorId, String userToken) {

        if (StringUtils.isNotEmpty(userToken) && StringUtils.isNotEmpty(doctorId)) {
            String accountId = sysAuthCodeMapper.selectAccountIdByToken(userToken, false);
            if (StringUtils.isNotEmpty(accountId)) {
                String patientId = accountId + Constant.BSXQ_HZ;
                int count = imSingleMessageMapper.selectCountById(patientId);
                if (count == 0) {
                    MessageListResult userMessages = jMessageHandleService.getUserMessages(patientId, 5,
                            DateUtil.getBeginDate(), DateUtil.getEndDate());
                    if (userMessages.getTotal() == 0) {
                        return false;
                    } else {
                        //查询IM极光服务器上存在记录则发送消息
                        jMessageHandleService.sendCustomMessage(JMessageType.USER_TYPE_USER,JMessageType.MESSAGE_TYPE_SINGLE,
                                doctorId,patientId,JMessageType.MESSAGE_CONTENT);
                        return true;
                    }
                }
                //查询历史记录表中有记录则发送消息
                jMessageHandleService.sendCustomMessage("admin","single",
                        "Admin",patientId,JMessageType.MESSAGE_CONTENT);
                return true;
            }
            return false;
        }
        return false;
    }
    /**
     * 患者端向app发送推送信息
     */
    public void sendPushMessage(String doctorId) {

        try {
            jPushService.sendPushWithNotificationByAliasToAllPlatform(doctorId,"您有一条新的通知","");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}