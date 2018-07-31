package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.HospitalMapper;
import com.whiteplanet.mapper.model.Hospital;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.service.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医院相关测试类
 * @date: Created in 16:10 2017/12/18
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
public class HospitalDoctorServiceTest {

    @Autowired
    private HospitalMapper hospitalMapper;

    /**
     * 按医院名称关键字查询模糊查询相关联医院
     */
    @Test
    public void findHospitalsByNameWhthCount() {
        GlobalPageVo globalPageVo = new GlobalPageVo();
        globalPageVo.setCount(20);
        globalPageVo.setText("医院");
        List<Hospital> hospitals = hospitalMapper.selectByLinkNameWithCount(globalPageVo.getText()
                , globalPageVo.getCount());
        System.out.println(JSONArray.toJSON(hospitals));
    }

    /**
     * 新的医院插入
     */
    @Test
    @Rollback
    public void insertHospital() {
        //判断是否已经存在医院名称
        Hospital hospitalOld = hospitalMapper.selectByName("上海第六人民医院");
        JSONObject jsonObject = null;
        //没有已存在医院，可执行医院插入操作
        Assert.assertNull(hospitalOld);
        Hospital hospitalNew = new Hospital();
        hospitalNew.setId(WPStringUtil.GETuuid());
        hospitalNew.setAddress("上海市宜山路600号");
        hospitalNew.setCountry("中国");
        hospitalNew.setProvince("上海市");
        hospitalNew.setCity("上海市");
        hospitalNew.setName("上海第六人民医院");
        hospitalNew.setStatus(1);
        try {
            //插入新医院
            hospitalMapper.insertSelective(hospitalNew);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonObject = new JSONObject();
        jsonObject.put("id",hospitalNew.getId());
        jsonObject.put("name",hospitalNew.getName());
        System.out.println(jsonObject);

    }

}