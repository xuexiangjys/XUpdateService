package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "PROCESSLIST")
public class Processlist {
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER")
    private String user;

    @Column(name = "HOST")
    private String host;

    @Column(name = "DB")
    private String db;

    @Column(name = "COMMAND")
    private String command;

    @Column(name = "TIME")
    private Integer time;

    @Column(name = "STATE")
    private String state;

    @Column(name = "INFO")
    private String info;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return USER
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return HOST
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return DB
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return COMMAND
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return TIME
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return INFO
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }
}