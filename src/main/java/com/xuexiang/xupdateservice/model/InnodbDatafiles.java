package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_DATAFILES")
public class InnodbDatafiles {
    @Column(name = "PATH")
    private String path;

    @Column(name = "SPACE")
    private byte[] space;

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
}