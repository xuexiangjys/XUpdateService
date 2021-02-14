package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TABLES")
public class Tables {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "TABLE_TYPE")
    private String tableType;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "TABLE_ROWS")
    private Long tableRows;

    @Column(name = "AVG_ROW_LENGTH")
    private Long avgRowLength;

    @Column(name = "DATA_LENGTH")
    private Long dataLength;

    @Column(name = "MAX_DATA_LENGTH")
    private Long maxDataLength;

    @Column(name = "INDEX_LENGTH")
    private Long indexLength;

    @Column(name = "DATA_FREE")
    private Long dataFree;

    @Column(name = "AUTO_INCREMENT")
    private Long autoIncrement;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CHECK_TIME")
    private Date checkTime;

    @Column(name = "TABLE_COLLATION")
    private String tableCollation;

    @Column(name = "CHECKSUM")
    private Long checksum;

    @Column(name = "CREATE_OPTIONS")
    private String createOptions;

    @Column(name = "TABLE_COMMENT")
    private String tableComment;

    /**
     * @return TABLE_CATALOG
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * @param tableCatalog
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * @return TABLE_SCHEMA
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return TABLE_TYPE
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * @param tableType
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
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
     * @return VERSION
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * @return TABLE_ROWS
     */
    public Long getTableRows() {
        return tableRows;
    }

    /**
     * @param tableRows
     */
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * @return AVG_ROW_LENGTH
     */
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    /**
     * @param avgRowLength
     */
    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    /**
     * @return DATA_LENGTH
     */
    public Long getDataLength() {
        return dataLength;
    }

    /**
     * @param dataLength
     */
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * @return MAX_DATA_LENGTH
     */
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * @param maxDataLength
     */
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    /**
     * @return INDEX_LENGTH
     */
    public Long getIndexLength() {
        return indexLength;
    }

    /**
     * @param indexLength
     */
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    /**
     * @return DATA_FREE
     */
    public Long getDataFree() {
        return dataFree;
    }

    /**
     * @param dataFree
     */
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    /**
     * @return AUTO_INCREMENT
     */
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * @param autoIncrement
     */
    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CHECK_TIME
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return TABLE_COLLATION
     */
    public String getTableCollation() {
        return tableCollation;
    }

    /**
     * @param tableCollation
     */
    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    /**
     * @return CHECKSUM
     */
    public Long getChecksum() {
        return checksum;
    }

    /**
     * @param checksum
     */
    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    /**
     * @return CREATE_OPTIONS
     */
    public String getCreateOptions() {
        return createOptions;
    }

    /**
     * @param createOptions
     */
    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    /**
     * @return TABLE_COMMENT
     */
    public String getTableComment() {
        return tableComment;
    }

    /**
     * @param tableComment
     */
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }
}