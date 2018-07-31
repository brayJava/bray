package com.whiteplanet.admin.domain.enums;

/**
 * @Author:wuzhiyuan
 * @Description: 机型名称
 * @Date: Created in 16:49 2018/7/17
 * @Modified By:
 */
public enum ModelType {

    ANDROID("android"),

    IOS("ios");

    private final String modelType;

    ModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }
}
