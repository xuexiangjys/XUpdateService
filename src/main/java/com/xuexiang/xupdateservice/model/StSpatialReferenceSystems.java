package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ST_SPATIAL_REFERENCE_SYSTEMS")
public class StSpatialReferenceSystems {
    @Column(name = "SRS_NAME")
    private String srsName;

    @Column(name = "SRS_ID")
    private Integer srsId;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "ORGANIZATION_COORDSYS_ID")
    private Integer organizationCoordsysId;

    @Column(name = "DEFINITION")
    private String definition;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return SRS_NAME
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * @param srsName
     */
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    /**
     * @return SRS_ID
     */
    public Integer getSrsId() {
        return srsId;
    }

    /**
     * @param srsId
     */
    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    /**
     * @return ORGANIZATION
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return ORGANIZATION_COORDSYS_ID
     */
    public Integer getOrganizationCoordsysId() {
        return organizationCoordsysId;
    }

    /**
     * @param organizationCoordsysId
     */
    public void setOrganizationCoordsysId(Integer organizationCoordsysId) {
        this.organizationCoordsysId = organizationCoordsysId;
    }

    /**
     * @return DEFINITION
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}