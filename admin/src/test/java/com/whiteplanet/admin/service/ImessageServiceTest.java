/*
package com.whiteplanet.admin.service;

import com.whiteplanet.mapper.ImSingleMessageMapper;
import com.whiteplanet.mapper.model.ImSingleMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

*/
/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 17:18 2018/2/5
 * @modified By:
 *//*

@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ImessageServiceTest {

    @Autowired
    public ImSingleMessageMapper imSingleMessageMapper;

    @Test
    public void testMessage() {

        Date date = imSingleMessageMapper.selectMaxMsgCtime();
        System.out.println(date);
    }
    @Test
    public void insert() {
        List<ImSingleMessage> imSingleMessages = new ArrayList<>();
        long startMillis = Clock.systemDefaultZone().millis();
//        for(int i=0 ;i<1000;i++) {
//            System.out.println(i);
//            ImSingleMessage imSingleMessage = new ImSingleMessage();
//            imSingleMessage.setFromType("admin");
//            imSingleMessage.setFromId("suyulong");
//            imSingleMessage.setCreateTime(new Date(1517477316+Long.valueOf(i)));
//            imSingleMessage.setFromAppkey("4060fbce4d18d78a9a57c242");
//            imSingleMessage.setTargetType("single");
//            imSingleMessage.setMsgExtras("");
//            imSingleMessage.setMsgText("message:"+i);
//            imSingleMessage.setMsgType("text");
//            imSingleMessage.setFromPlatform("api");
//            imSingleMessage.setTargetId("suyulong");
//            imSingleMessage.setVersion("1");
//            imSingleMessage.setMsgid("561749119"+i);
//            imSingleMessage.setMsgCtime(new Date(1517477316174L+Long.valueOf(i)));
//            imSingleMessage.setMsgLevel("1");
//            //如果为富媒体，则存储图片路径,存放极光mediaId
//            imSingleMessage.setMsgRichmediaPath("");
//            imSingleMessages.add(imSingleMessage);
//        }
        ImSingleMessage imSingleMessage = new ImSingleMessage();
        imSingleMessage.setFromType("admin");
        imSingleMessage.setFromId("suyulong");
        imSingleMessage.setCreateTime(new Date(1517477316+Long.valueOf(1)));
        imSingleMessage.setFromAppkey("4060fbce4d18d78a9a57c242");
        imSingleMessage.setTargetType("single");
        imSingleMessage.setMsgExtras("");
        imSingleMessage.setMsgText("message:1");
        imSingleMessage.setMsgType("text");
        imSingleMessage.setFromPlatform("api");
        imSingleMessage.setTargetId("suyulong");
        imSingleMessage.setVersion("1");
        imSingleMessage.setMsgid("561749119");
        imSingleMessage.setMsgCtime(new Date(1517477316174L+Long.valueOf(1)));
        imSingleMessage.setMsgLevel("1");
        //如果为富媒体，则存储图片路径,存放极光mediaId
        imSingleMessage.setMsgRichmediaPath("");
        imSingleMessages.add(imSingleMessage);
        System.out.println("总条数："+imSingleMessages.size());
        ImSingleMessage imSingleMessage1 = new ImSingleMessage();
        imSingleMessage1.setFromType("admin");
        imSingleMessage1.setFromId("suyulong");
        imSingleMessage1.setCreateTime(new Date(1517477315));
        imSingleMessage1.setFromAppkey("4060fbce4d18d78a9a57c242");
        imSingleMessage1.setTargetType("single");
        imSingleMessage1.setMsgExtras("");
        imSingleMessage1.setMsgText("message2");
        imSingleMessage1.setMsgType("text");
        imSingleMessage1.setFromPlatform("api");
        imSingleMessage1.setTargetId("suyulong");
        imSingleMessage1.setVersion("1");
        imSingleMessage1.setMsgid("561749118");
        imSingleMessage1.setMsgCtime(new Date(1517477316175L));
        imSingleMessage1.setMsgLevel("1");
        //如果为富媒体，则存储图片路径,存放极光mediaId
        imSingleMessage1.setMsgRichmediaPath("");
        imSingleMessages.add(imSingleMessage1);
        try {
            imSingleMessageMapper.insertBatch(imSingleMessages);
            //            imSingleMessageMapper.insertSelective(imSingleMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endMillis = Clock.systemDefaultZone().millis();
        System.out.println("总耗时："+(endMillis-startMillis)/1000.0+"秒");
    }
}
*/
