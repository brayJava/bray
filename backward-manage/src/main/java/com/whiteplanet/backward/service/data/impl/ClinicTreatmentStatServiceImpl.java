package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.backward.excel.handler.ModuleToExcel;
import com.whiteplanet.backward.excel.modules.PriceStatisticsModule;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.data.ClinicPriceRangeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.NumberFormat;
import java.util.*;
/**
 * @author:wuzhiyuan
 * @description: 诊所诊费区间数量统计
 * @date: Created in 11:47 2018/5/2
 * @modified By:
 */
@Service
public class ClinicTreatmentStatServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //价格区间数量集合
    private static Map<String, Integer> priceMap = new LinkedHashMap<>();
    @Autowired
    private DoctorMapper doctorMapper;

    void clinicTreatmentStat(ClinicPriceRangeBean clinicPriceRangeBean) {

        //统计相关，0~1000数量统计
        for (int i = 0; i <= 1000; i += 100) {
            if (i == 0) {
                int zeroPriceCount = doctorMapper.selectClinicZeroPrice(clinicPriceRangeBean);
                priceMap.put(0 + "", zeroPriceCount);
            } else {
                String priceKey = new StringBuffer().append(i - 100).append("-").append(i).toString();
                clinicPriceRangeBean.setLowTreatmentMoney(i - 100);
                clinicPriceRangeBean.setHighTreatmentMoney(i);
                int priceCount = doctorMapper.selectClinicPriceRange(clinicPriceRangeBean);
                priceMap.put(priceKey, priceCount);
            }
        }
        //统计1000~10000数据
        for (int k = 2000; k <= 10000; k += 1000) {
            String priceKey = new StringBuffer(k - 1000).append("-").append(k).toString();
            clinicPriceRangeBean.setLowTreatmentMoney(k - 1000);
            clinicPriceRangeBean.setHighTreatmentMoney(k);
            int priceRange = doctorMapper.selectClinicPriceRange(clinicPriceRangeBean);
            priceMap.put(priceKey, priceRange);
        }
        //获取价格总数量0~10000
        clinicPriceRangeBean.setLowTreatmentMoney(0);
        clinicPriceRangeBean.setHighTreatmentMoney(10000);
        int totalCount = doctorMapper.selectClinicPriceRange(clinicPriceRangeBean);
        List<PriceStatisticsModule> priceStatisticsModules = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = priceMap.entrySet().iterator();
        while (iterator.hasNext()) {
            PriceStatisticsModule priceStatisticsModule = new PriceStatisticsModule();
            Map.Entry<String, Integer> entry = iterator.next();
            priceStatisticsModule.setPriceRange(entry.getKey());
            priceStatisticsModule.setUserCount(entry.getValue());
            priceStatisticsModule.setPercentage(getPercentage(entry.getValue(),totalCount));
            priceStatisticsModules.add(priceStatisticsModule);
        }
        try {
            //生成excel
            ModuleToExcel.ObjectToExcel(priceStatisticsModules,PriceStatisticsModule.class,"priceRangeStatistics.xlsx");
        } catch (Exception e) {
            logger.error("生成excel失败......");
            e.printStackTrace();
        }
    }
    //获取百分比
    public String getPercentage(int num1, int num2) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float) num1 / (float) num2 * 100)+"%";
        return result;
    }


}