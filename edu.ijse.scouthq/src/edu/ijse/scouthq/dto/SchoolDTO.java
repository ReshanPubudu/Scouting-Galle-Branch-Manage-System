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
public class SchoolDTO extends SuperDTO implements Serializable{
    private String sclId;
    private String name;
    private String address;
    private String tp;
    private String descrption;
    private String startedDate;
    private String registedDate;

    public SchoolDTO() {
    }
    
    public SchoolDTO(String sclId, String name, String address, String tp,String descrption, String startedDate, String registedDate){
        this.sclId = sclId;
        this.name = name;
        this.address = address;
        this.tp = tp;
        this.descrption = descrption;
        this.startedDate = startedDate;
        this.registedDate = registedDate;
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
     * @return the sclName
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the startedDate
     */
    public String getStartedDate() {
        return startedDate;
    }

    /**
     * @param startedDate the startedDate to set
     */
    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
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
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
    
    
         
}
