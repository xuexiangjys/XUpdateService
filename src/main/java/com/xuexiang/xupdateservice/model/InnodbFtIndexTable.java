package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FT_INDEX_TABLE")
public class InnodbFtIndexTable {
    @Column(name = "WORD")
    private String word;

    @Column(name = "FIRST_DOC_ID")
    private Long firstDocId;

    @Column(name = "LAST_DOC_ID")
    private Long lastDocId;

    @Column(name = "DOC_COUNT")
    private Long docCount;

    @Column(name = "DOC_ID")
    private Long docId;

    @Column(name = "POSITION")
    private Long position;

    /**
     * @return WORD
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return FIRST_DOC_ID
     */
    public Long getFirstDocId() {
        return firstDocId;
    }

    /**
     * @param firstDocId
     */
    public void setFirstDocId(Long firstDocId) {
        this.firstDocId = firstDocId;
    }

    /**
     * @return LAST_DOC_ID
     */
    public Long getLastDocId() {
        return lastDocId;
    }

    /**
     * @param lastDocId
     */
    public void setLastDocId(Long lastDocId) {
        this.lastDocId = lastDocId;
    }

    /**
     * @return DOC_COUNT
     */
    public Long getDocCount() {
        return docCount;
    }

    /**
     * @param docCount
     */
    public void setDocCount(Long docCount) {
        this.docCount = docCount;
    }

    /**
     * @return DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /**
     * @param docId
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    /**
     * @return POSITION
     */
    public Long getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(Long position) {
        this.position = position;
    }
}