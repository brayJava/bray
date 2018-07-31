package com.whiteplanet.web.entry;

/**
 * @Author: HeWei
 * @Description: 证件上传请求参数vo
 * @Date: Created in 11:23 2017
 * @Modified By:
 */
public class CertificatesVo {
    private String base64;
    private Boolean front;
    private String name;
    private String fileType;

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public Boolean getFront() {
        return front;
    }

    public void setFront(Boolean front) {
        this.front = front;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
