package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FT_CONFIG")
public class InnodbFtConfig {
    @Column(name = "KEY")
    private String key;

    @Column(name = "VALUE")
    private String value;

    /**
     * @return KEY
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return VALUE
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}