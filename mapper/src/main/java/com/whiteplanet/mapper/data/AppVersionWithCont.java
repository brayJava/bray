package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;

import java.util.List;

/**
 * @Author:wuzhiyuan
 * @Description:
 * @Date: Created in 15:46 2018/7/13
 * @Modified By:
 */
public class AppVersionWithCont extends AppVersion {

    List<AppVersionContent> appVersionContents;

    public List<AppVersionContent> getAppVersionContents() {
        return appVersionContents;
    }

    public void setAppVersionContents(List<AppVersionContent> appVersionContents) {
        this.appVersionContents = appVersionContents;
    }
}
