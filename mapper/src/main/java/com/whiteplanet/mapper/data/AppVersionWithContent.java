package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;
import java.util.List;

public class AppVersionWithContent {

    private AppVersion appVersion;

    private List<AppVersionContent> androidContents;

    private List<AppVersionContent> iosContents;

    public List<AppVersionContent> getAndroidContents() {
        return androidContents;
    }

    public void setAndroidContents(List<AppVersionContent> androidContents) {
        this.androidContents = androidContents;
    }

    public List<AppVersionContent> getIosContents() {
        return iosContents;
    }

    public void setIosContents(List<AppVersionContent> iosContents) {
        this.iosContents = iosContents;
    }

    public AppVersion getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }
}
