package com.whiteplanet.web.service.sms;

import com.whiteplanet.web.service.common.SendSmsHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 13:59 2017
 * @Modified By:
 */
@SpringBootTest(classes = SendSmsTest.TestApplication.class)
@RunWith(SpringRunner.class)
public class SendSmsTest {
    @Autowired
    private SendSmsHandler sendSmsHandler;

    @Test
    @Rollback
    public void sendMsg(){
        sendSmsHandler.sendSms("13774284214","9043",4);
    }
    @SpringBootApplication
    @ComponentScan(value = {"com.whiteplanet"})//这个是引用包用的
    public static class TestApplication {

    }
}
