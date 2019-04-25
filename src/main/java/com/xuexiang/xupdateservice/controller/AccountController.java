package com.xuexiang.xupdateservice.controller;

import com.xuexiang.xupdateservice.api.request.PageQuery;
import com.xuexiang.xupdateservice.api.response.ApiResult;
import com.xuexiang.xupdateservice.api.response.LoginInfo;
import com.xuexiang.xupdateservice.component.annotation.CurrentAccount;
import com.xuexiang.xupdateservice.component.annotation.LoginRequired;
import com.xuexiang.xupdateservice.exception.ApiException;
import com.xuexiang.xupdateservice.model.Account;
import com.xuexiang.xupdateservice.service.AccountService;
import com.xuexiang.xupdateservice.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.xuexiang.xupdateservice.exception.ApiException.ERROR.COMMON_BUSINESS_ERROR;

/**
 * 账户管理服务api
 *
 * @author xuexiang
 * @since 2019/4/21 上午12:24
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ResponseBody
    @RequestMapping(value = "/accountPageQuery", method = RequestMethod.POST)
    public ApiResult pageQueryAccounts(@RequestBody PageQuery pageQuery) throws Exception {
        return new ApiResult<>().setData(accountService.getAllAccount(pageQuery.pageNum, pageQuery.pageSize));
    }

    @ResponseBody
    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public ApiResult getAllAccount() throws Exception {
        return new ApiResult<>().setData(accountService.getAllAccount());
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ApiResult login(@RequestBody Account account) throws Exception {
        if (accountService.checkAccount(account.getLoginName()) == null) {
            throw new ApiException("账号不存在！", COMMON_BUSINESS_ERROR);
        }
        Account user = accountService.loginAccount(account.getLoginName(), account.getPassword());
        if (user != null) {
            ApiResult<LoginInfo> apiResult = new ApiResult<>();
            apiResult.setData(new LoginInfo()
                    .setUser(user)
                    .setToken(TokenUtils.createJwtToken(user.getLoginName())));
            return apiResult;
        } else {
            throw new ApiException("用户名或密码错误！", COMMON_BUSINESS_ERROR);
        }
    }

    @LoginRequired
    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ApiResult getCurrentAccount(@CurrentAccount Account account) throws Exception {
        return new ApiResult<Account>().setData(account);
    }

    @LoginRequired
    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ApiResult logout() throws Exception {
        //清理用户数据
        return new ApiResult<Boolean>().setData(true);
    }

    @ResponseBody
    @RequestMapping(value = "/checkExist", method = RequestMethod.POST)
    public ApiResult checkAccountExist(String loginName) throws Exception {
        return new ApiResult<Boolean>().setData(accountService.checkAccount(loginName) != null);
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResult register(@RequestBody Account account) throws Exception {
        if (accountService.checkAccount(account.getLoginName()) != null) {
            throw new ApiException("账号已存在！", COMMON_BUSINESS_ERROR);
        }
        account.setRegisterTime(new Date());
        return new ApiResult<Boolean>().setData(accountService.registerAccount(account));
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public ApiResult deleteAccount(@RequestBody Account account) throws Exception {
        return new ApiResult<Boolean>().setData(accountService.deleteAccount(account.getAccountId()));
    }

    @ResponseBody
    @RequestMapping(value = "/updateInfo")
    public ApiResult updateAccountInfo(@RequestBody Account account) throws Exception {
        return new ApiResult<Boolean>().setData(accountService.updateAccount(account));
    }


}
