package com.whiteplanet.backward.dto;

/**
 * @author:wuzhiyuan
 * @description: 统计参数
 * @date: Created in 16:50 2018/4/17
 * @modified By:
 */
public class StatParam {

    private String startTime;

    private String entTime;

    private int pageNum;

    private int pageSize;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEntTime() {
        return entTime;
    }

    public void setEntTime(String entTime) {
        this.entTime = entTime;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
