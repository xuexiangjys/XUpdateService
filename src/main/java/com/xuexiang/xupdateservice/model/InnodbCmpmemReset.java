package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_CMPMEM_RESET")
public class InnodbCmpmemReset {
    @Column(name = "page_size")
    private Integer pageSize;

    @Column(name = "buffer_pool_instance")
    private Integer bufferPoolInstance;

    @Column(name = "pages_used")
    private Integer pagesUsed;

    @Column(name = "pages_free")
    private Integer pagesFree;

    @Column(name = "relocation_ops")
    private Long relocationOps;

    @Column(name = "relocation_time")
    private Integer relocationTime;

    /**
     * @return page_size
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return buffer_pool_instance
     */
    public Integer getBufferPoolInstance() {
        return bufferPoolInstance;
    }

    /**
     * @param bufferPoolInstance
     */
    public void setBufferPoolInstance(Integer bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    /**
     * @return pages_used
     */
    public Integer getPagesUsed() {
        return pagesUsed;
    }

    /**
     * @param pagesUsed
     */
    public void setPagesUsed(Integer pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    /**
     * @return pages_free
     */
    public Integer getPagesFree() {
        return pagesFree;
    }

    /**
     * @param pagesFree
     */
    public void setPagesFree(Integer pagesFree) {
        this.pagesFree = pagesFree;
    }

    /**
     * @return relocation_ops
     */
    public Long getRelocationOps() {
        return relocationOps;
    }

    /**
     * @param relocationOps
     */
    public void setRelocationOps(Long relocationOps) {
        this.relocationOps = relocationOps;
    }

    /**
     * @return relocation_time
     */
    public Integer getRelocationTime() {
        return relocationTime;
    }

    /**
     * @param relocationTime
     */
    public void setRelocationTime(Integer relocationTime) {
        this.relocationTime = relocationTime;
    }
}