package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_CMP_PER_INDEX_RESET")
public class InnodbCmpPerIndexReset {
    @Column(name = "database_name")
    private String databaseName;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "index_name")
    private String indexName;

    @Column(name = "compress_ops")
    private Integer compressOps;

    @Column(name = "compress_ops_ok")
    private Integer compressOpsOk;

    @Column(name = "compress_time")
    private Integer compressTime;

    @Column(name = "uncompress_ops")
    private Integer uncompressOps;

    @Column(name = "uncompress_time")
    private Integer uncompressTime;

    /**
     * @return database_name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return table_name
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
     * @return index_name
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
     * @return compress_ops
     */
    public Integer getCompressOps() {
        return compressOps;
    }

    /**
     * @param compressOps
     */
    public void setCompressOps(Integer compressOps) {
        this.compressOps = compressOps;
    }

    /**
     * @return compress_ops_ok
     */
    public Integer getCompressOpsOk() {
        return compressOpsOk;
    }

    /**
     * @param compressOpsOk
     */
    public void setCompressOpsOk(Integer compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    /**
     * @return compress_time
     */
    public Integer getCompressTime() {
        return compressTime;
    }

    /**
     * @param compressTime
     */
    public void setCompressTime(Integer compressTime) {
        this.compressTime = compressTime;
    }

    /**
     * @return uncompress_ops
     */
    public Integer getUncompressOps() {
        return uncompressOps;
    }

    /**
     * @param uncompressOps
     */
    public void setUncompressOps(Integer uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    /**
     * @return uncompress_time
     */
    public Integer getUncompressTime() {
        return uncompressTime;
    }

    /**
     * @param uncompressTime
     */
    public void setUncompressTime(Integer uncompressTime) {
        this.uncompressTime = uncompressTime;
    }
}