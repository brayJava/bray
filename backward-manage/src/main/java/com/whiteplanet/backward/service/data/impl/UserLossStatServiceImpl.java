package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.back.mapper.UserLossStatisticsMapper;
import com.whiteplanet.mapper.LoginStatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:wuzhiyuan
 * @description: 用户流失统计
 * @date: Created in 16:03 2018/4/18
 * @modified By:
 */
@Service
public class UserLossStatServiceImpl {

    @Autowired
    private LoginStatMapper loginStatMapper;
    @Autowired
    private UserLossStatisticsMapper userLossStatisticsMapper;

//    void user


}
