package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "PLUGINS")
public class Plugins {
    @Column(name = "PLUGIN_NAME")
    private String pluginName;

    @Column(name = "PLUGIN_VERSION")
    private String pluginVersion;

    @Column(name = "PLUGIN_STATUS")
    private String pluginStatus;

    @Column(name = "PLUGIN_TYPE")
    private String pluginType;

    @Column(name = "PLUGIN_TYPE_VERSION")
    private String pluginTypeVersion;

    @Column(name = "PLUGIN_LIBRARY")
    private String pluginLibrary;

    @Column(name = "PLUGIN_LIBRARY_VERSION")
    private String pluginLibraryVersion;

    @Column(name = "PLUGIN_AUTHOR")
    private String pluginAuthor;

    @Column(name = "PLUGIN_DESCRIPTION")
    private String pluginDescription;

    @Column(name = "PLUGIN_LICENSE")
    private String pluginLicense;

    @Column(name = "LOAD_OPTION")
    private String loadOption;

    /**
     * @return PLUGIN_NAME
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * @param pluginName
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * @return PLUGIN_VERSION
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    /**
     * @param pluginVersion
     */
    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    /**
     * @return PLUGIN_STATUS
     */
    public String getPluginStatus() {
        return pluginStatus;
    }

    /**
     * @param pluginStatus
     */
    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    /**
     * @return PLUGIN_TYPE
     */
    public String getPluginType() {
        return pluginType;
    }

    /**
     * @param pluginType
     */
    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    /**
     * @return PLUGIN_TYPE_VERSION
     */
    public String getPluginTypeVersion() {
        return pluginTypeVersion;
    }

    /**
     * @param pluginTypeVersion
     */
    public void setPluginTypeVersion(String pluginTypeVersion) {
        this.pluginTypeVersion = pluginTypeVersion;
    }

    /**
     * @return PLUGIN_LIBRARY
     */
    public String getPluginLibrary() {
        return pluginLibrary;
    }

    /**
     * @param pluginLibrary
     */
    public void setPluginLibrary(String pluginLibrary) {
        this.pluginLibrary = pluginLibrary;
    }

    /**
     * @return PLUGIN_LIBRARY_VERSION
     */
    public String getPluginLibraryVersion() {
        return pluginLibraryVersion;
    }

    /**
     * @param pluginLibraryVersion
     */
    public void setPluginLibraryVersion(String pluginLibraryVersion) {
        this.pluginLibraryVersion = pluginLibraryVersion;
    }

    /**
     * @return PLUGIN_AUTHOR
     */
    public String getPluginAuthor() {
        return pluginAuthor;
    }

    /**
     * @param pluginAuthor
     */
    public void setPluginAuthor(String pluginAuthor) {
        this.pluginAuthor = pluginAuthor;
    }

    /**
     * @return PLUGIN_DESCRIPTION
     */
    public String getPluginDescription() {
        return pluginDescription;
    }

    /**
     * @param pluginDescription
     */
    public void setPluginDescription(String pluginDescription) {
        this.pluginDescription = pluginDescription;
    }

    /**
     * @return PLUGIN_LICENSE
     */
    public String getPluginLicense() {
        return pluginLicense;
    }

    /**
     * @param pluginLicense
     */
    public void setPluginLicense(String pluginLicense) {
        this.pluginLicense = pluginLicense;
    }

    /**
     * @return LOAD_OPTION
     */
    public String getLoadOption() {
        return loadOption;
    }

    /**
     * @param loadOption
     */
    public void setLoadOption(String loadOption) {
        this.loadOption = loadOption;
    }
}