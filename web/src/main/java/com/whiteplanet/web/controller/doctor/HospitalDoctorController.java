package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.model.Hospital;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.service.doctor.HospitalDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wuzhiyuan
 * @description:  医院相关控制器处理
 * @date: Created in 13:57 2017/12/18
 * @modified By:
 */
@RestController
public class HospitalDoctorController extends BaseDoctorController{
    /**
     * 医院相关服务
     */
    @Autowired
    public HospitalDoctorService hospitalDoctorService;

    /**
     * 按医院关键字查询医院名称
     * @param param
     * @return
     */
    @PostMapping(value = "/hospital")
    public ReturnResult search(@RequestBody JsonParam<GlobalPageVo> param) {
        ReturnResult returnResult = hospitalDoctorService.findByNameWithCount(param.getData());
        return returnResult;
    }

    /**
     * 新添医院
     * @param hospital
     * @return
     */
    @PostMapping(value = "/hospital-add")
    public ReturnResult hospitalAdd(@RequestBody Hospital hospital){
        return hospitalDoctorService.insertHospital(hospital);
    }

}
