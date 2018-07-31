package com.whiteplanet.utils;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 18:39 2017
 * @Modified By:
 */
public class WPStringUtil {

    /**
     * 替换模板
     * @param template
     * @param data
     * @return
     */
    public static String render(String template, Map<String, String> data) {
        for(String key:data.keySet()){
            if(data.get(key)==null){
                data.put(key,"");
            }
            template = template.replace("<{"+key+"}>",data.get(key));

        }
        return template;
    }

    public static String transNull(String param){
        return param == null?"":param;
    }
    /**
     * 生成UUID
     * @return
     */
    public static String GETuuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
