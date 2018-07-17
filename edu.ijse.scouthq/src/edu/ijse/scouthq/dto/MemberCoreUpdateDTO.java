/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dto;

import java.io.Serializable;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberCoreUpdateDTO extends SuperDTO implements Serializable{
    private String regId;
    private String badgeId;
    private String date;
    private String description;

    public MemberCoreUpdateDTO() {
    }

    public MemberCoreUpdateDTO(String regId, String badgeId, String date, String description) {
        this.regId = regId;
        this.badgeId = badgeId;
        this.date = date;
        this.description = description;
    }

    /**
     * @return the regId
     */
    public String getRegId() {
        return regId;
    }

    /**
     * @param regId the regId to set
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * @return the badgeId
     */
    public String getBadgeId() {
        return badgeId;
    }

    /**
     * @param badgeId the badgeId to set
     */
    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
