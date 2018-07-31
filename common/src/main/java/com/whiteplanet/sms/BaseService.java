package com.whiteplanet.sms;


import com.whiteplanet.mapper.DateDefaultMapper;
import com.whiteplanet.mapper.PubFileMapper;
import com.whiteplanet.mapper.model.PubFile;
import com.whiteplanet.utils.WPStringUtil;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public abstract class BaseService {

    @Autowired
    private PubFileMapper pubFileMapper;
    @Autowired
    private DateDefaultMapper dateDefaultMapper;
    //日志 slf4j
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 写入数据文件
     * @param value
     * @param fileType
     * @return
     * @throws IOException
     */
    public String writeFile(String value,String fileType)throws IOException{
        String filePath = File.separator + Final.DATE_YYYYMMDD.format(new Date());
        String fileName = WPStringUtil.GETuuid();
        File pathData = new File(""+filePath);
        if(!pathData.exists()){
            pathData.mkdirs();
        }

        IOUtils.write(value,new FileWriter("" + filePath + File.separator + fileName));

        PubFile pubFile = new PubFile();
        pubFile.setCreateTime(new Date());
        pubFile.setId(WPStringUtil.GETuuid());
        pubFile.setFilePath(filePath+File.separator+fileName);
        pubFile.setFileType(fileType);
        pubFile.setStatus(0);

        pubFileMapper.insertSelective(pubFile);
        return pubFile.getId();
    }

}
