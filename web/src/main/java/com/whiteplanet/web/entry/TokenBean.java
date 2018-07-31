package com.whiteplanet.web.entry;

import java.util.Date;

/**
 * @Author: HeWei
 * @Description: 返回Token实体类
 * @Date: Created in 16:52 2017
 * @Modified By:
 */
public class TokenBean {
    private String token;
    private Date time;
    private String userId;

    public TokenBean(String token,Date time,String userId){
        setTime(time);
        setToken(token);
        setUserId(userId);
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
