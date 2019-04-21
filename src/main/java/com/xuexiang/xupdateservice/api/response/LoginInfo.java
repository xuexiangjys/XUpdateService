package com.xuexiang.xupdateservice.api.response;

import com.xuexiang.xupdateservice.model.Account;

/**
 * @author xuexiang
 * @since 2018/8/6 下午6:14
 */
public class LoginInfo {

    private Account account;

    private String token;

    public Account getUser() {
        return account;
    }

    public LoginInfo setUser(Account account) {
        this.account = account;
        return this;
    }

    public String getToken() {
        return token;
    }

    public LoginInfo setToken(String token) {
        this.token = token;
        return this;
    }
}
