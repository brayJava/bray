package com.whiteplanet.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.domain.enums.ModelType;
import com.whiteplanet.admin.dto.AppVersionBean;
import com.whiteplanet.admin.service.AppVersionService;
import com.whiteplanet.mapper.AppVersionContentMapper;
import com.whiteplanet.mapper.AppVersionMapper;
import com.whiteplanet.mapper.PhoneCodeMapper;
import com.whiteplanet.mapper.data.AppVersionWithCont;
import com.whiteplanet.mapper.data.AppVersionWithContent;
import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;
import com.whiteplanet.mapper.model.PhoneCode;
import org.apache.ibatis.session.SqlSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
/**
 * 查看最新时间版本更新
 */
@Service
@Transactional
public class AppVersionServiceImpl implements AppVersionService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AppVersionMapper appVersionMapper;
    @Autowired
    private AppVersionContentMapper appVersionContentMapper;
    @Autowired
    private PhoneCodeMapper phoneCodeMapper;
    /**
     * 查询最新版本更新时间
     */
    public AppVersionWithContent selectNewestAppVersion() {
        AppVersionWithContent appVersionWithContent = null;
        try {
            AppVersion appVersion = appVersionMapper.selectNewestAppVersion();
            if(!Objects.isNull(appVersion)) {
                appVersionWithContent = new AppVersionWithContent();
                appVersionWithContent.setAppVersion(appVersion);
                //查询版本内容
                List<AppVersionContent> appVersionContents = appVersionContentMapper.selectAppVersionContentByVersionID(appVersion.getId());
                List<AppVersionContent> appVersionContentWithAndroid = new ArrayList<>();
                List<AppVersionContent> appVersionContentWithIos = new ArrayList<>();
                appVersionContents.forEach(appVersionContent -> {
                    if(ModelType.ANDROID.getModelType().equals(appVersionContent.getType())) {
                        appVersionContentWithAndroid.add(appVersionContent);
                    } else if (ModelType.IOS.getModelType().equals(appVersionContent.getType())) {
                        appVersionContentWithIos.add(appVersionContent);
                    }
                });
                if(!CollectionUtils.isEmpty(appVersionContents)) {
                    appVersionWithContent.setAndroidContents(appVersionContentWithAndroid);
                    appVersionWithContent.setIosContents(appVersionContentWithIos);
                    return appVersionWithContent;
                }
                return appVersionWithContent;
            }
        } catch (SqlSessionException e) {
            logger.error(">>>>>>>>查询最新版本记录失败");
            e.printStackTrace();
        } catch (Exception ex) {
            logger.error(">>>>>>>>查询最新版本记录失败");
            ex.printStackTrace();
        }
        return new AppVersionWithContent();
    }
    /**
     * 查询所有版本记录
     * @return
     */
    public PageInfo<AppVersionWithCont> selectAppversion(int pageNum,int pageSize) {
        List<AppVersionWithCont> appVersionWithConts = new ArrayList<AppVersionWithCont>();
        PageInfo<AppVersionWithCont> appVersionPageInfo = null;
        try {
            //分页查询
            PageHelper.startPage(pageNum, pageSize);
            appVersionWithConts = appVersionMapper.selectAppVersions();
            appVersionPageInfo = new PageInfo<AppVersionWithCont>(CollectionUtils.isEmpty(appVersionWithConts) ?
            new ArrayList<>() : appVersionWithConts);
        } catch (SqlSessionException e) {
            logger.error(">>>>>>>>查询所有版本记录失败");
            e.printStackTrace();
        } catch (Exception ex) {
            logger.error(">>>>>>>>查询所有版本记录失败");
            ex.printStackTrace();
        }
        return appVersionPageInfo;
    }

    public PageInfo<PhoneCode> selectNewestSms(int pageNum,int pageSize) {
        //分页查询
        PageHelper.startPage(pageNum, pageSize);
        List<PhoneCode> phoneCodes = null;
        try {
            phoneCodes = phoneCodeMapper.selectNewestSms();
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<PhoneCode> phoneCodePageInfo = new PageInfo<>(phoneCodes);
        return phoneCodePageInfo;
    }

    /**
     * 添加版本和内容
     */
    public void addAppVersionWithContent(AppVersionBean appVersionBean){
        try {
            //版本信息添加
            appVersionMapper.insertSelective(appVersionBean.getAppVersion(appVersionBean));
            List<AppVersionContent> appVersionContents = getAppVersionContents(appVersionBean);
            //更新版本内容批量插入
            appVersionContentMapper.insertBatch(appVersionContents);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>app版本信息添加失败");
            e.printStackTrace();
        }
    }
    /**
     * 删除版本
     * @param versionID
     */
    public void delAppVersion(int versionID) {
        try {
            appVersionMapper.deleteByPrimaryKey(versionID);
        } catch (Exception e) {
            logger.error("删除版本异常");
            e.printStackTrace();
        }
    }
    //设置内容
    private List<AppVersionContent> getAppVersionContents(AppVersionBean appVersionBean) {
        AppVersion appVersion = appVersionMapper.selectNewestAppVersion();
        List<AppVersionContent> appVersionContents = new ArrayList<>();
        for (String contentAndroid : appVersionBean.getContentAndroid()) {
            AppVersionContent appVersionContent = new AppVersionContent();
            appVersionContent.setAppVersionId(appVersion.getId());
            appVersionContent.setContent(contentAndroid);
            appVersionContent.setCreateTime(new Date());
            appVersionContent.setUpdateTime(new Date());
            appVersionContent.setType(ModelType.ANDROID.getModelType());
            appVersionContents.add(appVersionContent);
        }
        for (String contentIos : appVersionBean.getContentIos()) {
            AppVersionContent appVersionContent = new AppVersionContent();
            appVersionContent.setAppVersionId(appVersion.getId());
            appVersionContent.setContent(contentIos);
            appVersionContent.setCreateTime(new Date());
            appVersionContent.setUpdateTime(new Date());
            appVersionContent.setType(ModelType.IOS.getModelType());
            appVersionContents.add(appVersionContent);
        }
        return appVersionContents;
    }
}