package com.whiteplanet.backward.service.total.impl;

import com.whiteplanet.back.mapper.UserLossStatisticsMapper;
import com.whiteplanet.mapper.LoginStatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**0
 * @author:wuzhiyuan
 * @description: 流失用户统计同步
 * @date: Created in 16:19 2018/4/18
 * @modified By:
 */
@Service
@Transactional
public class UserLossSyschronousServiceImpl {

    @Autowired
    private LoginStatMapper loginStatMapper;

    @Autowired
    private UserLossStatisticsMapper lossStatisticsMapper;


    void userLossSyschronous() {


    }



}
