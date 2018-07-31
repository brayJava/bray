package com.whiteplanet.web.entry;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 15:46 2017
 * @Modified By:
 */
public class ImageVo {
    private String base64;

    private String contentType;

    public ImageVo(String base64,String contentType){
        this.base64 = base64;
        this.contentType = contentType;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
