package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "INNODB_VIRTUAL")
public class InnodbVirtual {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "POS")
    private Integer pos;

    @Column(name = "BASE_POS")
    private Integer basePos;

    /**
     * @return TABLE_ID
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * @return POS
     */
    public Integer getPos() {
        return pos;
    }

    /**
     * @param pos
     */
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    /**
     * @return BASE_POS
     */
    public Integer getBasePos() {
        return basePos;
    }

    /**
     * @param basePos
     */
    public void setBasePos(Integer basePos) {
        this.basePos = basePos;
    }
}