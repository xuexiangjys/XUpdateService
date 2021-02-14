package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ADMINISTRABLE_ROLE_AUTHORIZATIONS")
public class AdministrableRoleAuthorizations {
    @Column(name = "USER")
    private String user;

    @Column(name = "HOST")
    private String host;

    @Column(name = "GRANTEE")
    private String grantee;

    @Column(name = "GRANTEE_HOST")
    private String granteeHost;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "ROLE_HOST")
    private String roleHost;

    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

    @Column(name = "IS_DEFAULT")
    private String isDefault;

    @Column(name = "IS_MANDATORY")
    private String isMandatory;

    /**
     * @return USER
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return HOST
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
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
     * @return ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return ROLE_HOST
     */
    public String getRoleHost() {
        return roleHost;
    }

    /**
     * @param roleHost
     */
    public void setRoleHost(String roleHost) {
        this.roleHost = roleHost;
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

    /**
     * @return IS_DEFAULT
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return IS_MANDATORY
     */
    public String getIsMandatory() {
        return isMandatory;
    }

    /**
     * @param isMandatory
     */
    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }
}