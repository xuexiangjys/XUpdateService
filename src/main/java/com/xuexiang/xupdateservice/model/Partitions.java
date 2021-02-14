package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PARTITIONS")
public class Partitions {
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "PARTITION_NAME")
    private String partitionName;

    @Column(name = "SUBPARTITION_NAME")
    private String subpartitionName;

    @Column(name = "PARTITION_ORDINAL_POSITION")
    private Integer partitionOrdinalPosition;

    @Column(name = "SUBPARTITION_ORDINAL_POSITION")
    private Integer subpartitionOrdinalPosition;

    @Column(name = "PARTITION_METHOD")
    private String partitionMethod;

    @Column(name = "SUBPARTITION_METHOD")
    private String subpartitionMethod;

    @Column(name = "PARTITION_EXPRESSION")
    private String partitionExpression;

    @Column(name = "SUBPARTITION_EXPRESSION")
    private String subpartitionExpression;

    @Column(name = "TABLE_ROWS")
    private Long tableRows;

    @Column(name = "AVG_ROW_LENGTH")
    private Long avgRowLength;

    @Column(name = "DATA_LENGTH")
    private Long dataLength;

    @Column(name = "MAX_DATA_LENGTH")
    private Long maxDataLength;

    @Column(name = "INDEX_LENGTH")
    private Long indexLength;

    @Column(name = "DATA_FREE")
    private Long dataFree;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CHECK_TIME")
    private Date checkTime;

    @Column(name = "CHECKSUM")
    private Long checksum;

    @Column(name = "NODEGROUP")
    private String nodegroup;

    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;

    @Column(name = "PARTITION_DESCRIPTION")
    private String partitionDescription;

    @Column(name = "PARTITION_COMMENT")
    private String partitionComment;

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
     * @return PARTITION_NAME
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * @param partitionName
     */
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    /**
     * @return SUBPARTITION_NAME
     */
    public String getSubpartitionName() {
        return subpartitionName;
    }

    /**
     * @param subpartitionName
     */
    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    /**
     * @return PARTITION_ORDINAL_POSITION
     */
    public Integer getPartitionOrdinalPosition() {
        return partitionOrdinalPosition;
    }

    /**
     * @param partitionOrdinalPosition
     */
    public void setPartitionOrdinalPosition(Integer partitionOrdinalPosition) {
        this.partitionOrdinalPosition = partitionOrdinalPosition;
    }

    /**
     * @return SUBPARTITION_ORDINAL_POSITION
     */
    public Integer getSubpartitionOrdinalPosition() {
        return subpartitionOrdinalPosition;
    }

    /**
     * @param subpartitionOrdinalPosition
     */
    public void setSubpartitionOrdinalPosition(Integer subpartitionOrdinalPosition) {
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
    }

    /**
     * @return PARTITION_METHOD
     */
    public String getPartitionMethod() {
        return partitionMethod;
    }

    /**
     * @param partitionMethod
     */
    public void setPartitionMethod(String partitionMethod) {
        this.partitionMethod = partitionMethod;
    }

    /**
     * @return SUBPARTITION_METHOD
     */
    public String getSubpartitionMethod() {
        return subpartitionMethod;
    }

    /**
     * @param subpartitionMethod
     */
    public void setSubpartitionMethod(String subpartitionMethod) {
        this.subpartitionMethod = subpartitionMethod;
    }

    /**
     * @return PARTITION_EXPRESSION
     */
    public String getPartitionExpression() {
        return partitionExpression;
    }

    /**
     * @param partitionExpression
     */
    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression;
    }

    /**
     * @return SUBPARTITION_EXPRESSION
     */
    public String getSubpartitionExpression() {
        return subpartitionExpression;
    }

    /**
     * @param subpartitionExpression
     */
    public void setSubpartitionExpression(String subpartitionExpression) {
        this.subpartitionExpression = subpartitionExpression;
    }

    /**
     * @return TABLE_ROWS
     */
    public Long getTableRows() {
        return tableRows;
    }

    /**
     * @param tableRows
     */
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * @return AVG_ROW_LENGTH
     */
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    /**
     * @param avgRowLength
     */
    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    /**
     * @return DATA_LENGTH
     */
    public Long getDataLength() {
        return dataLength;
    }

    /**
     * @param dataLength
     */
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * @return MAX_DATA_LENGTH
     */
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * @param maxDataLength
     */
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    /**
     * @return INDEX_LENGTH
     */
    public Long getIndexLength() {
        return indexLength;
    }

    /**
     * @param indexLength
     */
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    /**
     * @return DATA_FREE
     */
    public Long getDataFree() {
        return dataFree;
    }

    /**
     * @param dataFree
     */
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CHECK_TIME
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return CHECKSUM
     */
    public Long getChecksum() {
        return checksum;
    }

    /**
     * @param checksum
     */
    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    /**
     * @return NODEGROUP
     */
    public String getNodegroup() {
        return nodegroup;
    }

    /**
     * @param nodegroup
     */
    public void setNodegroup(String nodegroup) {
        this.nodegroup = nodegroup;
    }

    /**
     * @return TABLESPACE_NAME
     */
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * @param tablespaceName
     */
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    /**
     * @return PARTITION_DESCRIPTION
     */
    public String getPartitionDescription() {
        return partitionDescription;
    }

    /**
     * @param partitionDescription
     */
    public void setPartitionDescription(String partitionDescription) {
        this.partitionDescription = partitionDescription;
    }

    /**
     * @return PARTITION_COMMENT
     */
    public String getPartitionComment() {
        return partitionComment;
    }

    /**
     * @param partitionComment
     */
    public void setPartitionComment(String partitionComment) {
        this.partitionComment = partitionComment;
    }
}