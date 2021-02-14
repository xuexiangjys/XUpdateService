package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_FT_BEING_DELETED")
public class InnodbFtBeingDeleted {
    @Column(name = "DOC_ID")
    private Long docId;

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
}