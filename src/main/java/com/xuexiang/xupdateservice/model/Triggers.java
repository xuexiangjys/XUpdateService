package com.xuexiang.xupdateservice.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TRIGGERS")
public class Triggers {
    @Column(name = "TRIGGER_CATALOG")
    private String triggerCatalog;

    @Column(name = "TRIGGER_SCHEMA")
    private String triggerSchema;

    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Column(name = "EVENT_MANIPULATION")
    private String eventManipulation;

    @Column(name = "EVENT_OBJECT_CATALOG")
    private String eventObjectCatalog;

    @Column(name = "EVENT_OBJECT_SCHEMA")
    private String eventObjectSchema;

    @Column(name = "EVENT_OBJECT_TABLE")
    private String eventObjectTable;

    @Column(name = "ACTION_ORDER")
    private Integer actionOrder;

    @Column(name = "ACTION_ORIENTATION")
    private String actionOrientation;

    @Column(name = "ACTION_TIMING")
    private String actionTiming;

    @Column(name = "ACTION_REFERENCE_OLD_ROW")
    private String actionReferenceOldRow;

    @Column(name = "ACTION_REFERENCE_NEW_ROW")
    private String actionReferenceNewRow;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "SQL_MODE")
    private String sqlMode;

    @Column(name = "DEFINER")
    private String definer;

    @Column(name = "CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Column(name = "COLLATION_CONNECTION")
    private String collationConnection;

    @Column(name = "DATABASE_COLLATION")
    private String databaseCollation;

    @Column(name = "ACTION_CONDITION")
    private byte[] actionCondition;

    @Column(name = "ACTION_STATEMENT")
    private String actionStatement;

    @Column(name = "ACTION_REFERENCE_OLD_TABLE")
    private byte[] actionReferenceOldTable;

    @Column(name = "ACTION_REFERENCE_NEW_TABLE")
    private byte[] actionReferenceNewTable;

    /**
     * @return TRIGGER_CATALOG
     */
    public String getTriggerCatalog() {
        return triggerCatalog;
    }

    /**
     * @param triggerCatalog
     */
    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    /**
     * @return TRIGGER_SCHEMA
     */
    public String getTriggerSchema() {
        return triggerSchema;
    }

    /**
     * @param triggerSchema
     */
    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    /**
     * @return TRIGGER_NAME
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * @param triggerName
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * @return EVENT_MANIPULATION
     */
    public String getEventManipulation() {
        return eventManipulation;
    }

    /**
     * @param eventManipulation
     */
    public void setEventManipulation(String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    /**
     * @return EVENT_OBJECT_CATALOG
     */
    public String getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    /**
     * @param eventObjectCatalog
     */
    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    /**
     * @return EVENT_OBJECT_SCHEMA
     */
    public String getEventObjectSchema() {
        return eventObjectSchema;
    }

    /**
     * @param eventObjectSchema
     */
    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    /**
     * @return EVENT_OBJECT_TABLE
     */
    public String getEventObjectTable() {
        return eventObjectTable;
    }

    /**
     * @param eventObjectTable
     */
    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    /**
     * @return ACTION_ORDER
     */
    public Integer getActionOrder() {
        return actionOrder;
    }

    /**
     * @param actionOrder
     */
    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    /**
     * @return ACTION_ORIENTATION
     */
    public String getActionOrientation() {
        return actionOrientation;
    }

    /**
     * @param actionOrientation
     */
    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    /**
     * @return ACTION_TIMING
     */
    public String getActionTiming() {
        return actionTiming;
    }

    /**
     * @param actionTiming
     */
    public void setActionTiming(String actionTiming) {
        this.actionTiming = actionTiming;
    }

    /**
     * @return ACTION_REFERENCE_OLD_ROW
     */
    public String getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    /**
     * @param actionReferenceOldRow
     */
    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    /**
     * @return ACTION_REFERENCE_NEW_ROW
     */
    public String getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    /**
     * @param actionReferenceNewRow
     */
    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
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
     * @return ACTION_CONDITION
     */
    public byte[] getActionCondition() {
        return actionCondition;
    }

    /**
     * @param actionCondition
     */
    public void setActionCondition(byte[] actionCondition) {
        this.actionCondition = actionCondition;
    }

    /**
     * @return ACTION_STATEMENT
     */
    public String getActionStatement() {
        return actionStatement;
    }

    /**
     * @param actionStatement
     */
    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    /**
     * @return ACTION_REFERENCE_OLD_TABLE
     */
    public byte[] getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    /**
     * @param actionReferenceOldTable
     */
    public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    /**
     * @return ACTION_REFERENCE_NEW_TABLE
     */
    public byte[] getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    /**
     * @param actionReferenceNewTable
     */
    public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }
}