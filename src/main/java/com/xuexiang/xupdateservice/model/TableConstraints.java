package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "TABLE_CONSTRAINTS")
public class TableConstraints {
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;

    @Column(name = "ENFORCED")
    private String enforced;

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
     * @return CONSTRAINT_TYPE
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * @param constraintType
     */
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    /**
     * @return ENFORCED
     */
    public String getEnforced() {
        return enforced;
    }

    /**
     * @param enforced
     */
    public void setEnforced(String enforced) {
        this.enforced = enforced;
    }
}