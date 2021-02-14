package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "COLLATION_CHARACTER_SET_APPLICABILITY")
public class CollationCharacterSetApplicability {
    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    /**
     * @return COLLATION_NAME
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * @param collationName
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

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
}