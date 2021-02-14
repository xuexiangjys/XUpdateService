package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "VIEW_ROUTINE_USAGE")
public class ViewRoutineUsage {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "SPECIFIC_CATALOG")
    private String specificCatalog;

    @Column(name = "SPECIFIC_SCHEMA")
    private String specificSchema;

    @Column(name = "SPECIFIC_NAME")
    private String specificName;

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
}