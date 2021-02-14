package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "PROFILING")
public class Profiling {
    @Column(name = "QUERY_ID")
    private Integer queryId;

    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "STATE")
    private String state;

    @Column(name = "DURATION")
    private Short duration;

    @Column(name = "CPU_USER")
    private Short cpuUser;

    @Column(name = "CPU_SYSTEM")
    private Short cpuSystem;

    @Column(name = "CONTEXT_VOLUNTARY")
    private Integer contextVoluntary;

    @Column(name = "CONTEXT_INVOLUNTARY")
    private Integer contextInvoluntary;

    @Column(name = "BLOCK_OPS_IN")
    private Integer blockOpsIn;

    @Column(name = "BLOCK_OPS_OUT")
    private Integer blockOpsOut;

    @Column(name = "MESSAGES_SENT")
    private Integer messagesSent;

    @Column(name = "MESSAGES_RECEIVED")
    private Integer messagesReceived;

    @Column(name = "PAGE_FAULTS_MAJOR")
    private Integer pageFaultsMajor;

    @Column(name = "PAGE_FAULTS_MINOR")
    private Integer pageFaultsMinor;

    @Column(name = "SWAPS")
    private Integer swaps;

    @Column(name = "SOURCE_FUNCTION")
    private String sourceFunction;

    @Column(name = "SOURCE_FILE")
    private String sourceFile;

    @Column(name = "SOURCE_LINE")
    private Integer sourceLine;

    /**
     * @return QUERY_ID
     */
    public Integer getQueryId() {
        return queryId;
    }

    /**
     * @param queryId
     */
    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    /**
     * @return SEQ
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * @param seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return DURATION
     */
    public Short getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Short duration) {
        this.duration = duration;
    }

    /**
     * @return CPU_USER
     */
    public Short getCpuUser() {
        return cpuUser;
    }

    /**
     * @param cpuUser
     */
    public void setCpuUser(Short cpuUser) {
        this.cpuUser = cpuUser;
    }

    /**
     * @return CPU_SYSTEM
     */
    public Short getCpuSystem() {
        return cpuSystem;
    }

    /**
     * @param cpuSystem
     */
    public void setCpuSystem(Short cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    /**
     * @return CONTEXT_VOLUNTARY
     */
    public Integer getContextVoluntary() {
        return contextVoluntary;
    }

    /**
     * @param contextVoluntary
     */
    public void setContextVoluntary(Integer contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    /**
     * @return CONTEXT_INVOLUNTARY
     */
    public Integer getContextInvoluntary() {
        return contextInvoluntary;
    }

    /**
     * @param contextInvoluntary
     */
    public void setContextInvoluntary(Integer contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    /**
     * @return BLOCK_OPS_IN
     */
    public Integer getBlockOpsIn() {
        return blockOpsIn;
    }

    /**
     * @param blockOpsIn
     */
    public void setBlockOpsIn(Integer blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    /**
     * @return BLOCK_OPS_OUT
     */
    public Integer getBlockOpsOut() {
        return blockOpsOut;
    }

    /**
     * @param blockOpsOut
     */
    public void setBlockOpsOut(Integer blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    /**
     * @return MESSAGES_SENT
     */
    public Integer getMessagesSent() {
        return messagesSent;
    }

    /**
     * @param messagesSent
     */
    public void setMessagesSent(Integer messagesSent) {
        this.messagesSent = messagesSent;
    }

    /**
     * @return MESSAGES_RECEIVED
     */
    public Integer getMessagesReceived() {
        return messagesReceived;
    }

    /**
     * @param messagesReceived
     */
    public void setMessagesReceived(Integer messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    /**
     * @return PAGE_FAULTS_MAJOR
     */
    public Integer getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    /**
     * @param pageFaultsMajor
     */
    public void setPageFaultsMajor(Integer pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    /**
     * @return PAGE_FAULTS_MINOR
     */
    public Integer getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    /**
     * @param pageFaultsMinor
     */
    public void setPageFaultsMinor(Integer pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    /**
     * @return SWAPS
     */
    public Integer getSwaps() {
        return swaps;
    }

    /**
     * @param swaps
     */
    public void setSwaps(Integer swaps) {
        this.swaps = swaps;
    }

    /**
     * @return SOURCE_FUNCTION
     */
    public String getSourceFunction() {
        return sourceFunction;
    }

    /**
     * @param sourceFunction
     */
    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    /**
     * @return SOURCE_FILE
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * @param sourceFile
     */
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * @return SOURCE_LINE
     */
    public Integer getSourceLine() {
        return sourceLine;
    }

    /**
     * @param sourceLine
     */
    public void setSourceLine(Integer sourceLine) {
        this.sourceLine = sourceLine;
    }
}