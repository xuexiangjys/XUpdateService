package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_TABLESPACES_BRIEF")
public class InnodbTablespacesBrief {
    @Column(name = "NAME")
    private String name;

    @Column(name = "PATH")
    private String path;

    @Column(name = "SPACE_TYPE")
    private String spaceType;

    @Column(name = "SPACE")
    private byte[] space;

    @Column(name = "FLAG")
    private byte[] flag;

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return SPACE_TYPE
     */
    public String getSpaceType() {
        return spaceType;
    }

    /**
     * @param spaceType
     */
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    /**
     * @return SPACE
     */
    public byte[] getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(byte[] space) {
        this.space = space;
    }

    /**
     * @return FLAG
     */
    public byte[] getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(byte[] flag) {
        this.flag = flag;
    }
}