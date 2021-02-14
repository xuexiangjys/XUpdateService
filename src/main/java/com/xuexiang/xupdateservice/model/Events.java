package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "EVENTS")
public class Events {
    @Column(name = "EVENT_CATALOG")
    private String eventCatalog;

    @Column(name = "EVENT_SCHEMA")
    private String eventSchema;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "DEFINER")
    private String definer;

    @Column(name = "TIME_ZONE")
    private String timeZone;

    @Column(name = "EVENT_BODY")
    private String eventBody;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "EXECUTE_AT")
    private Date executeAt;

    @Column(name = "INTERVAL_VALUE")
    private String intervalValue;

    @Column(name = "INTERVAL_FIELD")
    private String intervalField;

    @Column(name = "SQL_MODE")
    private String sqlMode;

    @Column(name = "STARTS")
    private Date starts;

    @Column(name = "ENDS")
    private Date ends;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ON_COMPLETION")
    private String onCompletion;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_ALTERED")
    private Date lastAltered;

    @Column(name = "LAST_EXECUTED")
    private Date lastExecuted;

    @Column(name = "EVENT_COMMENT")
    private String eventComment;

    @Column(name = "ORIGINATOR")
    private Integer originator;

    @Column(name = "CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Column(name = "COLLATION_CONNECTION")
    private String collationConnection;

    @Column(name = "DATABASE_COLLATION")
    private String databaseCollation;

    @Column(name = "EVENT_DEFINITION")
    private String eventDefinition;

    /**
     * @return EVENT_CATALOG
     */
    public String getEventCatalog() {
        return eventCatalog;
    }

    /**
     * @param eventCatalog
     */
    public void setEventCatalog(String eventCatalog) {
        this.eventCatalog = eventCatalog;
    }

    /**
     * @return EVENT_SCHEMA
     */
    public String getEventSchema() {
        return eventSchema;
    }

    /**
     * @param eventSchema
     */
    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return DEFINER
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    /**
     * @return TIME_ZONE
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return EVENT_BODY
     */
    public String getEventBody() {
        return eventBody;
    }

    /**
     * @param eventBody
     */
    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    /**
     * @return EVENT_TYPE
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return EXECUTE_AT
     */
    public Date getExecuteAt() {
        return executeAt;
    }

    /**
     * @param executeAt
     */
    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    /**
     * @return INTERVAL_VALUE
     */
    public String getIntervalValue() {
        return intervalValue;
    }

    /**
     * @param intervalValue
     */
    public void setIntervalValue(String intervalValue) {
        this.intervalValue = intervalValue;
    }

    /**
     * @return INTERVAL_FIELD
     */
    public String getIntervalField() {
        return intervalField;
    }

    /**
     * @param intervalField
     */
    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    /**
     * @return SQL_MODE
     */
    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * @param sqlMode
     */
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    /**
     * @return STARTS
     */
    public Date getStarts() {
        return starts;
    }

    /**
     * @param starts
     */
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    /**
     * @return ENDS
     */
    public Date getEnds() {
        return ends;
    }

    /**
     * @param ends
     */
    public void setEnds(Date ends) {
        this.ends = ends;
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
     * @return ON_COMPLETION
     */
    public String getOnCompletion() {
        return onCompletion;
    }

    /**
     * @param onCompletion
     */
    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    /**
     * @return CREATED
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return LAST_ALTERED
     */
    public Date getLastAltered() {
        return lastAltered;
    }

    /**
     * @param lastAltered
     */
    public void setLastAltered(Date lastAltered) {
        this.lastAltered = lastAltered;
    }

    /**
     * @return LAST_EXECUTED
     */
    public Date getLastExecuted() {
        return lastExecuted;
    }

    /**
     * @param lastExecuted
     */
    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    /**
     * @return EVENT_COMMENT
     */
    public String getEventComment() {
        return eventComment;
    }

    /**
     * @param eventComment
     */
    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    /**
     * @return ORIGINATOR
     */
    public Integer getOriginator() {
        return originator;
    }

    /**
     * @param originator
     */
    public void setOriginator(Integer originator) {
        this.originator = originator;
    }

    /**
     * @return CHARACTER_SET_CLIENT
     */
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    /**
     * @param characterSetClient
     */
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    /**
     * @return COLLATION_CONNECTION
     */
    public String getCollationConnection() {
        return collationConnection;
    }

    /**
     * @param collationConnection
     */
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    /**
     * @return DATABASE_COLLATION
     */
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    /**
     * @param databaseCollation
     */
    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    /**
     * @return EVENT_DEFINITION
     */
    public String getEventDefinition() {
        return eventDefinition;
    }

    /**
     * @param eventDefinition
     */
    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }
}