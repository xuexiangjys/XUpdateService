package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_CACHED_INDEXES")
public class InnodbCachedIndexes {
    @Column(name = "SPACE_ID")
    private Integer spaceId;

    @Column(name = "INDEX_ID")
    private Long indexId;

    @Column(name = "N_CACHED_PAGES")
    private Long nCachedPages;

    /**
     * @return SPACE_ID
     */
    public Integer getSpaceId() {
        return spaceId;
    }

    /**
     * @param spaceId
     */
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

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
     * @return N_CACHED_PAGES
     */
    public Long getnCachedPages() {
        return nCachedPages;
    }

    /**
     * @param nCachedPages
     */
    public void setnCachedPages(Long nCachedPages) {
        this.nCachedPages = nCachedPages;
    }
}