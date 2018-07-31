package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 约诊时间返回对象
 * @date: Created in 16:50 2018/6/5
 * @modified By:
 */
public class AppointmentTimeResultBean {
    /**
     *  订单时间
     */
    private String orderTime;
    /**
     * 约诊单数量
     */
    private int appointmentCount;
    /**
     * 取消数量
     */
    private int cancelCount;
    /**
     * 订单失败率
     */
    private String failRate;

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(int appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    public int getCancelCount() {
        return cancelCount;
    }

    public void setCancelCount(int cancelCount) {
        this.cancelCount = cancelCount;
    }

    public String getFailRate() {
        return failRate;
    }

    public void setFailRate(String failRate) {
        this.failRate = failRate;
    }
}
