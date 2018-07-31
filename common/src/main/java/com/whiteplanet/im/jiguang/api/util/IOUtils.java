package com.whiteplanet.im.jiguang.api.util;

import com.whiteplanet.config.MediaType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author:wuzhiyuan
 * @description: 处理与IO相关的工具类
 * @date: Created in 13:52 2018/2/5
 * @modified By:
 */
public class IOUtils {

    /**
     * 保留media资源
     * @param mediaId  mediaId 资源存放路径id
     */
    public static String saveMediaResource(String mediaId) {
        String largeMeidaPath = ""; //本地资源路径
        String realPath = ""; //图片真实路径
        try{
            URL url = new URL(mediaId);
            URLConnection urlConnection = url.openConnection();
            //设置访问超时时间（默认5秒）
            urlConnection.setReadTimeout(5*10000);
            InputStream inputStream = urlConnection.getInputStream();
            //读取网络资源
            byte[] bytes = readInputStream(inputStream);
            //获取存放路径
            String filename = mediaId.substring(mediaId.lastIndexOf(MediaType.MEDIA_SLASH)+1,mediaId.indexOf(MediaType.MEDIA_QUESTION));
            //获取当前时间路径
            String dateFormatPath = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyyMMdd));
            //拼接服务器存放路径
            largeMeidaPath = new StringBuffer().append(MediaType.MEDIA_ROOTPATH).append(MediaType.MEDIA_MESSAGE).append(File.separator)
                    .append(MediaType.MEDIA_LARGE).append(File.separator).append(dateFormatPath).toString();
            File saveFile = new File(largeMeidaPath);
            //不存在该路径则创建
            if(!saveFile.exists()) {
                saveFile.mkdirs();
            }

            realPath = largeMeidaPath+File.separator+filename;
            FileOutputStream fileOutputStream = new FileOutputStream(new File(realPath));
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回本地存放富媒体文件相对路径
        return realPath.substring(realPath.indexOf(MediaType.MEDIA_ROOTPATH)+MediaType.MEDIA_ROOTPATH.length()-1);
    }
    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while( (len=inStream.read(buffer)) != -1 ){
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        //把outStream里的数据写入内存
        return outStream.toByteArray();
    }
//    public static void main(String[] args) {
//        String url = "http://dl.im.jiguang.cn/qiniu/image/j/FB564290B56CBD0BD13215386055D424.png?e=1517798242&token=yQc9oSkxEolUwU5r_59GkKwy41GiAEcP87D65TFQ:B3pWp_JRAbTwEx-ZekR7gRbTV8M=";
//        String substring = url.substring(url.lastIndexOf("/")+1,url.indexOf("?"));
//        System.out.println(substring);
//        //拼接服务器存放路径
//        String largeImgPath = new StringBuffer().append(MediaType.MEDIA_ROOTPATH).append(MediaType.MEDIA_MESSAGE).append(File.separator)
//                .append(MediaType.MEDIA_LARGE).append(File.separator).append("FB564290B56CBD0BD13215386055D424.png").toString();
//        System.out.println(largeImgPath.substring(largeImgPath.indexOf(MediaType.MEDIA_ROOTPATH)+MediaType.MEDIA_ROOTPATH.length()-1));
//    }
}
