package com.whiteplanet.admin.service;

import com.whiteplanet.admin.mapper.AdminUserMapper;
import com.whiteplanet.admin.mapper.model.AdminUser;
import com.whiteplanet.admin.mapper.model.AdminUserExample;
import com.whiteplanet.mapper.SysUserMapper;
import com.whiteplanet.mapper.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by 185378641@qq.com on 2017/11/2.
 *
 * @author jiangtao
 */
@SpringBootTest(classes = AdminServiceTest.TestApplication.class)
@RunWith(SpringRunner.class)
public class AdminServiceTest {

    @Autowired
    private AdminUserMapper mapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    @Rollback
    public void login() {
        AdminUser re = new AdminUser();
        re.setName("chenjiangtao");
        re.setPwd("123456");
        mapper.insert(re);

        AdminUser user = mapper.selectByPrimaryKey(2L);
        assertNotNull(user);
        System.out.println("admin user name "+user.getName());


        SysUser sysUser = sysUserMapper.selectByUsername("chen");

        assertNotNull(sysUser);
        assertEquals(sysUser.getAge().intValue(),18);
        assertEquals(sysUser.getName(),"chen");

        System.out.println(sysUser.getName() +":" +sysUser.getEmail());
    }

    @Test
    public void testSysUserMapper() {
        SysUser sysUser = sysUserMapper.selectByUsername("chen");

        assertNotNull(sysUser);
        assertEquals(sysUser.getAge().intValue(), 18);
        assertEquals(sysUser.getName(), "chen");

        System.out.println(sysUser.getName() + ":" + sysUser.getEmail());
    }
    /**
     * 验证登入
     */
    @Test
    public void loginCheck() {
        String user = "chenjiangtao";
        String password = "111111";
        AdminUserExample adminUserExample = new AdminUserExample();
        AdminUserExample.Criteria criteria = adminUserExample.createCriteria();
        criteria.andNameEqualTo(user);
        List<AdminUser> adminUsers = mapper.selectByExample(adminUserExample);
        System.out.println(adminUsers);
    }
    /**
     * 这个可以通用，所有测试都写一个，抽出来也可以
     */
    @SpringBootApplication
    @ComponentScan(value = {"com.whiteplanet"})//这个是引用包用的
    public static class TestApplication {
    }

}