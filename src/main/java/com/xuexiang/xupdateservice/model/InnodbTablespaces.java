package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_TABLESPACES")
public class InnodbTablespaces {
    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FLAG")
    private Integer flag;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "PAGE_SIZE")
    private Integer pageSize;

    @Column(name = "ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @Column(name = "SPACE_TYPE")
    private String spaceType;

    @Column(name = "FS_BLOCK_SIZE")
    private Integer fsBlockSize;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "ALLOCATED_SIZE")
    private Long allocatedSize;

    @Column(name = "SERVER_VERSION")
    private String serverVersion;

    @Column(name = "SPACE_VERSION")
    private Integer spaceVersion;

    @Column(name = "ENCRYPTION")
    private String encryption;

    @Column(name = "STATE")
    private String state;

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
     * @return FLAG
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
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
     * @return PAGE_SIZE
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
     * @return ZIP_PAGE_SIZE
     */
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    /**
     * @param zipPageSize
     */
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
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
     * @return FS_BLOCK_SIZE
     */
    public Integer getFsBlockSize() {
        return fsBlockSize;
    }

    /**
     * @param fsBlockSize
     */
    public void setFsBlockSize(Integer fsBlockSize) {
        this.fsBlockSize = fsBlockSize;
    }

    /**
     * @return FILE_SIZE
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * @return ALLOCATED_SIZE
     */
    public Long getAllocatedSize() {
        return allocatedSize;
    }

    /**
     * @param allocatedSize
     */
    public void setAllocatedSize(Long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    /**
     * @return SERVER_VERSION
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * @param serverVersion
     */
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    /**
     * @return SPACE_VERSION
     */
    public Integer getSpaceVersion() {
        return spaceVersion;
    }

    /**
     * @param spaceVersion
     */
    public void setSpaceVersion(Integer spaceVersion) {
        this.spaceVersion = spaceVersion;
    }

    /**
     * @return ENCRYPTION
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * @param encryption
     */
    public void setEncryption(String encryption) {
        this.encryption = encryption;
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
}