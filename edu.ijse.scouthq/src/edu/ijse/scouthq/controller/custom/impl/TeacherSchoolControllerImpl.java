/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.TeacherSchoolController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.TeacherSchoolDAO;
import edu.ijse.scouthq.dto.TeacherSchoolDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class TeacherSchoolControllerImpl implements TeacherSchoolController{

    TeacherSchoolDAO teacherSchoolDAO;

    public TeacherSchoolControllerImpl() {
        teacherSchoolDAO = (TeacherSchoolDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TEACHERSCHOOL);
    }
    
    @Override
    public boolean add(TeacherSchoolDTO teacherSchoolDTO) throws Exception {
        return teacherSchoolDAO.add(teacherSchoolDTO);
    }

    @Override
    public boolean update(TeacherSchoolDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherSchoolDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TeacherSchoolDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
