package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ROUTINES")
public class Routines {
    @Column(name = "SPECIFIC_NAME")
    private String specificName;

    @Column(name = "ROUTINE_CATALOG")
    private String routineCatalog;

    @Column(name = "ROUTINE_SCHEMA")
    private String routineSchema;

    @Column(name = "ROUTINE_NAME")
    private String routineName;

    @Column(name = "ROUTINE_TYPE")
    private String routineType;

    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @Column(name = "NUMERIC_PRECISION")
    private Integer numericPrecision;

    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;

    @Column(name = "DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "ROUTINE_BODY")
    private String routineBody;

    @Column(name = "EXTERNAL_LANGUAGE")
    private String externalLanguage;

    @Column(name = "PARAMETER_STYLE")
    private String parameterStyle;

    @Column(name = "IS_DETERMINISTIC")
    private String isDeterministic;

    @Column(name = "SQL_DATA_ACCESS")
    private String sqlDataAccess;

    @Column(name = "SECURITY_TYPE")
    private String securityType;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_ALTERED")
    private Date lastAltered;

    @Column(name = "SQL_MODE")
    private String sqlMode;

    @Column(name = "DEFINER")
    private String definer;

    @Column(name = "CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Column(name = "COLLATION_CONNECTION")
    private String collationConnection;

    @Column(name = "DATABASE_COLLATION")
    private String databaseCollation;

    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;

    @Column(name = "ROUTINE_DEFINITION")
    private String routineDefinition;

    @Column(name = "EXTERNAL_NAME")
    private byte[] externalName;

    @Column(name = "SQL_PATH")
    private byte[] sqlPath;

    @Column(name = "ROUTINE_COMMENT")
    private String routineComment;

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
    public Integer getNumericScale() {
        return numericScale;
    }

    /**
     * @param numericScale
     */
    public void setNumericScale(Integer numericScale) {
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
     * @return ROUTINE_BODY
     */
    public String getRoutineBody() {
        return routineBody;
    }

    /**
     * @param routineBody
     */
    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    /**
     * @return EXTERNAL_LANGUAGE
     */
    public String getExternalLanguage() {
        return externalLanguage;
    }

    /**
     * @param externalLanguage
     */
    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    /**
     * @return PARAMETER_STYLE
     */
    public String getParameterStyle() {
        return parameterStyle;
    }

    /**
     * @param parameterStyle
     */
    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    /**
     * @return IS_DETERMINISTIC
     */
    public String getIsDeterministic() {
        return isDeterministic;
    }

    /**
     * @param isDeterministic
     */
    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    /**
     * @return SQL_DATA_ACCESS
     */
    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    /**
     * @param sqlDataAccess
     */
    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
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
     * @return CREATED
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return LAST_ALTERED
     */
    public Date getLastAltered() {
        return lastAltered;
    }

    /**
     * @param lastAltered
     */
    public void setLastAltered(Date lastAltered) {
        this.lastAltered = lastAltered;
    }

    /**
     * @return SQL_MODE
     */
    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * @param sqlMode
     */
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
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
     * @return DATABASE_COLLATION
     */
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    /**
     * @param databaseCollation
     */
    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
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

    /**
     * @return ROUTINE_DEFINITION
     */
    public String getRoutineDefinition() {
        return routineDefinition;
    }

    /**
     * @param routineDefinition
     */
    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    /**
     * @return EXTERNAL_NAME
     */
    public byte[] getExternalName() {
        return externalName;
    }

    /**
     * @param externalName
     */
    public void setExternalName(byte[] externalName) {
        this.externalName = externalName;
    }

    /**
     * @return SQL_PATH
     */
    public byte[] getSqlPath() {
        return sqlPath;
    }

    /**
     * @param sqlPath
     */
    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    /**
     * @return ROUTINE_COMMENT
     */
    public String getRoutineComment() {
        return routineComment;
    }

    /**
     * @param routineComment
     */
    public void setRoutineComment(String routineComment) {
        this.routineComment = routineComment;
    }
}