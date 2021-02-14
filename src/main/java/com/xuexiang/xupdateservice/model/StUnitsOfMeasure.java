package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ST_UNITS_OF_MEASURE")
public class StUnitsOfMeasure {
    @Column(name = "UNIT_NAME")
    private String unitName;

    @Column(name = "UNIT_TYPE")
    private String unitType;

    @Column(name = "CONVERSION_FACTOR")
    private Double conversionFactor;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return UNIT_NAME
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return UNIT_TYPE
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * @param unitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * @return CONVERSION_FACTOR
     */
    public Double getConversionFactor() {
        return conversionFactor;
    }

    /**
     * @param conversionFactor
     */
    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
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