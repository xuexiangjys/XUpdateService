package com.xuexiang.xupdateservice.service;

import com.xuexiang.xupdateservice.api.response.PageData;
import com.xuexiang.xupdateservice.model.Account;

import java.util.List;

/**
 * 账户管理服务
 *
 * @author xuexiang
 * @since 2019/4/20 下午11:55
 */
public interface AccountService {

    /**
     * 分页查询查询所有账户信息
     *
     * @param pageNum 开始的页数
     * @param pageSize 每页的数量
     * @return
     */
    PageData<Account> getAllAccount(int pageNum, int pageSize);

    /**
     * 查询所有账户信息
     *
     * @return
     */
    List<Account> getAllAccount();


    /**
     * 更新账户信息
     *
     * @param account
     * @return
     */
    boolean updateAccount(Account account);

    /**
     * 删除账户信息
     *
     * @param accountId
     * @return
     */
    boolean deleteAccount(int accountId);

    /**
     * 注册账户
     *
     * @param account
     * @return
     */
    boolean registerAccount(Account account);

    /**
     * 检测账户是否存在
     * @param loginName
     * @return
     */
    Account checkAccount(String loginName);

    /**
     * 登陆账户
     * @param loginName
     * @param password
     * @return
     */
    Account loginAccount(String loginName, String password);

}
