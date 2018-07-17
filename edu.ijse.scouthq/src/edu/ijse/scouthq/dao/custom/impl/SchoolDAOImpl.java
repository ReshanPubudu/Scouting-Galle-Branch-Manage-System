/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.SchoolDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.SchoolDAO;

/**
 *
 * @author Reshan Pubudu
 */
public class SchoolDAOImpl implements SchoolDAO{

    private final Connection con;
    
    public SchoolDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(SchoolDTO schoolDTO) throws Exception {
        String SQL = "insert into school values ('"+schoolDTO.getSclId()+"', '"+schoolDTO.getName()+"', '"+schoolDTO.getAddress()+"', "+schoolDTO.getTp()+", '"+schoolDTO.getDescrption()+"', '"+schoolDTO.getStartedDate()+"', '"+schoolDTO.getRegistedDate()+"');";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
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
        String SQL = "Select * from school where sclId = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery();
        SchoolDTO schoolDTO = new SchoolDTO();
        while(rst.next()){
            schoolDTO.setSclId(rst.getString("sclId"));
            schoolDTO.setName(rst.getString("name"));
            schoolDTO.setAddress(rst.getString("address"));
            schoolDTO.setTp(rst.getString("tp"));
            schoolDTO.setDescrption(rst.getString("disecription"));
            schoolDTO.setStartedDate(rst.getString("startedDate"));
            schoolDTO.setRegistedDate(rst.getString("registedDate"));
        }
        return schoolDTO;
    }

    @Override
    public ArrayList<SchoolDTO> getAll() throws Exception {
        String SQL = "Select * from school";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery();
        ArrayList<SchoolDTO> getAll = new ArrayList<>();
        while(rst.next()){
            SchoolDTO schoolDTO = new SchoolDTO();
            
            schoolDTO.setSclId(rst.getString("sclId"));
            schoolDTO.setName(rst.getString("name"));
            schoolDTO.setAddress(rst.getString("address"));
            schoolDTO.setTp(rst.getString("tp"));
            schoolDTO.setDescrption(rst.getString("disecription"));
            schoolDTO.setStartedDate(rst.getString("startedDate"));
            schoolDTO.setRegistedDate(rst.getString("registedDate"));
            
            getAll.add(schoolDTO);
        }
        return getAll;
    }

    @Override
    public String getId() throws Exception {
        String SQL = "select sclId from school order by sclId desc limit 1;";
        PreparedStatement stm = con.prepareStatement(SQL);
        ResultSet rst =  stm.executeQuery(SQL);
        String regId;
        if(rst.next()){
            regId = rst.getString("sclId");
            return regId;
        }
        return null;
    }
    
}
