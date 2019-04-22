package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "login_name")
    private String loginName;

    private String password;

    private String nick;

    private String authority;

    private String avatar;

    private String phone;

    private String address;

    @Column(name = "register_time")
    private Date registerTime;

    public Integer getAccountId() {
        return accountId;
    }

    public Account setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getLoginName() {
        return loginName;
    }

    public Account setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getNick() {
        return nick;
    }

    public Account setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public String getAuthority() {
        return authority;
    }

    public Account setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public Account setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Account setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Account setAddress(String address) {
        this.address = address;
        return this;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public Account setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }
}