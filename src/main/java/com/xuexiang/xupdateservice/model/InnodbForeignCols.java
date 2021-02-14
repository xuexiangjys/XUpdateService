package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FOREIGN_COLS")
public class InnodbForeignCols {
    @Column(name = "ID")
    private String id;

    @Column(name = "FOR_COL_NAME")
    private String forColName;

    @Column(name = "REF_COL_NAME")
    private String refColName;

    @Column(name = "POS")
    private Integer pos;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return FOR_COL_NAME
     */
    public String getForColName() {
        return forColName;
    }

    /**
     * @param forColName
     */
    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    /**
     * @return REF_COL_NAME
     */
    public String getRefColName() {
        return refColName;
    }

    /**
     * @param refColName
     */
    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    /**
     * @return POS
     */
    public Integer getPos() {
        return pos;
    }

    /**
     * @param pos
     */
    public void setPos(Integer pos) {
        this.pos = pos;
    }
}