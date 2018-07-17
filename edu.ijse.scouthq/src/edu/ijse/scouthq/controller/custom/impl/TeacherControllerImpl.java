/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dto.TeacherDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.TeacherDAO;
import edu.ijse.scouthq.controller.custom.TeacherController;
import edu.ijse.scouthq.dao.custom.TeacherSchoolDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.TeacherSchoolDTO;
import java.sql.Connection;

/**
 *
 * @author Reshan Pubudu
 */
public class TeacherControllerImpl implements TeacherController{
    
    private final TeacherDAO ctrlTeacher;
    private final TeacherSchoolDAO ctrlTeacherSchoolDAO;
    
    public TeacherControllerImpl(){
        ctrlTeacher = (TeacherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TEACHER);
        ctrlTeacherSchoolDAO = (TeacherSchoolDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TEACHERSCHOOL);
    }

    @Override
    public boolean add(TeacherDTO teacherDTO) throws Exception {
        Connection con = ConnectionFactory.getInstance().getConnection();
        try{
            con.setAutoCommit(false);
            boolean meritAd = ctrlTeacher.add(teacherDTO);
            if(meritAd){
                ArrayList<TeacherSchoolDTO> teacherSchoolDTO = teacherDTO.getTeacherSchoolDTO();
                int i = 0, j =0;
                for(TeacherSchoolDTO teacherSchoolDTO1 : teacherSchoolDTO){
                    i++;
                    boolean added = ctrlTeacherSchoolDAO.add(teacherSchoolDTO1);
                    if(added){
                        j++;
                    }
                }
                if(i==j){
                    con.commit();
                    return true;
                }else{
                    con.rollback();
                    return false;
                }
            }
            con.rollback();
            return false;
        }finally{
            con.setAutoCommit(true);
        }
    }

    @Override
    public boolean update(TeacherDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherDTO search(String key) throws Exception {
        return ctrlTeacher.search(key);
    }

    @Override
    public ArrayList<TeacherDTO> getAll() throws Exception {
        return ctrlTeacher.getAll();
    }
    
    @Override
    public String getId() throws ClassNotFoundException, SQLException, Exception{
        return ctrlTeacher.getId();
    }
}
