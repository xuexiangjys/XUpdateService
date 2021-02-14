package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "INNODB_METRICS")
public class InnodbMetrics {
    @Column(name = "NAME")
    private String name;

    @Column(name = "SUBSYSTEM")
    private String subsystem;

    @Column(name = "COUNT")
    private Long count;

    @Column(name = "MAX_COUNT")
    private Long maxCount;

    @Column(name = "MIN_COUNT")
    private Long minCount;

    @Column(name = "AVG_COUNT")
    private Float avgCount;

    @Column(name = "COUNT_RESET")
    private Long countReset;

    @Column(name = "MAX_COUNT_RESET")
    private Long maxCountReset;

    @Column(name = "MIN_COUNT_RESET")
    private Long minCountReset;

    @Column(name = "AVG_COUNT_RESET")
    private Float avgCountReset;

    @Column(name = "TIME_ENABLED")
    private Date timeEnabled;

    @Column(name = "TIME_DISABLED")
    private Date timeDisabled;

    @Column(name = "TIME_ELAPSED")
    private Long timeElapsed;

    @Column(name = "TIME_RESET")
    private Date timeReset;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "COMMENT")
    private String comment;

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return SUBSYSTEM
     */
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * @param subsystem
     */
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    /**
     * @return COUNT
     */
    public Long getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * @return MAX_COUNT
     */
    public Long getMaxCount() {
        return maxCount;
    }

    /**
     * @param maxCount
     */
    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * @return MIN_COUNT
     */
    public Long getMinCount() {
        return minCount;
    }

    /**
     * @param minCount
     */
    public void setMinCount(Long minCount) {
        this.minCount = minCount;
    }

    /**
     * @return AVG_COUNT
     */
    public Float getAvgCount() {
        return avgCount;
    }

    /**
     * @param avgCount
     */
    public void setAvgCount(Float avgCount) {
        this.avgCount = avgCount;
    }

    /**
     * @return COUNT_RESET
     */
    public Long getCountReset() {
        return countReset;
    }

    /**
     * @param countReset
     */
    public void setCountReset(Long countReset) {
        this.countReset = countReset;
    }

    /**
     * @return MAX_COUNT_RESET
     */
    public Long getMaxCountReset() {
        return maxCountReset;
    }

    /**
     * @param maxCountReset
     */
    public void setMaxCountReset(Long maxCountReset) {
        this.maxCountReset = maxCountReset;
    }

    /**
     * @return MIN_COUNT_RESET
     */
    public Long getMinCountReset() {
        return minCountReset;
    }

    /**
     * @param minCountReset
     */
    public void setMinCountReset(Long minCountReset) {
        this.minCountReset = minCountReset;
    }

    /**
     * @return AVG_COUNT_RESET
     */
    public Float getAvgCountReset() {
        return avgCountReset;
    }

    /**
     * @param avgCountReset
     */
    public void setAvgCountReset(Float avgCountReset) {
        this.avgCountReset = avgCountReset;
    }

    /**
     * @return TIME_ENABLED
     */
    public Date getTimeEnabled() {
        return timeEnabled;
    }

    /**
     * @param timeEnabled
     */
    public void setTimeEnabled(Date timeEnabled) {
        this.timeEnabled = timeEnabled;
    }

    /**
     * @return TIME_DISABLED
     */
    public Date getTimeDisabled() {
        return timeDisabled;
    }

    /**
     * @param timeDisabled
     */
    public void setTimeDisabled(Date timeDisabled) {
        this.timeDisabled = timeDisabled;
    }

    /**
     * @return TIME_ELAPSED
     */
    public Long getTimeElapsed() {
        return timeElapsed;
    }

    /**
     * @param timeElapsed
     */
    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    /**
     * @return TIME_RESET
     */
    public Date getTimeReset() {
        return timeReset;
    }

    /**
     * @param timeReset
     */
    public void setTimeReset(Date timeReset) {
        this.timeReset = timeReset;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
}