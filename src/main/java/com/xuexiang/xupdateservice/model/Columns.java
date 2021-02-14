package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "COLUMNS")
public class Columns {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;

    @Column(name = "IS_NULLABLE")
    private String isNullable;

    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @Column(name = "NUMERIC_PRECISION")
    private Long numericPrecision;

    @Column(name = "NUMERIC_SCALE")
    private Long numericScale;

    @Column(name = "DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "COLUMN_KEY")
    private String columnKey;

    @Column(name = "EXTRA")
    private String extra;

    @Column(name = "PRIVILEGES")
    private String privileges;

    @Column(name = "SRS_ID")
    private Integer srsId;

    @Column(name = "COLUMN_DEFAULT")
    private String columnDefault;

    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "COLUMN_TYPE")
    private String columnType;

    @Column(name = "COLUMN_COMMENT")
    private String columnComment;

    @Column(name = "GENERATION_EXPRESSION")
    private String generationExpression;

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
     * @return COLUMN_NAME
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return ORDINAL_POSITION
     */
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     */
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * @return IS_NULLABLE
     */
    public String getIsNullable() {
        return isNullable;
    }

    /**
     * @param isNullable
     */
    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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
    public Long getNumericPrecision() {
        return numericPrecision;
    }

    /**
     * @param numericPrecision
     */
    public void setNumericPrecision(Long numericPrecision) {
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
     * @return COLUMN_KEY
     */
    public String getColumnKey() {
        return columnKey;
    }

    /**
     * @param columnKey
     */
    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    /**
     * @return EXTRA
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * @return PRIVILEGES
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * @param privileges
     */
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
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
     * @return COLUMN_DEFAULT
     */
    public String getColumnDefault() {
        return columnDefault;
    }

    /**
     * @param columnDefault
     */
    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
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
     * @return COLUMN_TYPE
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * @param columnType
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * @return COLUMN_COMMENT
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * @param columnComment
     */
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    /**
     * @return GENERATION_EXPRESSION
     */
    public String getGenerationExpression() {
        return generationExpression;
    }

    /**
     * @param generationExpression
     */
    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }
}