package com.whiteplanet.admin.service;

import com.whiteplanet.admin.mapper.AdminUserMapper;
import com.whiteplanet.admin.mapper.model.AdminUser;
import com.whiteplanet.admin.mapper.model.AdminUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by 185378641@qq.com on 2017/11/2.
 *
 * @author jiangtao
 */
@Component
public class AdminService {
    @Autowired
    private AdminUserMapper mapper;

    public List<AdminUser> login(AdminUser adminUser){
        AdminUserExample ex = new AdminUserExample();
        ex.createCriteria().andNameEqualTo(adminUser.getName()).andPwdEqualTo(adminUser.getPwd());
        List<AdminUser> adminUsers = mapper.selectByExample(ex);

        return adminUsers;
    }


}
