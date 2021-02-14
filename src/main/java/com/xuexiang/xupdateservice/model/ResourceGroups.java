package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "RESOURCE_GROUPS")
public class ResourceGroups {
    @Column(name = "RESOURCE_GROUP_NAME")
    private String resourceGroupName;

    @Column(name = "RESOURCE_GROUP_TYPE")
    private String resourceGroupType;

    @Column(name = "RESOURCE_GROUP_ENABLED")
    private Boolean resourceGroupEnabled;

    @Column(name = "THREAD_PRIORITY")
    private Integer threadPriority;

    @Column(name = "VCPU_IDS")
    private byte[] vcpuIds;

    /**
     * @return RESOURCE_GROUP_NAME
     */
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    /**
     * @param resourceGroupName
     */
    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * @return RESOURCE_GROUP_TYPE
     */
    public String getResourceGroupType() {
        return resourceGroupType;
    }

    /**
     * @param resourceGroupType
     */
    public void setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    /**
     * @return RESOURCE_GROUP_ENABLED
     */
    public Boolean getResourceGroupEnabled() {
        return resourceGroupEnabled;
    }

    /**
     * @param resourceGroupEnabled
     */
    public void setResourceGroupEnabled(Boolean resourceGroupEnabled) {
        this.resourceGroupEnabled = resourceGroupEnabled;
    }

    /**
     * @return THREAD_PRIORITY
     */
    public Integer getThreadPriority() {
        return threadPriority;
    }

    /**
     * @param threadPriority
     */
    public void setThreadPriority(Integer threadPriority) {
        this.threadPriority = threadPriority;
    }

    /**
     * @return VCPU_IDS
     */
    public byte[] getVcpuIds() {
        return vcpuIds;
    }

    /**
     * @param vcpuIds
     */
    public void setVcpuIds(byte[] vcpuIds) {
        this.vcpuIds = vcpuIds;
    }
}