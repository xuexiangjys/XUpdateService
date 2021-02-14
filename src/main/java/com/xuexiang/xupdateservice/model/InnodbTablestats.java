package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_TABLESTATS")
public class InnodbTablestats {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATS_INITIALIZED")
    private String statsInitialized;

    @Column(name = "NUM_ROWS")
    private Long numRows;

    @Column(name = "CLUST_INDEX_SIZE")
    private Long clustIndexSize;

    @Column(name = "OTHER_INDEX_SIZE")
    private Long otherIndexSize;

    @Column(name = "MODIFIED_COUNTER")
    private Long modifiedCounter;

    @Column(name = "AUTOINC")
    private Long autoinc;

    @Column(name = "REF_COUNT")
    private Integer refCount;

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
     * @return STATS_INITIALIZED
     */
    public String getStatsInitialized() {
        return statsInitialized;
    }

    /**
     * @param statsInitialized
     */
    public void setStatsInitialized(String statsInitialized) {
        this.statsInitialized = statsInitialized;
    }

    /**
     * @return NUM_ROWS
     */
    public Long getNumRows() {
        return numRows;
    }

    /**
     * @param numRows
     */
    public void setNumRows(Long numRows) {
        this.numRows = numRows;
    }

    /**
     * @return CLUST_INDEX_SIZE
     */
    public Long getClustIndexSize() {
        return clustIndexSize;
    }

    /**
     * @param clustIndexSize
     */
    public void setClustIndexSize(Long clustIndexSize) {
        this.clustIndexSize = clustIndexSize;
    }

    /**
     * @return OTHER_INDEX_SIZE
     */
    public Long getOtherIndexSize() {
        return otherIndexSize;
    }

    /**
     * @param otherIndexSize
     */
    public void setOtherIndexSize(Long otherIndexSize) {
        this.otherIndexSize = otherIndexSize;
    }

    /**
     * @return MODIFIED_COUNTER
     */
    public Long getModifiedCounter() {
        return modifiedCounter;
    }

    /**
     * @param modifiedCounter
     */
    public void setModifiedCounter(Long modifiedCounter) {
        this.modifiedCounter = modifiedCounter;
    }

    /**
     * @return AUTOINC
     */
    public Long getAutoinc() {
        return autoinc;
    }

    /**
     * @param autoinc
     */
    public void setAutoinc(Long autoinc) {
        this.autoinc = autoinc;
    }

    /**
     * @return REF_COUNT
     */
    public Integer getRefCount() {
        return refCount;
    }

    /**
     * @param refCount
     */
    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }
}