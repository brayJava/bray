package com.whiteplanet.web.service.common;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.PubFileMapper;
import com.whiteplanet.mapper.model.PubFile;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.ImageVo;
import com.whiteplanet.web.service.BaseService;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Base64;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 15:33 2017
 * @Modified By:
 */
@Service
@Transactional
public class ImageService extends BaseService{
    @Autowired
    private PubFileMapper pubFileMapper;
    @Value("${whiteplante.upload.path}")
    private String path;


    public void getResource(String id, String stype, HttpServletResponse response){
        PubFile pubFile = pubFileMapper.selectByPrimaryKey(id);
        try {
            String resource = IOUtils.toString(new FileReader(path+pubFile.getFilePath()));
            if("base64".equals(stype)){
                String json = JSON.toJSONString(new ReturnResult(new ImageVo(resource,pubFile.getFileType())));
                byte[] jsonBytes = json.getBytes("UTF-8");

                response.setContentLength(jsonBytes.length);
                response.setContentType("application/json;UTF-8");
                OutputStream write = response.getOutputStream();
                write.write(jsonBytes);
                write.flush();
                write.close();
            }else {
                String[] resources = resource.split(",");
                byte[] bytes = null;
                if (resource.length() ==1){
                    bytes = Base64.getDecoder().decode(resource.split(",")[0]);
                }else if (resource.length() == 2){
                    bytes = Base64.getDecoder().decode(resource.split(",")[1]);
                }else {
                    bytes = new byte[0];
                }
                response.setContentLength(bytes.length);
                response.setContentType(pubFile.getFileType());
                OutputStream write = response.getOutputStream();
                write.write(bytes);
                write.flush();
                write.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取图片资源
     * @param id
     * @param stype
     * @param zoom
     * @param response
     */
    public void getImage(String id, String stype, Integer zoom, HttpServletResponse response){
        PubFile pubFile = pubFileMapper.selectByPrimaryKey(id);
        try {
            String resource = IOUtils.toString(new FileReader(path+pubFile.getFilePath()));
            byte[] zoomResource = zoomImage(resource,zoom);
            if("base64".equals(stype)){
                String fileType = "image/png";
                if(StringUtils.hasText(pubFile.getFileType())){
                    fileType = pubFile.getFileType();
                }

                String json = JSON.toJSONString(new ReturnResult(new ImageVo(resource,pubFile.getFileType())));
                byte[] jsonBytes = json.getBytes("UTF-8");

                response.setContentLength(jsonBytes.length);
                response.setContentType("application/json;UTF-8");
                OutputStream write = response.getOutputStream();
                write.write(jsonBytes);
                write.flush();
                write.close();
            }else {
                String fileType = "image/png";
                if(StringUtils.hasText(pubFile.getFileType())){
                    fileType = pubFile.getFileType();
                }
                response.setContentLength(zoomResource.length);
                response.setContentType(pubFile.getFileType());
                OutputStream write = response.getOutputStream();
                write.write(zoomResource);
                write.flush();
                write.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 缩放文件
     * @param resource
     * @param zoom
     * @return
     * @throws IOException
     */
    private byte[] zoomImage(String resource,Integer zoom) throws IOException{
        String[] resources = resource.split(",");
        byte[] bytes = null;
        if (resource.length() ==1){
            bytes = Base64.getDecoder().decode(resource.split(",")[0]);
        }else if (resource.length() == 2){
            bytes = Base64.getDecoder().decode(resource.split(",")[1]);
        }else {
            bytes = new byte[0];
        }

        if(1<zoom && zoom<10){
            return new byte[0];
        }else if (1==zoom){
            return bytes;
        }else {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Thumbnails.of(new ByteArrayInputStream(bytes)).scale(1f/zoom).toOutputStream(outputStream);
            return outputStream.toByteArray();
        }
    }
}
