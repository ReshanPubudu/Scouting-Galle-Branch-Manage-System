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
public class QueryDTO extends SuperDTO implements Serializable{
    private String regId;
    private String catId;
    private String nameInit;
    private String nameFull;
    private String dateOfBirth;
    private String address;
    private String tp;
    private String sclId;
    private String joiningDate;
    private String registedDate;
    private String viewBy;
    private String assendnBy;

    public QueryDTO() {
    }

    public QueryDTO(String regId, String catId, String nameInit, String nameFull, String dateOfBirth, String address, String tp, String sclId, String joiningDate, String registedDate, String viewBy, String assendnBy) {
        this.regId = regId;
        this.catId = catId;
        this.nameInit = nameInit;
        this.nameFull = nameFull;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.tp = tp;
        this.sclId = sclId;
        this.joiningDate = joiningDate;
        this.registedDate = registedDate;
        this.viewBy = viewBy;
        this.assendnBy = assendnBy;
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
     * @return the catId
     */
    public String getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(String catId) {
        this.catId = catId;
    }

    /**
     * @return the nameInit
     */
    public String getNameInit() {
        return nameInit;
    }

    /**
     * @param nameInit the nameInit to set
     */
    public void setNameInit(String nameInit) {
        this.nameInit = nameInit;
    }

    /**
     * @return the nameFull
     */
    public String getNameFull() {
        return nameFull;
    }

    /**
     * @param nameFull the nameFull to set
     */
    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the tp
     */
    public String getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(String tp) {
        this.tp = tp;
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

    /**
     * @return the joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the registedDate
     */
    public String getRegistedDate() {
        return registedDate;
    }

    /**
     * @param registedDate the registedDate to set
     */
    public void setRegistedDate(String registedDate) {
        this.registedDate = registedDate;
    }

    /**
     * @return the viewBy
     */
    public String getViewBy() {
        return viewBy;
    }

    /**
     * @param viewBy the viewBy to set
     */
    public void setViewBy(String viewBy) {
        this.viewBy = viewBy;
    }

    /**
     * @return the assendnBy
     */
    public String getAssendnBy() {
        return assendnBy;
    }

    /**
     * @param assendnBy the assendnBy to set
     */
    public void setAssendnBy(String assendnBy) {
        this.assendnBy = assendnBy;
    }
    
    
}
