package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "KEYWORDS")
public class Keywords {
    @Column(name = "WORD")
    private String word;

    @Column(name = "RESERVED")
    private Integer reserved;

    /**
     * @return WORD
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return RESERVED
     */
    public Integer getReserved() {
        return reserved;
    }

    /**
     * @param reserved
     */
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }
}