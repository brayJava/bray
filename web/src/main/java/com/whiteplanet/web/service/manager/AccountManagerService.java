package com.whiteplanet.web.service.manager;


import com.whiteplanet.mapper.SysUserMapper;
import com.whiteplanet.mapper.model.SysUser;
import com.whiteplanet.utils.MD5Crypto;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.cache.AccountCache;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.LoginBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountManagerService extends BaseManagerService{

    /**
     * 系统账户信息
     */
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private AccountCache accountCache;

    /**
     * 管理账户登录
     * @param loginAccount
     * @return
     */
    public ReturnResult login(LoginBean loginAccount) {

        if(StringUtils.isEmpty(loginAccount.getUsername())){
            return new ReturnResult("600","账户或密码不正确！");
        }

        if(StringUtils.isEmpty(loginAccount.getPassword())){
            return new ReturnResult("600","账户或密码不正确！");
        }

        SysUser user = sysUserMapper.selectByUsername(loginAccount.getUsername());
        if(user == null){
            return new ReturnResult("600","账户或密码不正确！");
        }

        if(!user.getPassword().equals(MD5Crypto.encryp(loginAccount.getPassword()))){
            return new ReturnResult("600","账户或密码不正确！");
        }

        Account account = new Account();
        account.setId(user.getId());
        account.setName(user.getName());
        account.setAge(user.getAge());
        account.setSex(user.getSex());

        accountCache.set(account);

        return null;
    }
}
