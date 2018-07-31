package com.whiteplanet.backward.excel.handler;

import com.whiteplanet.backward.excel.util.ExcelUtils;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 模板转换为excel
 * @date: Created in 17:01 2018/4/12
 * @modified By:
 */
public  class ModuleToExcel {

    public static void ObjectToExcel(List list, Class tClass,String excelName) throws Exception{
        //不基于模板生成Excel
        ExcelUtils.getInstance().exportObjects2Excel(list,tClass,true,null,true,excelName);
    }
}
