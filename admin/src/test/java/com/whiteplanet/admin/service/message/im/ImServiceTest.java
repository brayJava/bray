package com.whiteplanet.admin.service.message.im;

import com.whiteplanet.admin.service.AdminServiceTest;
import com.whiteplanet.admin.service.TestApplication;
import com.whiteplanet.admin.service.message.jg.SlowTests;
import com.whiteplanet.im.jiguang.api.message.MessageClient;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
//import com.whiteplanet.im.jiguang.api.service.impl.JMessageHandleServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 14:29 2018/6/4
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ImServiceTest {

    @Autowired
    private JMessageHandleService jMessageHandleService;

    @Before
    public void before() throws Exception {
//        jMessageHandleService = new JMessageHandleServiceImpl();
    }
    @Test
    public void sendIm() {
        jMessageHandleService.sendCustomMessage("admin","single","Admin"
        ,"8c9748d1f0fe4e1e8a2e8c7fb823154f","测试test");
    }

}
