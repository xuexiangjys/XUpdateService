package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ROLE_TABLE_GRANTS")
public class RoleTableGrants {
    @Column(name = "GRANTOR")
    private String grantor;

    @Column(name = "GRANTOR_HOST")
    private String grantorHost;

    @Column(name = "GRANTEE")
    private String grantee;

    @Column(name = "GRANTEE_HOST")
    private String granteeHost;

    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;

    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

    /**
     * @return GRANTOR
     */
    public String getGrantor() {
        return grantor;
    }

    /**
     * @param grantor
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * @return GRANTOR_HOST
     */
    public String getGrantorHost() {
        return grantorHost;
    }

    /**
     * @param grantorHost
     */
    public void setGrantorHost(String grantorHost) {
        this.grantorHost = grantorHost;
    }

    /**
     * @return GRANTEE
     */
    public String getGrantee() {
        return grantee;
    }

    /**
     * @param grantee
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    /**
     * @return GRANTEE_HOST
     */
    public String getGranteeHost() {
        return granteeHost;
    }

    /**
     * @param granteeHost
     */
    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost;
    }

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
     * @return PRIVILEGE_TYPE
     */
    public String getPrivilegeType() {
        return privilegeType;
    }

    /**
     * @param privilegeType
     */
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * @return IS_GRANTABLE
     */
    public String getIsGrantable() {
        return isGrantable;
    }

    /**
     * @param isGrantable
     */
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }
}