package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "TABLESPACES")
public class Tablespaces {
    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "TABLESPACE_TYPE")
    private String tablespaceType;

    @Column(name = "LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @Column(name = "EXTENT_SIZE")
    private Long extentSize;

    @Column(name = "AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @Column(name = "MAXIMUM_SIZE")
    private Long maximumSize;

    @Column(name = "NODEGROUP_ID")
    private Long nodegroupId;

    @Column(name = "TABLESPACE_COMMENT")
    private String tablespaceComment;

    /**
     * @return TABLESPACE_NAME
     */
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * @param tablespaceName
     */
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    /**
     * @return ENGINE
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return TABLESPACE_TYPE
     */
    public String getTablespaceType() {
        return tablespaceType;
    }

    /**
     * @param tablespaceType
     */
    public void setTablespaceType(String tablespaceType) {
        this.tablespaceType = tablespaceType;
    }

    /**
     * @return LOGFILE_GROUP_NAME
     */
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    /**
     * @param logfileGroupName
     */
    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    /**
     * @return EXTENT_SIZE
     */
    public Long getExtentSize() {
        return extentSize;
    }

    /**
     * @param extentSize
     */
    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    /**
     * @return AUTOEXTEND_SIZE
     */
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    /**
     * @param autoextendSize
     */
    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    /**
     * @return MAXIMUM_SIZE
     */
    public Long getMaximumSize() {
        return maximumSize;
    }

    /**
     * @param maximumSize
     */
    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    /**
     * @return NODEGROUP_ID
     */
    public Long getNodegroupId() {
        return nodegroupId;
    }

    /**
     * @param nodegroupId
     */
    public void setNodegroupId(Long nodegroupId) {
        this.nodegroupId = nodegroupId;
    }

    /**
     * @return TABLESPACE_COMMENT
     */
    public String getTablespaceComment() {
        return tablespaceComment;
    }

    /**
     * @param tablespaceComment
     */
    public void setTablespaceComment(String tablespaceComment) {
        this.tablespaceComment = tablespaceComment;
    }
}