package com.whiteplanet.backward.service.data.impl;
import com.whiteplanet.backward.excel.handler.ModuleToExcel;
import com.whiteplanet.backward.excel.modules.ClinicPriceRelateModule;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.data.ClinicPriceRangeBean;
import com.whiteplanet.mapper.data.ClinicPriceRelateBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
/**
 * @author:wuzhiyuan
 * @description: 诊所价格相关统计
 * @date: Created in 11:49 2018/5/14
 * @modified By:
 */
public class ClinicPriceRelateStatServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DoctorMapper doctorMapper;

    void clinicPriceRelateStat(ClinicPriceRangeBean clinicPriceRangeBean) {

        //获取价格区间统计
        List<ClinicPriceRelateBean> clinicPriceRelateBeans = doctorMapper.selectClinicPriceRelate(clinicPriceRangeBean);
        List<ClinicPriceRelateModule> clinicPriceRelateModules = new ArrayList<>();
        clinicPriceRelateBeans.forEach(clinicPriceRelateBean -> {
            ClinicPriceRelateModule clinicPriceRelateModule = new ClinicPriceRelateModule(clinicPriceRelateBean);
            clinicPriceRelateModules.add(clinicPriceRelateModule);
        });
        try {
            ModuleToExcel.ObjectToExcel(clinicPriceRelateModules,ClinicPriceRelateModule.class,"clinicPriceRelateStatistics.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}