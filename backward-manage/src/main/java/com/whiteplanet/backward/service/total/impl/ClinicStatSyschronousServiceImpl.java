package com.whiteplanet.backward.service.total.impl;

import com.whiteplanet.back.mapper.ClinicPriceStatisticsMapper;
import com.whiteplanet.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:wuzhiyuan
 * @description:  诊所统计相关
 * @date: Created in 17:11 2018/4/20
 * @modified By:
 */
@Service
@Transactional
public class ClinicStatSyschronousServiceImpl {

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private ClinicPriceStatisticsMapper clinicPriceStatisticsMapper;

    void ClinicPriceRangeSyschonous() {



    }
}
