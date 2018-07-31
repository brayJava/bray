package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.CertificatesMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.PubFileMapper;
import com.whiteplanet.mapper.model.Certificates;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.CertificatesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;

/**
 * @Author: HeWei
 * @Description: 实名认证相关
 * @Date: Created in 11:19 2017
 * @Modified By:
 */
@Service
@Transactional
public class CertificatesService extends BaseDoctorService{
    @Autowired
    private CertificatesMapper certificatesMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private PubFileMapper pubFileMapper;


    /**
     * 实名认证上传资料接口(由于数据量大，前端遍历多张图片多次调用)
     * @param certificatesVo
     * @return
     */
    public ReturnResult certificatesAll(CertificatesVo certificatesVo, Account account){
        /*
        * 如果认证页面姓名栏做了修改，则更新到医生个人信息姓名中(已和产品确认，医生有义务告知用户真实姓名) 20171102
        */
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        if(certificatesVo.getName()!=null && !certificatesVo.getName().equals(account.getName())){
            doctor.setRealName(certificatesVo.getName());
            //去掉step更新，所以可以把update放在if条件中
            doctorMapper.updateByPrimaryKeySelective(doctor);
        }
        return this.certAdd(certificatesVo,account);
    }

    /**
     * 写入文件，入库
     * @param certificatesVo
     * @param account
     * @return
     * @throws IOException
     */
    private ReturnResult certAdd(CertificatesVo certificatesVo,Account account){
        String type = ""; //init file type
        //组建文件类型字符串 例如:IDCARD_F  工作证不分正反面
        if(Final.WORKCARD.equals(certificatesVo.getFileType())){
            type = Final.WORKCARD;
        }else {
            if(certificatesVo.getFront()){
                type = certificatesVo.getFileType()+"_F";
            }else{
                type = certificatesVo.getFileType()+"_B";
            }
        }

        //1.写入文件
        String pubFileString = "";
        try {
            pubFileString = this.writeFile(certificatesVo.getBase64(),null);
        } catch (IOException e) {
            logger.debug(">>>>>>>>>>用户:[{}]上传文件:[{}]失败",account.getPhone(),type);
            e.printStackTrace();
            return ReturnResult.UPLOAD_FAILED;
        }
        //2.将之前库中文件信息逻辑删除
        certificatesMapper.updateByUploadDelete(account.getId(),type);
        //3.构建新文件对象
        Certificates certificates = new Certificates();
        certificates.setId(WPStringUtil.GETuuid());
        certificates.setDoctorId(account.getId());
        certificates.setPubFileId(pubFileString);
        certificates.setStatus(0);
        certificates.setType(type);
        certificates.setCreateDate(new Date());
        //4.插入新文件记录
        certificatesMapper.insertSelective(certificates);

        // 查询该用户下 状态为待审核的文件数，如果文件数为2，则更新文件状态
        // 不知此逻辑的意义，暂时不动原有逻辑
        Integer count = certificatesMapper.selectByDoctorIdAndTypeEnable(account.getId(),type);
        if(count == 2){
            certificatesMapper.updateByUploadEnable(account.getId(),type);
        }

        return ReturnResult.RESULT_SUCCESS;
    }
}
