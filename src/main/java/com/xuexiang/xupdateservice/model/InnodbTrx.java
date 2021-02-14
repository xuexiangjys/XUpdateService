package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "INNODB_TRX")
public class InnodbTrx {
    @Column(name = "trx_id")
    private Long trxId;

    @Column(name = "trx_state")
    private String trxState;

    @Column(name = "trx_started")
    private Date trxStarted;

    @Column(name = "trx_requested_lock_id")
    private String trxRequestedLockId;

    @Column(name = "trx_wait_started")
    private Date trxWaitStarted;

    @Column(name = "trx_weight")
    private Long trxWeight;

    @Column(name = "trx_mysql_thread_id")
    private Long trxMysqlThreadId;

    @Column(name = "trx_query")
    private String trxQuery;

    @Column(name = "trx_operation_state")
    private String trxOperationState;

    @Column(name = "trx_tables_in_use")
    private Long trxTablesInUse;

    @Column(name = "trx_tables_locked")
    private Long trxTablesLocked;

    @Column(name = "trx_lock_structs")
    private Long trxLockStructs;

    @Column(name = "trx_lock_memory_bytes")
    private Long trxLockMemoryBytes;

    @Column(name = "trx_rows_locked")
    private Long trxRowsLocked;

    @Column(name = "trx_rows_modified")
    private Long trxRowsModified;

    @Column(name = "trx_concurrency_tickets")
    private Long trxConcurrencyTickets;

    @Column(name = "trx_isolation_level")
    private String trxIsolationLevel;

    @Column(name = "trx_unique_checks")
    private Integer trxUniqueChecks;

    @Column(name = "trx_foreign_key_checks")
    private Integer trxForeignKeyChecks;

    @Column(name = "trx_last_foreign_key_error")
    private String trxLastForeignKeyError;

    @Column(name = "trx_adaptive_hash_latched")
    private Integer trxAdaptiveHashLatched;

    @Column(name = "trx_adaptive_hash_timeout")
    private Long trxAdaptiveHashTimeout;

    @Column(name = "trx_is_read_only")
    private Integer trxIsReadOnly;

    @Column(name = "trx_autocommit_non_locking")
    private Integer trxAutocommitNonLocking;

    @Column(name = "trx_schedule_weight")
    private Long trxScheduleWeight;

    /**
     * @return trx_id
     */
    public Long getTrxId() {
        return trxId;
    }

    /**
     * @param trxId
     */
    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    /**
     * @return trx_state
     */
    public String getTrxState() {
        return trxState;
    }

    /**
     * @param trxState
     */
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    /**
     * @return trx_started
     */
    public Date getTrxStarted() {
        return trxStarted;
    }

    /**
     * @param trxStarted
     */
    public void setTrxStarted(Date trxStarted) {
        this.trxStarted = trxStarted;
    }

    /**
     * @return trx_requested_lock_id
     */
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    /**
     * @param trxRequestedLockId
     */
    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    /**
     * @return trx_wait_started
     */
    public Date getTrxWaitStarted() {
        return trxWaitStarted;
    }

    /**
     * @param trxWaitStarted
     */
    public void setTrxWaitStarted(Date trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    /**
     * @return trx_weight
     */
    public Long getTrxWeight() {
        return trxWeight;
    }

    /**
     * @param trxWeight
     */
    public void setTrxWeight(Long trxWeight) {
        this.trxWeight = trxWeight;
    }

    /**
     * @return trx_mysql_thread_id
     */
    public Long getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    /**
     * @param trxMysqlThreadId
     */
    public void setTrxMysqlThreadId(Long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    /**
     * @return trx_query
     */
    public String getTrxQuery() {
        return trxQuery;
    }

    /**
     * @param trxQuery
     */
    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    /**
     * @return trx_operation_state
     */
    public String getTrxOperationState() {
        return trxOperationState;
    }

    /**
     * @param trxOperationState
     */
    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    /**
     * @return trx_tables_in_use
     */
    public Long getTrxTablesInUse() {
        return trxTablesInUse;
    }

    /**
     * @param trxTablesInUse
     */
    public void setTrxTablesInUse(Long trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    /**
     * @return trx_tables_locked
     */
    public Long getTrxTablesLocked() {
        return trxTablesLocked;
    }

    /**
     * @param trxTablesLocked
     */
    public void setTrxTablesLocked(Long trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    /**
     * @return trx_lock_structs
     */
    public Long getTrxLockStructs() {
        return trxLockStructs;
    }

    /**
     * @param trxLockStructs
     */
    public void setTrxLockStructs(Long trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    /**
     * @return trx_lock_memory_bytes
     */
    public Long getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    /**
     * @param trxLockMemoryBytes
     */
    public void setTrxLockMemoryBytes(Long trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    /**
     * @return trx_rows_locked
     */
    public Long getTrxRowsLocked() {
        return trxRowsLocked;
    }

    /**
     * @param trxRowsLocked
     */
    public void setTrxRowsLocked(Long trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    /**
     * @return trx_rows_modified
     */
    public Long getTrxRowsModified() {
        return trxRowsModified;
    }

    /**
     * @param trxRowsModified
     */
    public void setTrxRowsModified(Long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    /**
     * @return trx_concurrency_tickets
     */
    public Long getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    /**
     * @param trxConcurrencyTickets
     */
    public void setTrxConcurrencyTickets(Long trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    /**
     * @return trx_isolation_level
     */
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    /**
     * @param trxIsolationLevel
     */
    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    /**
     * @return trx_unique_checks
     */
    public Integer getTrxUniqueChecks() {
        return trxUniqueChecks;
    }

    /**
     * @param trxUniqueChecks
     */
    public void setTrxUniqueChecks(Integer trxUniqueChecks) {
        this.trxUniqueChecks = trxUniqueChecks;
    }

    /**
     * @return trx_foreign_key_checks
     */
    public Integer getTrxForeignKeyChecks() {
        return trxForeignKeyChecks;
    }

    /**
     * @param trxForeignKeyChecks
     */
    public void setTrxForeignKeyChecks(Integer trxForeignKeyChecks) {
        this.trxForeignKeyChecks = trxForeignKeyChecks;
    }

    /**
     * @return trx_last_foreign_key_error
     */
    public String getTrxLastForeignKeyError() {
        return trxLastForeignKeyError;
    }

    /**
     * @param trxLastForeignKeyError
     */
    public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
        this.trxLastForeignKeyError = trxLastForeignKeyError;
    }

    /**
     * @return trx_adaptive_hash_latched
     */
    public Integer getTrxAdaptiveHashLatched() {
        return trxAdaptiveHashLatched;
    }

    /**
     * @param trxAdaptiveHashLatched
     */
    public void setTrxAdaptiveHashLatched(Integer trxAdaptiveHashLatched) {
        this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
    }

    /**
     * @return trx_adaptive_hash_timeout
     */
    public Long getTrxAdaptiveHashTimeout() {
        return trxAdaptiveHashTimeout;
    }

    /**
     * @param trxAdaptiveHashTimeout
     */
    public void setTrxAdaptiveHashTimeout(Long trxAdaptiveHashTimeout) {
        this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
    }

    /**
     * @return trx_is_read_only
     */
    public Integer getTrxIsReadOnly() {
        return trxIsReadOnly;
    }

    /**
     * @param trxIsReadOnly
     */
    public void setTrxIsReadOnly(Integer trxIsReadOnly) {
        this.trxIsReadOnly = trxIsReadOnly;
    }

    /**
     * @return trx_autocommit_non_locking
     */
    public Integer getTrxAutocommitNonLocking() {
        return trxAutocommitNonLocking;
    }

    /**
     * @param trxAutocommitNonLocking
     */
    public void setTrxAutocommitNonLocking(Integer trxAutocommitNonLocking) {
        this.trxAutocommitNonLocking = trxAutocommitNonLocking;
    }

    /**
     * @return trx_schedule_weight
     */
    public Long getTrxScheduleWeight() {
        return trxScheduleWeight;
    }

    /**
     * @param trxScheduleWeight
     */
    public void setTrxScheduleWeight(Long trxScheduleWeight) {
        this.trxScheduleWeight = trxScheduleWeight;
    }
}