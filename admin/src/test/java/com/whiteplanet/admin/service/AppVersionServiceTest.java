package com.whiteplanet.admin.service;

import com.whiteplanet.admin.service.impl.AppVersionServiceImpl;
import com.whiteplanet.mapper.data.AppVersionWithContent;
import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:wuzhiyuan
 * @Description:
 * @Date: Created in 17:43 2018/7/13
 * @Modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppVersionServiceTest {
    @Autowired
    private AppVersionServiceImpl appVersionService;
    @Test
    public void insertBatch() {
        AppVersion appVersion = new AppVersion();
        AppVersionWithContent appVersionWithContent = new AppVersionWithContent();
        List<AppVersionContent> list = new ArrayList<>();
        appVersion.setVersion("v2.0.0");
        appVersion.setConstranintUpdate(true);
        appVersion.setCreateTime(new Date());
        appVersion.setUpdateTime(new Date());
        AppVersionContent appVersionContent1 = new AppVersionContent();
        appVersionContent1.setAppVersionId(2);
        appVersionContent1.setContent("大哥别杀我");
        appVersionContent1.setCreateTime(new Date());
        appVersionContent1.setUpdateTime(new Date());
        AppVersionContent appVersionContent2 = new AppVersionContent();
        appVersionContent2.setAppVersionId(2);
        appVersionContent2.setContent("大哥别杀我aaaaaaa");
        appVersionContent2.setCreateTime(new Date());
        appVersionContent2.setUpdateTime(new Date());
        list.add(appVersionContent1);
        list.add(appVersionContent2);
        appVersionWithContent.setAppVersion(appVersion);
//        appVersionWithContent.setAppVersionContents(list);
//        appVersionService.addAppVersionWithContent(appVersionWithContent);
    }
}
