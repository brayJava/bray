package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.ClinicMapper;
import com.whiteplanet.mapper.DoctorClinicMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.data.DepartmentFunctionDoctorBean;
import com.whiteplanet.mapper.data.DoctorPartnerBean;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 18:47 2017
 * @Modified By:
 */
@Service
@Transactional
public class DoctorPartnerService extends BaseService{
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DoctorClinicMapper doctorClinicMapper;
    @Autowired
    private ClinicMapper clinicMapper;

    /**
     * 查询所有我的合伙人数据
     * @param account
     * @return
     */
    public ReturnResult findAll(Account account){
        //初始化返回map
        Map<String,Object> returnMap = new HashMap<>();
        //根据用户id查询所有合伙人科室list
        List<DepartmentFunctionDoctorBean> departmentFunctionDoctorBeanList =
                doctorMapper.selectPartnerDepartmentFunction(account.getId());
        //查询诊所下所有合伙人 按加入时间倒序  取前三
        List<DoctorPartnerBean> doctorPartnerBeanList = doctorMapper.selectPartnerByDocAndDf(
                account.getId(),null,3
        );
        returnMap.put("departmentFunction",departmentFunctionDoctorBeanList);  //合伙人科室list
        returnMap.put("doctors",doctorPartnerBeanList);
        //遍历科室list 查询科室下医生信息  (保留此数据结构)
//        for (DepartmentFunctionDoctorBean item : departmentFunctionDoctorBeanList){
//            Map<String,Object> map = new HashMap<>();
//            //根据用户id 科室id 查询医生信息
//            List<DoctorPartnerBean> doctorPartnerBeans = doctorMapper.selectPartner(account.getId(),
//                    item.getDepartmentFunctionId());
//            map.put("departmentFunctionId",item.getDepartmentFunctionId());         // 科室id
//            map.put("departmentFunctionName",item.getDepartmentFunctionName());     // 科室姓名
//            map.put("departmentFunctionCount",item.getDepartmentFunctionCount());   // 科室下医生数量
//            map.put("doctors",doctorPartnerBeans);                                  // 医生list
//
//            returnList.add(map);
//        }
        return new ReturnResult(returnMap);
    }

    /**
     * 根据科室id查询合伙人信息
     * @param data
     * @param account
     * @return
     */
    public ReturnResult findByDepartmentFunctionId(GlobalPageVo data, Account account){
        List<DoctorPartnerBean> returnList = doctorMapper.selectPartnerByDocAndDf(account.getId(),
                data.getText(),data.getCount());
        return new ReturnResult(returnList);
    }
}
