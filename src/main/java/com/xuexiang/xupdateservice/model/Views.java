package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "VIEWS")
public class Views {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "CHECK_OPTION")
    private String checkOption;

    @Column(name = "IS_UPDATABLE")
    private String isUpdatable;

    @Column(name = "DEFINER")
    private String definer;

    @Column(name = "SECURITY_TYPE")
    private String securityType;

    @Column(name = "CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Column(name = "COLLATION_CONNECTION")
    private String collationConnection;

    @Column(name = "VIEW_DEFINITION")
    private String viewDefinition;

    /**
     * @return TABLE_CATALOG
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * @param tableCatalog
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * @return TABLE_SCHEMA
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return CHECK_OPTION
     */
    public String getCheckOption() {
        return checkOption;
    }

    /**
     * @param checkOption
     */
    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    /**
     * @return IS_UPDATABLE
     */
    public String getIsUpdatable() {
        return isUpdatable;
    }

    /**
     * @param isUpdatable
     */
    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    /**
     * @return DEFINER
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    /**
     * @return SECURITY_TYPE
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * @param securityType
     */
    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    /**
     * @return CHARACTER_SET_CLIENT
     */
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    /**
     * @param characterSetClient
     */
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    /**
     * @return COLLATION_CONNECTION
     */
    public String getCollationConnection() {
        return collationConnection;
    }

    /**
     * @param collationConnection
     */
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    /**
     * @return VIEW_DEFINITION
     */
    public String getViewDefinition() {
        return viewDefinition;
    }

    /**
     * @param viewDefinition
     */
    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }
}