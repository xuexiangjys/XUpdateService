package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "USER_PRIVILEGES")
public class UserPrivileges {
    @Column(name = "GRANTEE")
    private String grantee;

    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;

    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

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