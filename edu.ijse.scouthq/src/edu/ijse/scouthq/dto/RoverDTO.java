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
public class RoverDTO extends SuperDTO implements Serializable{
    private String regId;
    private String nameInit;
    private String nameFull;
    private String dateOfBirth;
    private String address;
    private String tp;
    private String joiningDate;
    private String registedDate;
    private RegistrationCategoryDTO regCatDTO;

    public RoverDTO() {
    }

    public RoverDTO(String regId, String nameInit, String nameFull, String dateOfBirth, String address, String tp, String joiningDate, String registedDate) {
        this.regId = regId;
        this.nameInit = nameInit;
        this.nameFull = nameFull;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.tp = tp;
        this.joiningDate = joiningDate;
        this.registedDate = registedDate;
    }

    public RoverDTO(String regId, String nameInit, String nameFull, String dateOfBirth, String address, String tp, String joiningDate, String registedDate, RegistrationCategoryDTO regCatDTO) {
        this.regId = regId;
        this.nameInit = nameInit;
        this.nameFull = nameFull;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.tp = tp;
        this.joiningDate = joiningDate;
        this.registedDate = registedDate;
        this.regCatDTO = regCatDTO;
    }

    /**
     * @return the rId
     */
    public String getRegId() {
        return regId;
    }

    /**
     * @param regId
     */
    public void setRegId(String regId) {
        this.regId = regId;
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
     * @return the regCatDTO
     */
    public RegistrationCategoryDTO getRegCatDTO() {
        return regCatDTO;
    }

    /**
     * @param regCatDTO the regCatDTO to set
     */
    public void setRegCatDTO(RegistrationCategoryDTO regCatDTO) {
        this.regCatDTO = regCatDTO;
    }
}
