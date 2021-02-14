package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "FILES")
public class Files {
    @Column(name = "FILE_ID")
    private Long fileId;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;

    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @Column(name = "LOGFILE_GROUP_NUMBER")
    private Long logfileGroupNumber;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "FREE_EXTENTS")
    private Long freeExtents;

    @Column(name = "TOTAL_EXTENTS")
    private Long totalExtents;

    @Column(name = "EXTENT_SIZE")
    private Long extentSize;

    @Column(name = "INITIAL_SIZE")
    private Long initialSize;

    @Column(name = "MAXIMUM_SIZE")
    private Long maximumSize;

    @Column(name = "AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "DATA_FREE")
    private Long dataFree;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "EXTRA")
    private String extra;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "TABLE_SCHEMA")
    private byte[] tableSchema;

    @Column(name = "TABLE_NAME")
    private byte[] tableName;

    @Column(name = "FULLTEXT_KEYS")
    private byte[] fulltextKeys;

    @Column(name = "DELETED_ROWS")
    private byte[] deletedRows;

    @Column(name = "UPDATE_COUNT")
    private byte[] updateCount;

    @Column(name = "CREATION_TIME")
    private byte[] creationTime;

    @Column(name = "LAST_UPDATE_TIME")
    private byte[] lastUpdateTime;

    @Column(name = "LAST_ACCESS_TIME")
    private byte[] lastAccessTime;

    @Column(name = "RECOVER_TIME")
    private byte[] recoverTime;

    @Column(name = "TRANSACTION_COUNTER")
    private byte[] transactionCounter;

    @Column(name = "TABLE_ROWS")
    private byte[] tableRows;

    @Column(name = "AVG_ROW_LENGTH")
    private byte[] avgRowLength;

    @Column(name = "DATA_LENGTH")
    private byte[] dataLength;

    @Column(name = "MAX_DATA_LENGTH")
    private byte[] maxDataLength;

    @Column(name = "INDEX_LENGTH")
    private byte[] indexLength;

    @Column(name = "CREATE_TIME")
    private byte[] createTime;

    @Column(name = "UPDATE_TIME")
    private byte[] updateTime;

    @Column(name = "CHECK_TIME")
    private byte[] checkTime;

    @Column(name = "CHECKSUM")
    private byte[] checksum;

    /**
     * @return FILE_ID
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * @return FILE_TYPE
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

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
     * @return LOGFILE_GROUP_NUMBER
     */
    public Long getLogfileGroupNumber() {
        return logfileGroupNumber;
    }

    /**
     * @param logfileGroupNumber
     */
    public void setLogfileGroupNumber(Long logfileGroupNumber) {
        this.logfileGroupNumber = logfileGroupNumber;
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
     * @return FREE_EXTENTS
     */
    public Long getFreeExtents() {
        return freeExtents;
    }

    /**
     * @param freeExtents
     */
    public void setFreeExtents(Long freeExtents) {
        this.freeExtents = freeExtents;
    }

    /**
     * @return TOTAL_EXTENTS
     */
    public Long getTotalExtents() {
        return totalExtents;
    }

    /**
     * @param totalExtents
     */
    public void setTotalExtents(Long totalExtents) {
        this.totalExtents = totalExtents;
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
     * @return INITIAL_SIZE
     */
    public Long getInitialSize() {
        return initialSize;
    }

    /**
     * @param initialSize
     */
    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
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
     * @return VERSION
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
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
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return EXTRA
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return TABLE_SCHEMA
     */
    public byte[] getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     */
    public void setTableSchema(byte[] tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return TABLE_NAME
     */
    public byte[] getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(byte[] tableName) {
        this.tableName = tableName;
    }

    /**
     * @return FULLTEXT_KEYS
     */
    public byte[] getFulltextKeys() {
        return fulltextKeys;
    }

    /**
     * @param fulltextKeys
     */
    public void setFulltextKeys(byte[] fulltextKeys) {
        this.fulltextKeys = fulltextKeys;
    }

    /**
     * @return DELETED_ROWS
     */
    public byte[] getDeletedRows() {
        return deletedRows;
    }

    /**
     * @param deletedRows
     */
    public void setDeletedRows(byte[] deletedRows) {
        this.deletedRows = deletedRows;
    }

    /**
     * @return UPDATE_COUNT
     */
    public byte[] getUpdateCount() {
        return updateCount;
    }

    /**
     * @param updateCount
     */
    public void setUpdateCount(byte[] updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * @return CREATION_TIME
     */
    public byte[] getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime
     */
    public void setCreationTime(byte[] creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return LAST_UPDATE_TIME
     */
    public byte[] getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(byte[] lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return LAST_ACCESS_TIME
     */
    public byte[] getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * @param lastAccessTime
     */
    public void setLastAccessTime(byte[] lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * @return RECOVER_TIME
     */
    public byte[] getRecoverTime() {
        return recoverTime;
    }

    /**
     * @param recoverTime
     */
    public void setRecoverTime(byte[] recoverTime) {
        this.recoverTime = recoverTime;
    }

    /**
     * @return TRANSACTION_COUNTER
     */
    public byte[] getTransactionCounter() {
        return transactionCounter;
    }

    /**
     * @param transactionCounter
     */
    public void setTransactionCounter(byte[] transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    /**
     * @return TABLE_ROWS
     */
    public byte[] getTableRows() {
        return tableRows;
    }

    /**
     * @param tableRows
     */
    public void setTableRows(byte[] tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * @return AVG_ROW_LENGTH
     */
    public byte[] getAvgRowLength() {
        return avgRowLength;
    }

    /**
     * @param avgRowLength
     */
    public void setAvgRowLength(byte[] avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    /**
     * @return DATA_LENGTH
     */
    public byte[] getDataLength() {
        return dataLength;
    }

    /**
     * @param dataLength
     */
    public void setDataLength(byte[] dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * @return MAX_DATA_LENGTH
     */
    public byte[] getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * @param maxDataLength
     */
    public void setMaxDataLength(byte[] maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    /**
     * @return INDEX_LENGTH
     */
    public byte[] getIndexLength() {
        return indexLength;
    }

    /**
     * @param indexLength
     */
    public void setIndexLength(byte[] indexLength) {
        this.indexLength = indexLength;
    }

    /**
     * @return CREATE_TIME
     */
    public byte[] getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(byte[] createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public byte[] getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(byte[] updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CHECK_TIME
     */
    public byte[] getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     */
    public void setCheckTime(byte[] checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return CHECKSUM
     */
    public byte[] getChecksum() {
        return checksum;
    }

    /**
     * @param checksum
     */
    public void setChecksum(byte[] checksum) {
        this.checksum = checksum;
    }
}