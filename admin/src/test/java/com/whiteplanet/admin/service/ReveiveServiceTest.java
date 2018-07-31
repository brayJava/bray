package com.whiteplanet.admin.service;

import com.whiteplanet.admin.service.message.jg.SlowTests;
import com.whiteplanet.mapper.ClinicDealRecordMapper;
import com.whiteplanet.mapper.ReceiveDetailMapper;
import com.whiteplanet.mapper.data.ClinicIncomeBean;
import com.whiteplanet.mapper.data.ReceiveCountBean;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 11:30 2018/6/27
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ReveiveServiceTest {

    @Autowired
    private ReceiveDetailMapper receiveDetailMapper;
    @Autowired
    private ClinicDealRecordMapper clinicDealRecordMapper;
    @Test
    public void selectReveiveDetail() {

        List<ReceiveCountBean> receiveCountBeans = receiveDetailMapper.selectReceiveCountById("2018-06-22 15:00:00", "2018-06-23 22:00:00");
        receiveCountBeans.forEach(receiveCountBean -> {
            List<String> strings = receiveDetailMapper.selectPatientNameByReveiveDocId(receiveCountBean.getReceiveDocId(),"2018-06-22 15:00:00", "2018-06-23 22:00:00");
            System.out.println(strings.toArray().toString());
        });

    }
    @Test
    public void selectClinicIncome() {
        List<ClinicIncomeBean> clinicIncomeBeans = clinicDealRecordMapper.selectClinicIncome("2018-06-12 16:53:10", "2018-06-15 16:53:10");
        System.out.println(clinicIncomeBeans);

    }
}
