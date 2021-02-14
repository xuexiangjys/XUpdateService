package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "CHECK_CONSTRAINTS")
public class CheckConstraints {
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

    @Column(name = "CHECK_CLAUSE")
    private String checkClause;

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
     * @return CHECK_CLAUSE
     */
    public String getCheckClause() {
        return checkClause;
    }

    /**
     * @param checkClause
     */
    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
    }
}