package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_TABLES")
public class InnodbTables {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FLAG")
    private Integer flag;

    @Column(name = "N_COLS")
    private Integer nCols;

    @Column(name = "SPACE")
    private Long space;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @Column(name = "SPACE_TYPE")
    private String spaceType;

    @Column(name = "INSTANT_COLS")
    private Integer instantCols;

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
     * @return FLAG
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
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
    public Long getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(Long space) {
        this.space = space;
    }

    /**
     * @return ROW_FORMAT
     */
    public String getRowFormat() {
        return rowFormat;
    }

    /**
     * @param rowFormat
     */
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    /**
     * @return ZIP_PAGE_SIZE
     */
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    /**
     * @param zipPageSize
     */
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    /**
     * @return SPACE_TYPE
     */
    public String getSpaceType() {
        return spaceType;
    }

    /**
     * @param spaceType
     */
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    /**
     * @return INSTANT_COLS
     */
    public Integer getInstantCols() {
        return instantCols;
    }

    /**
     * @param instantCols
     */
    public void setInstantCols(Integer instantCols) {
        this.instantCols = instantCols;
    }
}