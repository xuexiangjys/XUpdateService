package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "ENGINES")
public class Engines {
    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "SUPPORT")
    private String support;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "TRANSACTIONS")
    private String transactions;

    @Column(name = "XA")
    private String xa;

    @Column(name = "SAVEPOINTS")
    private String savepoints;

    /**
     * @return ENGINE
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return SUPPORT
     */
    public String getSupport() {
        return support;
    }

    /**
     * @param support
     */
    public void setSupport(String support) {
        this.support = support;
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
     * @return TRANSACTIONS
     */
    public String getTransactions() {
        return transactions;
    }

    /**
     * @param transactions
     */
    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    /**
     * @return XA
     */
    public String getXa() {
        return xa;
    }

    /**
     * @param xa
     */
    public void setXa(String xa) {
        this.xa = xa;
    }

    /**
     * @return SAVEPOINTS
     */
    public String getSavepoints() {
        return savepoints;
    }

    /**
     * @param savepoints
     */
    public void setSavepoints(String savepoints) {
        this.savepoints = savepoints;
    }
}