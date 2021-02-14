package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "STATISTICS")
public class Statistics {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "NON_UNIQUE")
    private Integer nonUnique;

    @Column(name = "INDEX_SCHEMA")
    private String indexSchema;

    @Column(name = "INDEX_NAME")
    private String indexName;

    @Column(name = "SEQ_IN_INDEX")
    private Integer seqInIndex;

    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "COLLATION")
    private String collation;

    @Column(name = "CARDINALITY")
    private Long cardinality;

    @Column(name = "SUB_PART")
    private Long subPart;

    @Column(name = "NULLABLE")
    private String nullable;

    @Column(name = "INDEX_TYPE")
    private String indexType;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "INDEX_COMMENT")
    private String indexComment;

    @Column(name = "IS_VISIBLE")
    private String isVisible;

    @Column(name = "PACKED")
    private byte[] packed;

    @Column(name = "EXPRESSION")
    private String expression;

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
     * @return NON_UNIQUE
     */
    public Integer getNonUnique() {
        return nonUnique;
    }

    /**
     * @param nonUnique
     */
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    /**
     * @return INDEX_SCHEMA
     */
    public String getIndexSchema() {
        return indexSchema;
    }

    /**
     * @param indexSchema
     */
    public void setIndexSchema(String indexSchema) {
        this.indexSchema = indexSchema;
    }

    /**
     * @return INDEX_NAME
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return SEQ_IN_INDEX
     */
    public Integer getSeqInIndex() {
        return seqInIndex;
    }

    /**
     * @param seqInIndex
     */
    public void setSeqInIndex(Integer seqInIndex) {
        this.seqInIndex = seqInIndex;
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
     * @return COLLATION
     */
    public String getCollation() {
        return collation;
    }

    /**
     * @param collation
     */
    public void setCollation(String collation) {
        this.collation = collation;
    }

    /**
     * @return CARDINALITY
     */
    public Long getCardinality() {
        return cardinality;
    }

    /**
     * @param cardinality
     */
    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * @return SUB_PART
     */
    public Long getSubPart() {
        return subPart;
    }

    /**
     * @param subPart
     */
    public void setSubPart(Long subPart) {
        this.subPart = subPart;
    }

    /**
     * @return NULLABLE
     */
    public String getNullable() {
        return nullable;
    }

    /**
     * @param nullable
     */
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    /**
     * @return INDEX_TYPE
     */
    public String getIndexType() {
        return indexType;
    }

    /**
     * @param indexType
     */
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    /**
     * @return COMMENT
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return INDEX_COMMENT
     */
    public String getIndexComment() {
        return indexComment;
    }

    /**
     * @param indexComment
     */
    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment;
    }

    /**
     * @return IS_VISIBLE
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**
     * @param isVisible
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * @return PACKED
     */
    public byte[] getPacked() {
        return packed;
    }

    /**
     * @param packed
     */
    public void setPacked(byte[] packed) {
        this.packed = packed;
    }

    /**
     * @return EXPRESSION
     */
    public String getExpression() {
        return expression;
    }

    /**
     * @param expression
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }
}