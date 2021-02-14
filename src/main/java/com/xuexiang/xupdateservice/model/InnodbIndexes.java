package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_INDEXES")
public class InnodbIndexes {
    @Column(name = "INDEX_ID")
    private Long indexId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "N_FIELDS")
    private Integer nFields;

    @Column(name = "PAGE_NO")
    private Integer pageNo;

    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "MERGE_THRESHOLD")
    private Integer mergeThreshold;

    /**
     * @return INDEX_ID
     */
    public Long getIndexId() {
        return indexId;
    }

    /**
     * @param indexId
     */
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
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
     * @return TYPE
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return N_FIELDS
     */
    public Integer getnFields() {
        return nFields;
    }

    /**
     * @param nFields
     */
    public void setnFields(Integer nFields) {
        this.nFields = nFields;
    }

    /**
     * @return PAGE_NO
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * @param pageNo
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
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

    /**
     * @return MERGE_THRESHOLD
     */
    public Integer getMergeThreshold() {
        return mergeThreshold;
    }

    /**
     * @param mergeThreshold
     */
    public void setMergeThreshold(Integer mergeThreshold) {
        this.mergeThreshold = mergeThreshold;
    }
}