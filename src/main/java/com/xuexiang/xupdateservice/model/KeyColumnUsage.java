package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "KEY_COLUMN_USAGE")
public class KeyColumnUsage {
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

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

    @Column(name = "POSITION_IN_UNIQUE_CONSTRAINT")
    private Integer positionInUniqueConstraint;

    @Column(name = "REFERENCED_TABLE_SCHEMA")
    private String referencedTableSchema;

    @Column(name = "REFERENCED_TABLE_NAME")
    private String referencedTableName;

    @Column(name = "REFERENCED_COLUMN_NAME")
    private String referencedColumnName;

    /**
     * @return CONSTRAINT_CATALOG
     */
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    /**
     * @param constraintCatalog
     */
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    /**
     * @return CONSTRAINT_SCHEMA
     */
    public String getConstraintSchema() {
        return constraintSchema;
    }

    /**
     * @param constraintSchema
     */
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    /**
     * @return CONSTRAINT_NAME
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * @param constraintName
     */
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
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
     * @return POSITION_IN_UNIQUE_CONSTRAINT
     */
    public Integer getPositionInUniqueConstraint() {
        return positionInUniqueConstraint;
    }

    /**
     * @param positionInUniqueConstraint
     */
    public void setPositionInUniqueConstraint(Integer positionInUniqueConstraint) {
        this.positionInUniqueConstraint = positionInUniqueConstraint;
    }

    /**
     * @return REFERENCED_TABLE_SCHEMA
     */
    public String getReferencedTableSchema() {
        return referencedTableSchema;
    }

    /**
     * @param referencedTableSchema
     */
    public void setReferencedTableSchema(String referencedTableSchema) {
        this.referencedTableSchema = referencedTableSchema;
    }

    /**
     * @return REFERENCED_TABLE_NAME
     */
    public String getReferencedTableName() {
        return referencedTableName;
    }

    /**
     * @param referencedTableName
     */
    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    /**
     * @return REFERENCED_COLUMN_NAME
     */
    public String getReferencedColumnName() {
        return referencedColumnName;
    }

    /**
     * @param referencedColumnName
     */
    public void setReferencedColumnName(String referencedColumnName) {
        this.referencedColumnName = referencedColumnName;
    }
}