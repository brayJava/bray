package com.whiteplanet.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <p>Title: MD5Crypto</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 *
 * @version 1.0
 * @date 2017/9/13 23:00
 */
public class MD5Crypto {
    /*
     * <p>Method: encryp</p>
     * <p>Description:
     * 1.一个运用基本类的实例
     * MessageDigest 对象开始被初始化。该对象通过使用 update 方法处理数据。
     * 任何时候都可以调用 reset 方法重置摘要。
     * 一旦所有需要更新的数据都已经被更新了，应该调用 digest 方法之一完成哈希计算。
     * 对于给定数量的更新数据，digest 方法只能被调用一次。
     * 在调用 digest 之后，MessageDigest 对象被重新设置成其初始状态。
     *  </p>
     * @Deprecated 使用的是jdk自带的md5
     * @author Neil.Zhou
     * @date 2017/9/13 23:06
     */
    @Deprecated
    public static String encrypByMd5(String context) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(context.getBytes());
            byte [] encryContext = md.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < encryContext.length; offset++) {
                //做相应的转化（十六进制）
                i = encryContext[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
            //System.out.println("16result: " + buf.toString().substring(8, 24));// 16位的加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
    * <p>Method: encryp</p>
    * <p>Description: </p>
    * @param
    * @author Neil.Zhou
    * @date 2017/9/13 23:06
    */
    public static String encryp(String context) {
        return DigestUtils.md5Hex(context);
    }
    /**
     * <p>Method: decipher</p>
     * <p>Description:
     * md5 解密，暂时无法逆向解密
     * </p>
     * @param
     * @author Neil.Zhou
     * @date 2017/9/13 23:06
     */
    @Deprecated
    public static void decipher(String context){

    }

    public static void main(String[] args) {
        try {
//            signature = md5("appkey=25b693b31d2c2ad5f072ef0c&timestamp=1507791639926&random_str=022cd9fd995849b&key=bc2efab258f2019727a4f36l")
            String strTime  = String.valueOf(System.currentTimeMillis());
            System.out.println(strTime);
            String context = "appkey=4060fbce4d18d78a9a57c242&timestamp="+strTime+"&random_str=022cd9fd995849b58b3ef0e943421ed9&key=372166e4d44df304abd3b91c";
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(context.getBytes());
            byte [] encryContext = md.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < encryContext.length; offset++) {
                //做相应的转化（十六进制）
                i = encryContext[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            System.out.println(buf.toString());
            System.out.println("16result: " + buf.toString().substring(8, 24));// 16位的加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
