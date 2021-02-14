package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_TEMP_TABLE_INFO")
public class InnodbTempTableInfo {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "N_COLS")
    private Integer nCols;

    @Column(name = "SPACE")
    private Integer space;

    /**
     * @return TABLE_ID
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

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
     * @return N_COLS
     */
    public Integer getnCols() {
        return nCols;
    }

    /**
     * @param nCols
     */
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    /**
     * @return SPACE
     */
    public Integer getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(Integer space) {
        this.space = space;
    }
}