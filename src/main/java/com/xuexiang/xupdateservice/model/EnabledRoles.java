package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ENABLED_ROLES")
public class EnabledRoles {
    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "ROLE_HOST")
    private String roleHost;

    @Column(name = "IS_DEFAULT")
    private String isDefault;

    @Column(name = "IS_MANDATORY")
    private String isMandatory;

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