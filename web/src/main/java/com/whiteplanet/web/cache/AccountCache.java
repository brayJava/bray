package com.whiteplanet.web.cache;

import com.whiteplanet.web.entry.Account;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class AccountCache {

    /**
     * 获取或者添加到缓存内容
     *
     * @param token
     * @return
     */
    @Cacheable(value = "account", key = "#token")
    public Account get(String token){
        return null;
    }

    /**
     * 设置缓存
     * @param account
     * @return
     */
    @CachePut(value = "account", key = "#account.token")
    public Account set(Account account){
        return account;
    }

    /**
     *
     * 清除指定缓存
     *
     * @param token
     * @return
     */
    @CacheEvict(value="account", key="#token")
    public void remove(String token){
    }

    /**
     * 清楚缓存
     */
    @CacheEvict(value="account", allEntries=true)
    public void clear(){
    }
}
