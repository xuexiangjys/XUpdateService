package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_BUFFER_POOL_STATS")
public class InnodbBufferPoolStats {
    @Column(name = "POOL_ID")
    private Long poolId;

    @Column(name = "POOL_SIZE")
    private Long poolSize;

    @Column(name = "FREE_BUFFERS")
    private Long freeBuffers;

    @Column(name = "DATABASE_PAGES")
    private Long databasePages;

    @Column(name = "OLD_DATABASE_PAGES")
    private Long oldDatabasePages;

    @Column(name = "MODIFIED_DATABASE_PAGES")
    private Long modifiedDatabasePages;

    @Column(name = "PENDING_DECOMPRESS")
    private Long pendingDecompress;

    @Column(name = "PENDING_READS")
    private Long pendingReads;

    @Column(name = "PENDING_FLUSH_LRU")
    private Long pendingFlushLru;

    @Column(name = "PENDING_FLUSH_LIST")
    private Long pendingFlushList;

    @Column(name = "PAGES_MADE_YOUNG")
    private Long pagesMadeYoung;

    @Column(name = "PAGES_NOT_MADE_YOUNG")
    private Long pagesNotMadeYoung;

    @Column(name = "PAGES_MADE_YOUNG_RATE")
    private Float pagesMadeYoungRate;

    @Column(name = "PAGES_MADE_NOT_YOUNG_RATE")
    private Float pagesMadeNotYoungRate;

    @Column(name = "NUMBER_PAGES_READ")
    private Long numberPagesRead;

    @Column(name = "NUMBER_PAGES_CREATED")
    private Long numberPagesCreated;

    @Column(name = "NUMBER_PAGES_WRITTEN")
    private Long numberPagesWritten;

    @Column(name = "PAGES_READ_RATE")
    private Float pagesReadRate;

    @Column(name = "PAGES_CREATE_RATE")
    private Float pagesCreateRate;

    @Column(name = "PAGES_WRITTEN_RATE")
    private Float pagesWrittenRate;

    @Column(name = "NUMBER_PAGES_GET")
    private Long numberPagesGet;

    @Column(name = "HIT_RATE")
    private Long hitRate;

    @Column(name = "YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long youngMakePerThousandGets;

    @Column(name = "NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long notYoungMakePerThousandGets;

    @Column(name = "NUMBER_PAGES_READ_AHEAD")
    private Long numberPagesReadAhead;

    @Column(name = "NUMBER_READ_AHEAD_EVICTED")
    private Long numberReadAheadEvicted;

    @Column(name = "READ_AHEAD_RATE")
    private Float readAheadRate;

    @Column(name = "READ_AHEAD_EVICTED_RATE")
    private Float readAheadEvictedRate;

    @Column(name = "LRU_IO_TOTAL")
    private Long lruIoTotal;

    @Column(name = "LRU_IO_CURRENT")
    private Long lruIoCurrent;

    @Column(name = "UNCOMPRESS_TOTAL")
    private Long uncompressTotal;

    @Column(name = "UNCOMPRESS_CURRENT")
    private Long uncompressCurrent;

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
     * @return POOL_SIZE
     */
    public Long getPoolSize() {
        return poolSize;
    }

    /**
     * @param poolSize
     */
    public void setPoolSize(Long poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * @return FREE_BUFFERS
     */
    public Long getFreeBuffers() {
        return freeBuffers;
    }

    /**
     * @param freeBuffers
     */
    public void setFreeBuffers(Long freeBuffers) {
        this.freeBuffers = freeBuffers;
    }

    /**
     * @return DATABASE_PAGES
     */
    public Long getDatabasePages() {
        return databasePages;
    }

    /**
     * @param databasePages
     */
    public void setDatabasePages(Long databasePages) {
        this.databasePages = databasePages;
    }

    /**
     * @return OLD_DATABASE_PAGES
     */
    public Long getOldDatabasePages() {
        return oldDatabasePages;
    }

    /**
     * @param oldDatabasePages
     */
    public void setOldDatabasePages(Long oldDatabasePages) {
        this.oldDatabasePages = oldDatabasePages;
    }

    /**
     * @return MODIFIED_DATABASE_PAGES
     */
    public Long getModifiedDatabasePages() {
        return modifiedDatabasePages;
    }

    /**
     * @param modifiedDatabasePages
     */
    public void setModifiedDatabasePages(Long modifiedDatabasePages) {
        this.modifiedDatabasePages = modifiedDatabasePages;
    }

    /**
     * @return PENDING_DECOMPRESS
     */
    public Long getPendingDecompress() {
        return pendingDecompress;
    }

    /**
     * @param pendingDecompress
     */
    public void setPendingDecompress(Long pendingDecompress) {
        this.pendingDecompress = pendingDecompress;
    }

    /**
     * @return PENDING_READS
     */
    public Long getPendingReads() {
        return pendingReads;
    }

    /**
     * @param pendingReads
     */
    public void setPendingReads(Long pendingReads) {
        this.pendingReads = pendingReads;
    }

    /**
     * @return PENDING_FLUSH_LRU
     */
    public Long getPendingFlushLru() {
        return pendingFlushLru;
    }

    /**
     * @param pendingFlushLru
     */
    public void setPendingFlushLru(Long pendingFlushLru) {
        this.pendingFlushLru = pendingFlushLru;
    }

    /**
     * @return PENDING_FLUSH_LIST
     */
    public Long getPendingFlushList() {
        return pendingFlushList;
    }

    /**
     * @param pendingFlushList
     */
    public void setPendingFlushList(Long pendingFlushList) {
        this.pendingFlushList = pendingFlushList;
    }

    /**
     * @return PAGES_MADE_YOUNG
     */
    public Long getPagesMadeYoung() {
        return pagesMadeYoung;
    }

    /**
     * @param pagesMadeYoung
     */
    public void setPagesMadeYoung(Long pagesMadeYoung) {
        this.pagesMadeYoung = pagesMadeYoung;
    }

    /**
     * @return PAGES_NOT_MADE_YOUNG
     */
    public Long getPagesNotMadeYoung() {
        return pagesNotMadeYoung;
    }

    /**
     * @param pagesNotMadeYoung
     */
    public void setPagesNotMadeYoung(Long pagesNotMadeYoung) {
        this.pagesNotMadeYoung = pagesNotMadeYoung;
    }

    /**
     * @return PAGES_MADE_YOUNG_RATE
     */
    public Float getPagesMadeYoungRate() {
        return pagesMadeYoungRate;
    }

    /**
     * @param pagesMadeYoungRate
     */
    public void setPagesMadeYoungRate(Float pagesMadeYoungRate) {
        this.pagesMadeYoungRate = pagesMadeYoungRate;
    }

    /**
     * @return PAGES_MADE_NOT_YOUNG_RATE
     */
    public Float getPagesMadeNotYoungRate() {
        return pagesMadeNotYoungRate;
    }

    /**
     * @param pagesMadeNotYoungRate
     */
    public void setPagesMadeNotYoungRate(Float pagesMadeNotYoungRate) {
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
    }

    /**
     * @return NUMBER_PAGES_READ
     */
    public Long getNumberPagesRead() {
        return numberPagesRead;
    }

    /**
     * @param numberPagesRead
     */
    public void setNumberPagesRead(Long numberPagesRead) {
        this.numberPagesRead = numberPagesRead;
    }

    /**
     * @return NUMBER_PAGES_CREATED
     */
    public Long getNumberPagesCreated() {
        return numberPagesCreated;
    }

    /**
     * @param numberPagesCreated
     */
    public void setNumberPagesCreated(Long numberPagesCreated) {
        this.numberPagesCreated = numberPagesCreated;
    }

    /**
     * @return NUMBER_PAGES_WRITTEN
     */
    public Long getNumberPagesWritten() {
        return numberPagesWritten;
    }

    /**
     * @param numberPagesWritten
     */
    public void setNumberPagesWritten(Long numberPagesWritten) {
        this.numberPagesWritten = numberPagesWritten;
    }

    /**
     * @return PAGES_READ_RATE
     */
    public Float getPagesReadRate() {
        return pagesReadRate;
    }

    /**
     * @param pagesReadRate
     */
    public void setPagesReadRate(Float pagesReadRate) {
        this.pagesReadRate = pagesReadRate;
    }

    /**
     * @return PAGES_CREATE_RATE
     */
    public Float getPagesCreateRate() {
        return pagesCreateRate;
    }

    /**
     * @param pagesCreateRate
     */
    public void setPagesCreateRate(Float pagesCreateRate) {
        this.pagesCreateRate = pagesCreateRate;
    }

    /**
     * @return PAGES_WRITTEN_RATE
     */
    public Float getPagesWrittenRate() {
        return pagesWrittenRate;
    }

    /**
     * @param pagesWrittenRate
     */
    public void setPagesWrittenRate(Float pagesWrittenRate) {
        this.pagesWrittenRate = pagesWrittenRate;
    }

    /**
     * @return NUMBER_PAGES_GET
     */
    public Long getNumberPagesGet() {
        return numberPagesGet;
    }

    /**
     * @param numberPagesGet
     */
    public void setNumberPagesGet(Long numberPagesGet) {
        this.numberPagesGet = numberPagesGet;
    }

    /**
     * @return HIT_RATE
     */
    public Long getHitRate() {
        return hitRate;
    }

    /**
     * @param hitRate
     */
    public void setHitRate(Long hitRate) {
        this.hitRate = hitRate;
    }

    /**
     * @return YOUNG_MAKE_PER_THOUSAND_GETS
     */
    public Long getYoungMakePerThousandGets() {
        return youngMakePerThousandGets;
    }

    /**
     * @param youngMakePerThousandGets
     */
    public void setYoungMakePerThousandGets(Long youngMakePerThousandGets) {
        this.youngMakePerThousandGets = youngMakePerThousandGets;
    }

    /**
     * @return NOT_YOUNG_MAKE_PER_THOUSAND_GETS
     */
    public Long getNotYoungMakePerThousandGets() {
        return notYoungMakePerThousandGets;
    }

    /**
     * @param notYoungMakePerThousandGets
     */
    public void setNotYoungMakePerThousandGets(Long notYoungMakePerThousandGets) {
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
    }

    /**
     * @return NUMBER_PAGES_READ_AHEAD
     */
    public Long getNumberPagesReadAhead() {
        return numberPagesReadAhead;
    }

    /**
     * @param numberPagesReadAhead
     */
    public void setNumberPagesReadAhead(Long numberPagesReadAhead) {
        this.numberPagesReadAhead = numberPagesReadAhead;
    }

    /**
     * @return NUMBER_READ_AHEAD_EVICTED
     */
    public Long getNumberReadAheadEvicted() {
        return numberReadAheadEvicted;
    }

    /**
     * @param numberReadAheadEvicted
     */
    public void setNumberReadAheadEvicted(Long numberReadAheadEvicted) {
        this.numberReadAheadEvicted = numberReadAheadEvicted;
    }

    /**
     * @return READ_AHEAD_RATE
     */
    public Float getReadAheadRate() {
        return readAheadRate;
    }

    /**
     * @param readAheadRate
     */
    public void setReadAheadRate(Float readAheadRate) {
        this.readAheadRate = readAheadRate;
    }

    /**
     * @return READ_AHEAD_EVICTED_RATE
     */
    public Float getReadAheadEvictedRate() {
        return readAheadEvictedRate;
    }

    /**
     * @param readAheadEvictedRate
     */
    public void setReadAheadEvictedRate(Float readAheadEvictedRate) {
        this.readAheadEvictedRate = readAheadEvictedRate;
    }

    /**
     * @return LRU_IO_TOTAL
     */
    public Long getLruIoTotal() {
        return lruIoTotal;
    }

    /**
     * @param lruIoTotal
     */
    public void setLruIoTotal(Long lruIoTotal) {
        this.lruIoTotal = lruIoTotal;
    }

    /**
     * @return LRU_IO_CURRENT
     */
    public Long getLruIoCurrent() {
        return lruIoCurrent;
    }

    /**
     * @param lruIoCurrent
     */
    public void setLruIoCurrent(Long lruIoCurrent) {
        this.lruIoCurrent = lruIoCurrent;
    }

    /**
     * @return UNCOMPRESS_TOTAL
     */
    public Long getUncompressTotal() {
        return uncompressTotal;
    }

    /**
     * @param uncompressTotal
     */
    public void setUncompressTotal(Long uncompressTotal) {
        this.uncompressTotal = uncompressTotal;
    }

    /**
     * @return UNCOMPRESS_CURRENT
     */
    public Long getUncompressCurrent() {
        return uncompressCurrent;
    }

    /**
     * @param uncompressCurrent
     */
    public void setUncompressCurrent(Long uncompressCurrent) {
        this.uncompressCurrent = uncompressCurrent;
    }
}