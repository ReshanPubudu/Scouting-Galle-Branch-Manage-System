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
public class MeritBadgeTeacherDTO extends SuperDTO implements Serializable{
    private String badgeId;
    private String tId;

    public MeritBadgeTeacherDTO() {
    
    }

    public MeritBadgeTeacherDTO(String badgeId, String tId) {
        this.badgeId = badgeId;
        this.tId = tId;
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
     * @return the tId
     */
    public String gettId() {
        return tId;
    }

    /**
     * @param tId the tId to set
     */
    public void settId(String tId) {
        this.tId = tId;
    }
    
    
}
