package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ROLE_ROUTINE_GRANTS")
public class RoleRoutineGrants {
    @Column(name = "GRANTOR")
    private String grantor;

    @Column(name = "GRANTOR_HOST")
    private String grantorHost;

    @Column(name = "GRANTEE")
    private String grantee;

    @Column(name = "GRANTEE_HOST")
    private String granteeHost;

    @Column(name = "SPECIFIC_CATALOG")
    private String specificCatalog;

    @Column(name = "SPECIFIC_SCHEMA")
    private String specificSchema;

    @Column(name = "SPECIFIC_NAME")
    private String specificName;

    @Column(name = "ROUTINE_CATALOG")
    private String routineCatalog;

    @Column(name = "ROUTINE_SCHEMA")
    private String routineSchema;

    @Column(name = "ROUTINE_NAME")
    private String routineName;

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
     * @return SPECIFIC_CATALOG
     */
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    /**
     * @param specificCatalog
     */
    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    /**
     * @return SPECIFIC_SCHEMA
     */
    public String getSpecificSchema() {
        return specificSchema;
    }

    /**
     * @param specificSchema
     */
    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    /**
     * @return SPECIFIC_NAME
     */
    public String getSpecificName() {
        return specificName;
    }

    /**
     * @param specificName
     */
    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    /**
     * @return ROUTINE_CATALOG
     */
    public String getRoutineCatalog() {
        return routineCatalog;
    }

    /**
     * @param routineCatalog
     */
    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    /**
     * @return ROUTINE_SCHEMA
     */
    public String getRoutineSchema() {
        return routineSchema;
    }

    /**
     * @param routineSchema
     */
    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    /**
     * @return ROUTINE_NAME
     */
    public String getRoutineName() {
        return routineName;
    }

    /**
     * @param routineName
     */
    public void setRoutineName(String routineName) {
        this.routineName = routineName;
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