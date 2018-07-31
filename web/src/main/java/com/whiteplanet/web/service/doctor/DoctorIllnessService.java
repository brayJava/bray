package com.whiteplanet.web.service.doctor;
import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DoctorIllnessMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.DoctorIllnessKey;
import com.whiteplanet.mapper.model.Illness;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.doctor.DoctorIllnessBean;
import com.whiteplanet.web.entry.doctor.IllnessBean;
import com.whiteplanet.web.entry.SingleStringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生擅长项目实现
 * @date: Created in 10:05 2017/12/26
 * @modified By:
 */
@Service
@Transactional
public class DoctorIllnessService extends BaseDoctorService {
    /**
     * 医生mapper接口
     */
    @Autowired
    private DoctorMapper doctorMapper;
    /**
     * 医生擅长项目mapper接口
     */
    @Autowired
    private DoctorIllnessMapper doctorIllnessMapper;
    /**
     * 医生擅长的项目
     * @param account
     * @return
     */
    public ReturnResult doctorIllness(Account account) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        //疾病项目名称
        List<Illness> illnesses = doctorIllnessMapper.selectByDoctorId(account.getId());
        DoctorIllnessBean doctorIllnessBean = null;
        if(CollectionUtils.isEmpty(illnesses)) {
            return ReturnResult.RESULT_NONE;
        } else {
            IllnessBean illnessBean = new IllnessBean();
            doctorIllnessBean = new DoctorIllnessBean();
            for (Illness illness: illnesses) {
                illnessBean.setId(illness.getId());
                illnessBean.setName(illness.getName());
                //医生和擅长疾病关系
                doctorIllnessBean.setIllness(illnessBean);
            }
            doctorIllnessBean.setDepartmentFunctionId(doctor.getDepartmentFunctionId());
            doctorIllnessBean.setDepartmentFunctionName(doctor.getDepartmentFunctionName());
        }
        return new ReturnResult(JSONObject.toJSON(doctorIllnessBean));
    }

    /**
     * 擅长项目添加
     * @param account
     * @return
     */
    public ReturnResult illnessAdd(SingleStringBean singleStringBean ,Account account) {
        DoctorIllnessKey doctorIllnessKey = new DoctorIllnessKey();
        doctorIllnessKey.setDoctorId(account.getId());
        doctorIllnessKey.setIllnessId(singleStringBean.getParam());
        //查询是否有相应的医生擅长项目记录
        DoctorIllnessKey illnessKey = doctorIllnessMapper.selectByPrimaryKey(doctorIllnessKey);
        if(Objects.isNull(illnessKey)) {
            return ReturnResult.DATA_EXIST;
        } else {
            try {
                doctorIllnessMapper.insert(doctorIllnessKey);
            } catch (Exception e) {
                logger.error(">>>>>>>>医生id为{} 的医生擅长项目添加失败...",account.getId());
                e.printStackTrace();
                return ReturnResult.RESULT_ERROR;
            }
        }
        return ReturnResult.RESULT_SUCCESS;
    }
    /**
     * 删除擅长的项目
     * @return
     */
    public ReturnResult illnessDelete(SingleStringBean singleStringBean,Account account ) {
        DoctorIllnessKey doctorIllnessKey = new DoctorIllnessKey();
        doctorIllnessKey.setDoctorId(account.getId());
        doctorIllnessKey.setIllnessId(singleStringBean.getParam());
        try {
            doctorIllnessMapper.deleteByPrimaryKey(doctorIllnessKey);
        } catch (Exception e) {
            logger.error(">>>>>>>>>删除医生id为{} 的医生擅长项目失败...",account.getId());
            e.printStackTrace();
            return ReturnResult.RESULT_ERROR;
        }
        return ReturnResult.RESULT_SUCCESS;
    }
}
