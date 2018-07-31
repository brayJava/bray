package com.whiteplanet.admin.dto;

import com.whiteplanet.mapper.model.Feedback;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 用户反馈信息收集dto
 * @date: Created in 17:27 2017/12/6
 * @modified By:
 */
public class DoctorFeedBackDto implements Serializable{
    private static final long serialVersionUID = -7080992902196130266L;
    /**
     * 用户反馈信息
     */
    private Feedback feedback;
    /**
     *  用户姓名
     */
    private  String name;
    /**
     *  用户姓名
     */
    private  String phone;

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
