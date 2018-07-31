package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 接诊医生每天接诊量
 * @date: Created in 11:19 2018/6/27
 * @modified By:
 */
public class ReceiveCountBean {

    private String receiveDocId;

    private int receiveCount;

    private String realName;

    public String getReceiveDocId() {
        return receiveDocId;
    }

    public void setReceiveDocId(String receiveDocId) {
        this.receiveDocId = receiveDocId;
    }

    public int getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(int receiveCount) {
        this.receiveCount = receiveCount;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
