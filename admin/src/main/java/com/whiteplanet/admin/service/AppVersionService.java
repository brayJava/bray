package com.whiteplanet.admin.service;

import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.AppVersionBean;
import com.whiteplanet.mapper.data.AppVersionWithCont;
import com.whiteplanet.mapper.data.AppVersionWithContent;

public interface AppVersionService {
    /**
     * 查询最新app版本
     */
    AppVersionWithContent selectNewestAppVersion();
    /**
     * 查询所有版本记录
     * @return
     */
    PageInfo<AppVersionWithCont> selectAppversion(int pageNum, int pageSize);
    /**
     * 添加版本
     */
    void addAppVersionWithContent(AppVersionBean appVersionBean);
    /**
     * 删除版本
     */
    void delAppVersion(int verionID);
}
