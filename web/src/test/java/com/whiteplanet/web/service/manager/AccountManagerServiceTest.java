package com.whiteplanet.web.service.manager;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.whiteplanet.mapper.SysUserMapper;
import com.whiteplanet.mapper.model.SysUser;
import com.whiteplanet.utils.MD5Crypto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.Charset;

import static org.junit.Assert.*;//静态导入，方便后面直接使用

/**
 * !!!!选中java类，按 cmd + shift + T 生成junit!!!!
 * <p>
 * Created by 185378641@qq.com on 2017/10/24.
 *
 * @author jiangtao
 */
@SpringBootTest(classes = AccountManagerServiceTest.TestApplication.class)
@RunWith(SpringRunner.class)
//@ActiveProfiles("test")
//@ActiveProfiles("dev")
public class AccountManagerServiceTest {
    @Autowired
    private AccountManagerService managerService;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    @Rollback
    public void login() throws Exception {

        SysUser user = sysUserMapper.selectByUsername("chen");

        assertNotNull(user);
        assertEquals(user.getAge().intValue(), 18);
        assertEquals(user.getName(), "chen");

        System.out.println(user.getName() + ":" + user.getEmail());


    }

    @Test
    public void guavaTest() {
        HashCode hashCode = Hashing.md5().hashString("18578641@qq.com", Charsets.UTF_8);
        String encryp = MD5Crypto.encryp("18578641@qq.com");
        System.out.println(hashCode + "\n" + encryp);

        assertEquals(hashCode.toString(), encryp);
    }


    /**
     * 这个可以通用，所有测试都写一个，抽出来也可以
     */
    @SpringBootApplication
    @ComponentScan(value = {"com.whiteplanet"})//这个是引用包用的
    public static class TestApplication {
    }


}