/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.TeacherSchoolDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.TeacherSchoolDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class TeacherSchoolDAOImpl implements TeacherSchoolDAO{

    private final Connection con ;
    
    public TeacherSchoolDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(TeacherSchoolDTO teacherSchoolDTO) throws Exception {
        String SQL = "insert into teacherSchool value('"+teacherSchoolDTO.gettId()+"', '"+teacherSchoolDTO.getSclId()+"')";
        PreparedStatement pstm = con.prepareStatement(SQL);
        return pstm.executeUpdate(SQL) > 0;
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
