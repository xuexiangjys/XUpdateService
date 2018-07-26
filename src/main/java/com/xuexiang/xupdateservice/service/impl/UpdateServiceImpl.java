package com.xuexiang.xupdateservice.service.impl;

import com.xuexiang.xupdateservice.mapper.AppVersionInfoMapper;
import com.xuexiang.xupdateservice.model.AppVersionInfo;
import com.xuexiang.xupdateservice.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * 版本更新服务
 *
 * @author xuexiang
 * @since 2018/7/26 上午11:58
 */
@Service(value = "updateService")
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    private AppVersionInfoMapper appVersionInfoMapper;//这里会报错，但是并不会影响

    @Override
    public AppVersionInfo getAppVersionInfo(int versionCode, String appKey) {
        Condition condition = new Condition(AppVersionInfo.class);
        condition.createCriteria().andEqualTo("appKey", appKey);
        condition.setOrderByClause("version_code desc"); //根据版本号降序
        List<AppVersionInfo> appInfos = appVersionInfoMapper.selectByExample(condition);

        if (appInfos.size() > 0) {
            AppVersionInfo appVersionInfo = appInfos.get(0); //获取到最新的版本
            if (appVersionInfo.getVersionCode() > versionCode) { //最新版本大，需要更新
                return appVersionInfo;
            } else {
                return new AppVersionInfo().setUpdateStatus(UpdateService.NO_NEW_VERSION);
            }
        } else {
            return new AppVersionInfo().setUpdateStatus(UpdateService.NO_NEW_VERSION);
        }
    }

    @Override
    public boolean addAppVersionInfo(AppVersionInfo appVersionInfo) {
        return appVersionInfoMapper.insert(appVersionInfo) > 0;
    }

    @Override
    public boolean updateAppVersionInfo(AppVersionInfo appVersionInfo) {
        return appVersionInfoMapper.updateByPrimaryKeySelective(appVersionInfo) > 0;
    }
}
