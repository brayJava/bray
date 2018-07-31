package com.whiteplanet.admin.dto;

import com.whiteplanet.mapper.model.Certificates;
import com.whiteplanet.mapper.model.PubFile;
import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 证件图片对应路径dto
 * @date: Created in 18:30 2017/11/26
 * @modified By:
 */
public class CertificatesDto extends Certificates
        implements Serializable{


    private static final long serialVersionUID = -6506279853668548709L;
    /**
     * 证件图片路径对象
     */
    private PubFile pubFile;

    public PubFile getPubFile() {
        return pubFile;
    }

    public void setPubFile(PubFile pubFile) {
        this.pubFile = pubFile;
    }
}
