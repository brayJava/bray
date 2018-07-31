package com.whiteplanet.mapper.model;

/**
 * @author:wuzhiyuan
 * @description: 实名认证统计
 * @date: Created in 11:37 2018/4/9
 * @modified By:
 */
public class RealnameAuthStat {
    /**
     * 实名认证时间
     */
    private String realnameAuthTime;
    /**
     * 实名认证次数
     */
    private Integer realnameAuthCount;

    public String getRealnameAuthTime() {
        return realnameAuthTime;
    }

    public void setRealnameAuthTime(String realnameAuthTime) {
        this.realnameAuthTime = realnameAuthTime;
    }

    public Integer getRealnameAuthCount() {
        return realnameAuthCount;
    }

    public void setRealnameAuthCount(Integer realnameAuthCount) {
        this.realnameAuthCount = realnameAuthCount;
    }
}
