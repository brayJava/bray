package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.HospitalMapper;
import com.whiteplanet.mapper.model.Hospital;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医院相关业务处理
 * @date: Created in 14:00 2017/12/18
 * @modified By:
 */
@Service
@Transactional
public class HospitalDoctorService extends BaseService {

    @Autowired
    private HospitalMapper hospitalMapper;

    /**
     * 按指定条数查询关联名称的医院
     * @param param{“text”：医院名称,"count": 查询条数}
     * @return
     */
    public ReturnResult findByNameWithCount(GlobalPageVo param) {

        List<Hospital> hospitals = null;
        try {
            hospitals = hospitalMapper.selectByLinkNameWithCount(param.getText(), param.getCount());
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>查询医院信息失败，查询关键字为：{}",param.getText());
            e.printStackTrace();
        }
        if(!CollectionUtils.isEmpty(hospitals)) {
            Object jsonArray = JSONArray.toJSON(hospitals);
            return new ReturnResult(jsonArray);
        }
        return new ReturnResult(JSONArray.toJSON(new ArrayList<Hospital>()));

    }
    /**
     * 新添医院
     * @param hospital
     * @return
     */
    public ReturnResult insertHospital(Hospital hospital) {
        //判断是否已经存在医院名称
        Hospital hospitalOld = hospitalMapper.selectByName(hospital.getName());
        JSONObject jsonObject = null;
        if(Objects.isNull(hospitalOld)) {
            logger.error(">>>>>>>>>>>>>医院名称:{},已经存在!",hospital.getName());
            return ReturnResult.HOSPITAL_DATA_EXIST;
        }
        Hospital hospitalNew = new Hospital();
        hospitalNew.setId(WPStringUtil.GETuuid());
        hospitalNew.setAddress(hospital.getAddress());
        hospitalNew.setCountry(hospital.getCountry());
        hospitalNew.setProvince(hospital.getProvince());
        hospitalNew.setCity(hospital.getCity());
        hospitalNew.setName(hospital.getName());
        hospitalNew.setStatus(1);
        try {
            //插入新医院
            hospitalMapper.insertSelective(hospitalNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>>新添医院插入失败...");
            e.printStackTrace();
        }
        jsonObject = new JSONObject();
        jsonObject.put("id",hospitalNew.getId());
        jsonObject.put("name",hospitalNew.getName());
        return new ReturnResult(jsonObject);
    }
}