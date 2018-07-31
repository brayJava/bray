package com.whiteplanet.web.service.doctor;

import com.whiteplanet.mapper.CertificatesMapper;
import com.whiteplanet.mapper.DepartmentMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.model.Certificates;
import com.whiteplanet.mapper.model.Department;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseDoctorService extends BaseService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private CertificatesMapper certificatesMapper;
    @Autowired
    private DoctorMapper doctorMapper;

    /**
     * 校验身份验证信息 待改进点:身份审核校验过于繁琐，建议在用户表新增身份审核字段，人工审核后更新该字段
     * @param doctorId
     * @return
     */
    public Boolean idCheckStatus (String doctorId){
        /*
          逻辑:将验证成功的记录取出,然后遍历，取type 字符串与常量比对，相等则为true
          新增校验条件:行政只校验工作证 工作证无正反面
        */
        //初始化校验位
        Boolean ID_B_OK= false;         //身份证反面
        Boolean ID_F_OK= false;         //身份证正面
        Boolean PHY_B_OK=false;         //从业资格证反面
        Boolean PHY_F_OK=false;         //从业资格证正面
        Boolean WORKCARD_OK=false;      //工作证

        Boolean IS_PASS = false;        //校验结果
        //取职称对象，用户判断是否是行政人员
        Doctor doctor = doctorMapper.selectByPrimaryKey(doctorId);
        Department department = departmentMapper.selectByPrimaryKey(doctor.getDepartmentId());
        //mapper 方法改动 更贴合方法名逻辑 增加入参status (以前SQL写死 status = 2)
        List<Certificates> certificatesList = certificatesMapper.selectByDoctorIdAndStatus(doctorId, Final.ID_CHECK_STATUS_SUCCESS);
        for (Certificates item:certificatesList){
            switch (item.getType()){
                case Final.IDCARD_BACK :
                    ID_B_OK = true;
                    break;
                case Final.IDCARD_FRONT :
                    ID_F_OK = true;
                    break;
                case Final.PHYSICIA_BACK :
                    PHY_B_OK = true;
                    break;
                case Final.PHYSICIA_FRONT :
                    PHY_F_OK = true;
                    break;
                case Final.WORKCARD :
                    WORKCARD_OK = true;
                    break;
            }
        }
        //如果是department.code为行政code 则只判断身份证和工作证
        if(Final.ADMINISTRATION_CODE.equals(department.getCode())){
            IS_PASS = ID_B_OK && ID_F_OK && WORKCARD_OK;
        } else {
            //否则 判断身份证和资格证
            IS_PASS = ID_B_OK && ID_F_OK && PHY_B_OK && PHY_F_OK;
        }
        return IS_PASS;
    }

}
