package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ST_GEOMETRY_COLUMNS")
public class StGeometryColumns {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "SRS_NAME")
    private String srsName;

    @Column(name = "SRS_ID")
    private Integer srsId;

    @Column(name = "GEOMETRY_TYPE_NAME")
    private String geometryTypeName;

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
     * @return GEOMETRY_TYPE_NAME
     */
    public String getGeometryTypeName() {
        return geometryTypeName;
    }

    /**
     * @param geometryTypeName
     */
    public void setGeometryTypeName(String geometryTypeName) {
        this.geometryTypeName = geometryTypeName;
    }
}