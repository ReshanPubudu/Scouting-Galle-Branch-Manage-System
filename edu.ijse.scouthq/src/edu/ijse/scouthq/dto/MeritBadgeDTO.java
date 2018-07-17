/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MeritBadgeDTO extends SuperDTO implements Serializable{

    private String badgeId;
    private String categoryId;
    private String badgeName;
    private String description;
    private ArrayList<MeritBadgeTeacherDTO> meritBgTeacherDTO;

    public MeritBadgeDTO() {
    }

    public MeritBadgeDTO(String badgeId, String categoryId, String badgeName, String description) {
        this.badgeId = badgeId;
        this.categoryId = categoryId;
        this.badgeName = badgeName;
        this.description = description;
    }

    public MeritBadgeDTO(String badgeId, String categoryId, String badgeName, String description, ArrayList<MeritBadgeTeacherDTO> meritBgTeacherDTO) {
        this.badgeId = badgeId;
        this.categoryId = categoryId;
        this.badgeName = badgeName;
        this.description = description;
        this.meritBgTeacherDTO = meritBgTeacherDTO;
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
     * @return the meritBgTeacherDTO
     */
    public ArrayList<MeritBadgeTeacherDTO> getMeritBgTeacherDTO() {
        return meritBgTeacherDTO;
    }

    /**
     * @param meritBgTeacherDTO the meritBgTeacherDTO to set
     */
    public void setMeritBgTeacherDTO(ArrayList<MeritBadgeTeacherDTO> meritBgTeacherDTO) {
        this.meritBgTeacherDTO = meritBgTeacherDTO;
    }
    
    
}
