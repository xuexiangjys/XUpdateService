package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_SESSION_TEMP_TABLESPACES")
public class InnodbSessionTempTablespaces {
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "PATH")
    private String path;

    @Column(name = "SIZE")
    private Long size;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PURPOSE")
    private String purpose;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return PATH
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return SIZE
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return PURPOSE
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}