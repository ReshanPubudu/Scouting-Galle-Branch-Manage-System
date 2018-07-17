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
public class CoreBadgeDTO extends SuperDTO implements Serializable {
    private String badgeId;
    private String categoryId;
    private String badgeName;
    private String timePeriode;
    private String description;

    public CoreBadgeDTO() {
    }

    public CoreBadgeDTO(String badgeId, String categoryId, String badgeName, String timePeriode, String description) {
        this.badgeId = badgeId;
        this.categoryId = categoryId;
        this.badgeName = badgeName;
        this.timePeriode = timePeriode;
        this.description = description;
    }

    /**
     * @return the badgeName
     */
    public String getBadgeName() {
        return badgeName;
    }

    /**
     * @param badgeName the badgeName to set
     */
    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
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
     * @return the timePeriode
     */
    public String getTimePeriode() {
        return timePeriode;
    }

    /**
     * @param timePeriode the timePeriode to set
     */
    public void setTimePeriode(String timePeriode) {
        this.timePeriode = timePeriode;
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

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
}
