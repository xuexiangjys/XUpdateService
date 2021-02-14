package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FOREIGN")
public class InnodbForeign {
    @Column(name = "ID")
    private String id;

    @Column(name = "FOR_NAME")
    private String forName;

    @Column(name = "REF_NAME")
    private String refName;

    @Column(name = "N_COLS")
    private Long nCols;

    @Column(name = "TYPE")
    private Long type;

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
     * @return FOR_NAME
     */
    public String getForName() {
        return forName;
    }

    /**
     * @param forName
     */
    public void setForName(String forName) {
        this.forName = forName;
    }

    /**
     * @return REF_NAME
     */
    public String getRefName() {
        return refName;
    }

    /**
     * @param refName
     */
    public void setRefName(String refName) {
        this.refName = refName;
    }

    /**
     * @return N_COLS
     */
    public Long getnCols() {
        return nCols;
    }

    /**
     * @param nCols
     */
    public void setnCols(Long nCols) {
        this.nCols = nCols;
    }

    /**
     * @return TYPE
     */
    public Long getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Long type) {
        this.type = type;
    }
}