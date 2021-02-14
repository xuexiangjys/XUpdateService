package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FIELDS")
public class InnodbFields {
    @Column(name = "NAME")
    private String name;

    @Column(name = "POS")
    private Long pos;

    @Column(name = "INDEX_ID")
    private byte[] indexId;

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return POS
     */
    public Long getPos() {
        return pos;
    }

    /**
     * @param pos
     */
    public void setPos(Long pos) {
        this.pos = pos;
    }

    /**
     * @return INDEX_ID
     */
    public byte[] getIndexId() {
        return indexId;
    }

    /**
     * @param indexId
     */
    public void setIndexId(byte[] indexId) {
        this.indexId = indexId;
    }
}