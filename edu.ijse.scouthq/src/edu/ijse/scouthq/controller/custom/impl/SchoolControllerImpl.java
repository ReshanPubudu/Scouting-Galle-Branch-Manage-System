/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dto.SchoolDTO;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.SchoolDAO;
import edu.ijse.scouthq.controller.custom.SchoolController;

/**
 *
 * @author Reshan Pubudu
 */
public class SchoolControllerImpl implements SchoolController{

    private final SchoolDAO ctrlSchool;
    
    public SchoolControllerImpl(){
        ctrlSchool = (SchoolDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHOOL);
    }
    
    @Override
    public boolean add(SchoolDTO schoolDTO) throws Exception {
        return ctrlSchool.add(schoolDTO);
    }

    @Override
    public boolean update(SchoolDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SchoolDTO search(String key) throws Exception {
        return ctrlSchool.search(key);
    }

    @Override
    public ArrayList<SchoolDTO> getAll() throws Exception {
        return ctrlSchool.getAll();
    }
    
    @Override
    public String getId() throws Exception{
        return ctrlSchool.getId();
    }
    
}   