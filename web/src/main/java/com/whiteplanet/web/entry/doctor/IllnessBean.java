package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 疾病名称bean
 * @date: Created in 10:11 2017/12/26
 * @modified By:
 */
public class IllnessBean {
    /**
     * 疾病id
     */
    private String id;
    /**
     * 疾病名称
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
