package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_BUFFER_PAGE")
public class InnodbBufferPage {
    @Column(name = "POOL_ID")
    private Long poolId;

    @Column(name = "BLOCK_ID")
    private Long blockId;

    @Column(name = "SPACE")
    private Long space;

    @Column(name = "PAGE_NUMBER")
    private Long pageNumber;

    @Column(name = "PAGE_TYPE")
    private String pageType;

    @Column(name = "FLUSH_TYPE")
    private Long flushType;

    @Column(name = "FIX_COUNT")
    private Long fixCount;

    @Column(name = "IS_HASHED")
    private String isHashed;

    @Column(name = "NEWEST_MODIFICATION")
    private Long newestModification;

    @Column(name = "OLDEST_MODIFICATION")
    private Long oldestModification;

    @Column(name = "ACCESS_TIME")
    private Long accessTime;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "INDEX_NAME")
    private String indexName;

    @Column(name = "NUMBER_RECORDS")
    private Long numberRecords;

    @Column(name = "DATA_SIZE")
    private Long dataSize;

    @Column(name = "COMPRESSED_SIZE")
    private Long compressedSize;

    @Column(name = "PAGE_STATE")
    private String pageState;

    @Column(name = "IO_FIX")
    private String ioFix;

    @Column(name = "IS_OLD")
    private String isOld;

    @Column(name = "FREE_PAGE_CLOCK")
    private Long freePageClock;

    /**
     * @return POOL_ID
     */
    public Long getPoolId() {
        return poolId;
    }

    /**
     * @param poolId
     */
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    /**
     * @return BLOCK_ID
     */
    public Long getBlockId() {
        return blockId;
    }

    /**
     * @param blockId
     */
    public void setBlockId(Long blockId) {
        this.blockId = blockId;
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
     * @return PAGE_NUMBER
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return PAGE_TYPE
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * @param pageType
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * @return FLUSH_TYPE
     */
    public Long getFlushType() {
        return flushType;
    }

    /**
     * @param flushType
     */
    public void setFlushType(Long flushType) {
        this.flushType = flushType;
    }

    /**
     * @return FIX_COUNT
     */
    public Long getFixCount() {
        return fixCount;
    }

    /**
     * @param fixCount
     */
    public void setFixCount(Long fixCount) {
        this.fixCount = fixCount;
    }

    /**
     * @return IS_HASHED
     */
    public String getIsHashed() {
        return isHashed;
    }

    /**
     * @param isHashed
     */
    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed;
    }

    /**
     * @return NEWEST_MODIFICATION
     */
    public Long getNewestModification() {
        return newestModification;
    }

    /**
     * @param newestModification
     */
    public void setNewestModification(Long newestModification) {
        this.newestModification = newestModification;
    }

    /**
     * @return OLDEST_MODIFICATION
     */
    public Long getOldestModification() {
        return oldestModification;
    }

    /**
     * @param oldestModification
     */
    public void setOldestModification(Long oldestModification) {
        this.oldestModification = oldestModification;
    }

    /**
     * @return ACCESS_TIME
     */
    public Long getAccessTime() {
        return accessTime;
    }

    /**
     * @param accessTime
     */
    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
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
     * @return INDEX_NAME
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return NUMBER_RECORDS
     */
    public Long getNumberRecords() {
        return numberRecords;
    }

    /**
     * @param numberRecords
     */
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * @return DATA_SIZE
     */
    public Long getDataSize() {
        return dataSize;
    }

    /**
     * @param dataSize
     */
    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * @return COMPRESSED_SIZE
     */
    public Long getCompressedSize() {
        return compressedSize;
    }

    /**
     * @param compressedSize
     */
    public void setCompressedSize(Long compressedSize) {
        this.compressedSize = compressedSize;
    }

    /**
     * @return PAGE_STATE
     */
    public String getPageState() {
        return pageState;
    }

    /**
     * @param pageState
     */
    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    /**
     * @return IO_FIX
     */
    public String getIoFix() {
        return ioFix;
    }

    /**
     * @param ioFix
     */
    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    /**
     * @return IS_OLD
     */
    public String getIsOld() {
        return isOld;
    }

    /**
     * @param isOld
     */
    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    /**
     * @return FREE_PAGE_CLOCK
     */
    public Long getFreePageClock() {
        return freePageClock;
    }

    /**
     * @param freePageClock
     */
    public void setFreePageClock(Long freePageClock) {
        this.freePageClock = freePageClock;
    }
}