package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "REFERENTIAL_CONSTRAINTS")
public class ReferentialConstraints {
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

    @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;

    @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;

    @Column(name = "UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;

    @Column(name = "MATCH_OPTION")
    private String matchOption;

    @Column(name = "UPDATE_RULE")
    private String updateRule;

    @Column(name = "DELETE_RULE")
    private String deleteRule;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "REFERENCED_TABLE_NAME")
    private String referencedTableName;

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
     * @return UNIQUE_CONSTRAINT_CATALOG
     */
    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    /**
     * @param uniqueConstraintCatalog
     */
    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    /**
     * @return UNIQUE_CONSTRAINT_SCHEMA
     */
    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    /**
     * @param uniqueConstraintSchema
     */
    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    /**
     * @return UNIQUE_CONSTRAINT_NAME
     */
    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    /**
     * @param uniqueConstraintName
     */
    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    /**
     * @return MATCH_OPTION
     */
    public String getMatchOption() {
        return matchOption;
    }

    /**
     * @param matchOption
     */
    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    /**
     * @return UPDATE_RULE
     */
    public String getUpdateRule() {
        return updateRule;
    }

    /**
     * @param updateRule
     */
    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule;
    }

    /**
     * @return DELETE_RULE
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * @param deleteRule
     */
    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
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
}