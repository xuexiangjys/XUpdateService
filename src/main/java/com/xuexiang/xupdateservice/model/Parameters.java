package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "PARAMETERS")
public class Parameters {
    @Column(name = "SPECIFIC_CATALOG")
    private String specificCatalog;

    @Column(name = "SPECIFIC_SCHEMA")
    private String specificSchema;

    @Column(name = "SPECIFIC_NAME")
    private String specificName;

    @Column(name = "ORDINAL_POSITION")
    private Long ordinalPosition;

    @Column(name = "PARAMETER_MODE")
    private String parameterMode;

    @Column(name = "PARAMETER_NAME")
    private String parameterName;

    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @Column(name = "NUMERIC_PRECISION")
    private Integer numericPrecision;

    @Column(name = "NUMERIC_SCALE")
    private Long numericScale;

    @Column(name = "DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "ROUTINE_TYPE")
    private String routineType;

    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;

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
     * @return ORDINAL_POSITION
     */
    public Long getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     */
    public void setOrdinalPosition(Long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * @return PARAMETER_MODE
     */
    public String getParameterMode() {
        return parameterMode;
    }

    /**
     * @param parameterMode
     */
    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    /**
     * @return PARAMETER_NAME
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * @param parameterName
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * @return CHARACTER_MAXIMUM_LENGTH
     */
    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    /**
     * @param characterMaximumLength
     */
    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    /**
     * @return CHARACTER_OCTET_LENGTH
     */
    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    /**
     * @param characterOctetLength
     */
    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    /**
     * @return NUMERIC_PRECISION
     */
    public Integer getNumericPrecision() {
        return numericPrecision;
    }

    /**
     * @param numericPrecision
     */
    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * @return NUMERIC_SCALE
     */
    public Long getNumericScale() {
        return numericScale;
    }

    /**
     * @param numericScale
     */
    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * @return DATETIME_PRECISION
     */
    public Integer getDatetimePrecision() {
        return datetimePrecision;
    }

    /**
     * @param datetimePrecision
     */
    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    /**
     * @return CHARACTER_SET_NAME
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * @return COLLATION_NAME
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * @param collationName
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * @return ROUTINE_TYPE
     */
    public String getRoutineType() {
        return routineType;
    }

    /**
     * @param routineType
     */
    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    /**
     * @return DATA_TYPE
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * @return DTD_IDENTIFIER
     */
    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    /**
     * @param dtdIdentifier
     */
    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }
}