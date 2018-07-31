package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 是否是合伙人判断
 * @date: Created in 17:28 2017/12/28
 * @modified By:
 */
public class IsPartner {
    /**
     * 是否是他人的合伙人
     */
    private boolean isOtherPartner;
    /**
     * 是否是自己的合伙人
     */
    private boolean isMyPartner;

    public IsPartner() {
    }

    public IsPartner(boolean isOtherPartner, boolean isMyPartner) {
        this.isOtherPartner = isOtherPartner;
        this.isMyPartner = isMyPartner;
    }

    public boolean isOtherPartner() {
        return isOtherPartner;
    }

    public void setOtherPartner(boolean otherPartner) {
        isOtherPartner = otherPartner;
    }

    public boolean isMyPartner() {
        return isMyPartner;
    }

    public void setMyPartner(boolean myPartner) {
        isMyPartner = myPartner;
    }
}
