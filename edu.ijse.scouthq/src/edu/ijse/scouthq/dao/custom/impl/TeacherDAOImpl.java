/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.TeacherDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.TeacherDAO;

/**
 *
 * @author Reshan Pubudu
 */
public class TeacherDAOImpl implements TeacherDAO{

    private final Connection con ;
    
    public TeacherDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(TeacherDTO teacherDTO) throws Exception {
        String SQL = "insert into teacher values ('"+teacherDTO.getTId()+"', '"+teacherDTO.getNameInit()+"', '"+teacherDTO.getNameFull()+"', '"+teacherDTO.getDateOfBirth()+"', '"+teacherDTO.getAddress()+"', "+teacherDTO.getTp()+", '"+teacherDTO.getJoiningDate()+"', '"+teacherDTO.getRegistedDate()+"')";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public boolean update(TeacherDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherDTO search(String tId) throws Exception {
        String SQL = "select * from teacher where tid = '"+tId+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        if(rst.next()){
            TeacherDTO teacherDTO = new TeacherDTO(
                    rst.getString("tid"),
                    rst.getString("nameInit"),
                    rst.getString("nameFull"),
                    rst.getString("dateOfBirth"),
                    rst.getString("address"),
                    rst.getString("tp"),
                    rst.getString("joiningDate"),
                    rst.getString("registedDate"));
            return teacherDTO;
        }
        return null;
    }

    @Override
    public ArrayList<TeacherDTO> getAll() throws Exception {
        String SQL = "select * from teacher";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<TeacherDTO> teacherDTO = new ArrayList<>();
        while(rst.next()){
            TeacherDTO teacherDto = new TeacherDTO(
                rst.getString("tid"),
                rst.getString("nameInit"),
                rst.getString("nameFull"),
                rst.getString("dateOfBirth"),
                rst.getString("address"),
                rst.getString("tp"),
                rst.getString("joiningDate"),
                rst.getString("registedDate"));
            
            teacherDTO.add(teacherDto);
        }
        return teacherDTO;
    }

    @Override
    public String getId() throws Exception {
        String SQL = "select tId from teacher order by tId desc limit 1;";
        PreparedStatement stm = con.prepareStatement(SQL);
        ResultSet rst =  stm.executeQuery(SQL);
        String regId;
        if(rst.next()){
            regId = rst.getString("tId");
            return regId;
        }
        return null;
    }
    
}
