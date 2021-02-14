package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "COLUMN_STATISTICS")
public class ColumnStatistics {
    @Column(name = "SCHEMA_NAME")
    private String schemaName;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "HISTOGRAM")
    private String histogram;

    /**
     * @return SCHEMA_NAME
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
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
     * @return HISTOGRAM
     */
    public String getHistogram() {
        return histogram;
    }

    /**
     * @param histogram
     */
    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }
}