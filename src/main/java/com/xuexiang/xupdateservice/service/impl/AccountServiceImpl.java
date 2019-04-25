package com.xuexiang.xupdateservice.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuexiang.xupdateservice.api.response.PageData;
import com.xuexiang.xupdateservice.mapper.AccountMapper;
import com.xuexiang.xupdateservice.model.Account;
import com.xuexiang.xupdateservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import java.util.List;

/**
 *
 *
 * @author xuexiang
 * @since 2019/4/21 上午12:11
 */
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public PageData<Account> getAllAccount(int pageNum, int pageSize) {
        PageData<Account> pageData = new PageData<>();
        Page<Account> page = PageHelper.startPage(pageNum, pageSize);
        pageData.setArray(accountMapper.selectAll());
        pageData.setPageNum(page.getPageNum())
                .setPageSize(page.getPageSize())
                .setTotal(page.getTotal());
        return pageData;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountMapper.selectAll();
    }

    @Override
    public boolean updateAccount(Account account) {
        return accountMapper.updateByPrimaryKeySelective(account) > 0;
    }

    @Override
    public boolean deleteAccount(int accountId) {
        return accountMapper.deleteByPrimaryKey(accountId) > 0;
    }

    @Override
    public boolean registerAccount(Account account) {
        return accountMapper.insert(account) > 0;
    }

    @Override
    public Account checkAccount(String loginName) {
        Condition condition = new Condition(Account.class);
        condition.createCriteria().andEqualTo("loginName", loginName);
        return selectFirstAccountByCondition(condition);
    }

    @Override
    public Account loginAccount(String loginName, String password) {
        Condition condition = new Condition(Account.class);
        condition.createCriteria().andEqualTo("loginName", loginName)
                .andEqualTo("password", password);
        return selectFirstAccountByCondition(condition);
    }

    private Account selectFirstAccountByCondition(Condition condition) {
        List<Account> list = accountMapper.selectByExample(condition);
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
