package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.ClinicMapper;
import com.whiteplanet.mapper.DepartmentMapper;
import com.whiteplanet.mapper.DoctorImageMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.model.Clinic;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.DoctorImage;
import com.whiteplanet.web.entry.*;
import com.whiteplanet.web.entry.doctor.DoctorClinicImageBean;
import com.whiteplanet.web.entry.doctor.DoctorDetailBean;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生个人信息实现类
 * @date: Created in 10:24 2017/12/25
 * @modified By:
 */
@Service
@Transactional
public class DoctorService extends BaseService{
    /**
     * 医生mapper接口
     */
    @Autowired
    private DoctorMapper doctorMapper;
    /**
     * 医生图片相关mapper接口
     */
    @Autowired
    private DoctorImageMapper doctorImageMapper;
    /**
     * 诊所相关信息mapper接口
     */
    @Autowired
    private ClinicMapper clinicMapper;
    /**
     * 诊所相关信息mapper接口
     */
    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 医生个人简介
     * @param account
     * @return
     */
    public ReturnResult introduction(Account account) {
        Doctor doctor = null;
        try {
            doctor = doctorMapper.selectByPrimaryKey(account.getId());
        } catch (Exception e) {
            logger.debug(">>>>>>>>>>未查询到医生id为{} 的医生...");
            e.printStackTrace();
        }
        if(Objects.isNull(doctor))
            return ReturnResult.RESULT_NONE;
        return new ReturnResult(JSONObject.toJSON(doctor));
    }
    /**
     *  保存医生个人简介信息
     * @param singleStringBean
     * @param account
     * @return
     */
    public ReturnResult introductionSave(SingleStringBean singleStringBean , Account account) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        if(Objects.isNull(doctor))
            return ReturnResult.RESULT_NONE;
        Doctor doctorNew = new Doctor();
        doctorNew.setId(account.getId());
        doctorNew.setIntroduce(singleStringBean.getParam());
        doctorNew.setUpdateDate(new Date());
        try {
            doctorMapper.updateByPrimaryKeySelective(doctorNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>>更新医生id为:{}的信息个人简介信息失败..");
            e.printStackTrace();
        }
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 上传个人风采照片
     * @param bean
     * @param account
     * @return
     */
    public ReturnResult doctorImageUpload(DoctorClinicImageBean bean, Account account) {
        String publicId = null;
        if(!StringUtils.isEmpty(bean.getBase64())) {
            try {
                //判断是否存在base64编码，并将图片存入服务器中
                publicId = this.writeFile(bean.getBase64(), null);
            } catch (IOException e) {
                logger.error(">>>>>>>>>文件base64为{} 的图片写入失败");
                e.printStackTrace();
            }
        }
        if(StringUtils.isEmpty(bean.getBase64()) || publicId == null)
            return ReturnResult.RESULT_ERROR;
        //查询医生图片信息
        DoctorImage doctorImage = doctorImageMapper.selectByDoctorIdAndSort(account.getId(), bean.getSort());
        if(Objects.isNull(doctorImage)) {
            DoctorImage doctorImageNew = new DoctorImage();
            doctorImage.setSort(bean.getSort());
            doctorImage.setDoctorId(account.getId());
            doctorImage.setPubFileId(publicId);
            try {
                doctorImageMapper.insertSelective(doctorImage);
            } catch (Exception e) {
                logger.error(">>>>>>>>>>>医生id为{} 的医生图片插入失败...");
                e.printStackTrace();
            }
        } else {
            doctorImage.setSort(bean.getSort());
            doctorImage.setPubFileId(publicId);
            doctorImage.setDoctorId(account.getId());
            try {
                doctorImageMapper.updateByPrimaryKeySelective(doctorImage);
            } catch (Exception e) {
                logger.error(">>>>>>>>>>医生id为{} 的医生图片更新失败...");
                e.printStackTrace();
            }
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",publicId);
        return new ReturnResult(jsonObject);
    }
    /**
     * 查看个人风采照片
     * @param account
     * @return
     */
    public ReturnResult showDoctorImage(Account account) {
        //获取所有医生相片
        List<DoctorImage> doctorImages = doctorImageMapper.selectImageIdByDoctorId(account.getId());
        if(CollectionUtils.isEmpty(doctorImages)) {
            return ReturnResult.RESULT_NONE;
        }
        JsonArray jsonArray = new JsonArray();
        doctorImages.forEach(doctorImage -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",doctorImage.getPubFileId());
            jsonObject.put("sort", doctorImage.getSort());
            jsonArray.add(jsonObject.toString());
        });
        return new ReturnResult(JSONObject.toJSON(jsonArray));
    }
    /**
     * 医生详情
     * @param account
     * @return
     */
    public ReturnResult doctorDetail(Account account) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        Clinic clinic = clinicMapper.selectByDoctorId(doctor.getId());
        //查询功能科室code
        String departmentCode = departmentMapper.selectParentCodeByPrimaryKey(doctor.getDepartmentId());
        DoctorDetailBean doctorDetailBean = new DoctorDetailBean(doctor,clinic,departmentCode);
        return new ReturnResult(JSONObject.toJSON(doctorDetailBean));
    }

    /**
     * 医生信息保存
     * @param doctorInfoVo
     * @param account
     * @return
     */
    public ReturnResult doctorInfoSave(DoctorInfoVo doctorInfoVo , Account account) {
        Doctor doctorNew = new Doctor();
        doctorNew.setId(account.getId());
        doctorNew.setRealName(doctorInfoVo.getRealName());
        doctorNew.setDepartmentId(doctorInfoVo.getDepartmentId());
        doctorNew.setDepartmentName(doctorInfoVo.getGetDepartmentName());
        doctorNew.setDepartmentFunctionId(doctorInfoVo.getDepartmentFunctionId());
        doctorNew.setDepartmentFunctionName(doctorInfoVo.getDepartmentFunctionName());
        doctorNew.setSex(doctorInfoVo.getSex() == 1 ? true : false);
        doctorNew.setTreatmentMoney(doctorInfoVo.getTreatmentMoney());
        doctorNew.setUpdateDate(new Date());
        try {
            //更新医生信息
            doctorMapper.updateByPrimaryKeySelective(doctorNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>id为{} 的医生信息更新失败...");
            e.printStackTrace();
        }
        return ReturnResult.RESULT_SUCCESS;
    }
}