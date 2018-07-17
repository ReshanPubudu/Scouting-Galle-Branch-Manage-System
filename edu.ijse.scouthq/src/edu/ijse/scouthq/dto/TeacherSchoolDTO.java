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
public class TeacherSchoolDTO extends SuperDTO implements Serializable{
    private String tId;
    private String sclId;

    public TeacherSchoolDTO() {
    }

    public TeacherSchoolDTO(String tId, String sclId) {
        this.tId = tId;
        this.sclId = sclId;
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

    /**
     * @return the sclId
     */
    public String getSclId() {
        return sclId;
    }

    /**
     * @param sclId the sclId to set
     */
    public void setSclId(String sclId) {
        this.sclId = sclId;
    }
    
    
}
