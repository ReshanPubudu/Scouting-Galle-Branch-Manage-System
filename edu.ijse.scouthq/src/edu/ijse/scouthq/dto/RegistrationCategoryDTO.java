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
public class RegistrationCategoryDTO extends SuperDTO implements Serializable{
    private String regId;
    private String categoryId;

    public RegistrationCategoryDTO() {
    }

    public RegistrationCategoryDTO(String regId, String categoryId) {
        this.regId = regId;
        this.categoryId = categoryId;
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
