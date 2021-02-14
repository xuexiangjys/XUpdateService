package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "VIEW_TABLE_USAGE")
public class ViewTableUsage {
    @Column(name = "VIEW_CATALOG")
    private String viewCatalog;

    @Column(name = "VIEW_SCHEMA")
    private String viewSchema;

    @Column(name = "VIEW_NAME")
    private String viewName;

    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * @return VIEW_CATALOG
     */
    public String getViewCatalog() {
        return viewCatalog;
    }

    /**
     * @param viewCatalog
     */
    public void setViewCatalog(String viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    /**
     * @return VIEW_SCHEMA
     */
    public String getViewSchema() {
        return viewSchema;
    }

    /**
     * @param viewSchema
     */
    public void setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema;
    }

    /**
     * @return VIEW_NAME
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

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
}