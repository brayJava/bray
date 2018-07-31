package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DoctorPatientMapper;
import com.whiteplanet.mapper.PatientMapper;
import com.whiteplanet.mapper.model.DoctorPatient;
import com.whiteplanet.mapper.model.Patient;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.SingleIntVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description: 医生业务service
 * @Date: Created in 11:25 2017
 * @Modified By:
 */
@Service
@Transactional
public class DoctorBusinessService extends BaseDoctorService{
    @Autowired
    private DoctorPatientMapper doctorPatientMapper;
    @Autowired
    private PatientMapper patientMapper;

    /**
     * 我的患者
     * @param account
     * @param data
     * @return
     */
    public ReturnResult findMyPatients(Account account, SingleIntVo data) {
        //初始化返回map
        List<Map<String,Object>> returnList = new ArrayList<>();
        //查询患者列表
        List<DoctorPatient> doctorPatientList = doctorPatientMapper.selectDoctorPatientByDoctorIdAndSilentFalse(
            account.getId(),data.getValue()
        );
        if (doctorPatientList != null && doctorPatientList.size()>0){
            for (DoctorPatient item : doctorPatientList){
                Patient patient = patientMapper.selectByPrimaryKey(item.getPatientId());
                if(patient == null) break;
                Map<String,Object> map = new HashMap<>();
                map.put("id",patient.getId());
                map.put("name",patient.getRealName()==null?patient.getNickname():patient.getRealName());
                map.put("faceimage",patient.getHeadimgurl());
                String address = WPStringUtil.transNull(patient.getProvince())+
                        WPStringUtil.transNull(patient.getCity());
                map.put("address",address);

                returnList.add(map);
            }
            return new ReturnResult(returnList);
        } else {
            return ReturnResult.RESULT_NONE;
        }
    }
}
