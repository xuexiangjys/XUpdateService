package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FT_DEFAULT_STOPWORD")
public class InnodbFtDefaultStopword {
    private String value;

    /**
     * @return value
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