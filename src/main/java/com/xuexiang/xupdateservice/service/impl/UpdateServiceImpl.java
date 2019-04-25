package com.xuexiang.xupdateservice.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuexiang.xupdateservice.api.response.PageData;
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
    public AppVersionInfo getLatestAppVersionInfo(int versionCode, String appKey) {
        List<AppVersionInfo> appInfos = getAllAppVersionInfo(appKey);

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
    public List<AppVersionInfo> getAllAppVersionInfo(String appKey) {
        Condition condition = new Condition(AppVersionInfo.class);
        condition.createCriteria().andEqualTo("appKey", appKey);
        condition.setOrderByClause("version_code desc"); //根据版本号降序
        return appVersionInfoMapper.selectByExample(condition);
    }

    @Override
    public List<AppVersionInfo> getAllAppVersionInfo() {
        return appVersionInfoMapper.selectAll();
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件PageHelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageData<AppVersionInfo> getAllAppVersionInfo(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageData<AppVersionInfo> pageData = new PageData<>();
        Page<AppVersionInfo> page = PageHelper.startPage(pageNum, pageSize);
        pageData.setArray(appVersionInfoMapper.selectAll());
        pageData.setPageNum(page.getPageNum())
                .setPageSize(page.getPageSize())
                .setTotal(page.getTotal());
        return pageData;
    }

    @Override
    public AppVersionInfo getAppVersionInfo(int versionCode, String appKey) {
        Condition condition = new Condition(AppVersionInfo.class);
        condition.createCriteria().andEqualTo("appKey", appKey)
                .andEqualTo("versionCode", versionCode);
        condition.setOrderByClause("version_code desc"); //根据版本号降序
        List<AppVersionInfo> list = appVersionInfoMapper.selectByExample(condition);
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
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

    @Override
    public boolean deleteAppVersionInfo(int versionId) {
        return appVersionInfoMapper.deleteByPrimaryKey(versionId) > 0;
    }
}
