package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "CHARACTER_SETS")
public class CharacterSets {
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "DEFAULT_COLLATE_NAME")
    private String defaultCollateName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MAXLEN")
    private Integer maxlen;

    /**
     * @return CHARACTER_SET_NAME
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * @return DEFAULT_COLLATE_NAME
     */
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    /**
     * @param defaultCollateName
     */
    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return MAXLEN
     */
    public Integer getMaxlen() {
        return maxlen;
    }

    /**
     * @param maxlen
     */
    public void setMaxlen(Integer maxlen) {
        this.maxlen = maxlen;
    }
}