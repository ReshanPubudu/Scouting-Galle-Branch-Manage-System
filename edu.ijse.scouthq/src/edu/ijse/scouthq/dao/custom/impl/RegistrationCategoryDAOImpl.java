/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.RegistrationCategoryDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MemberDTO;
import edu.ijse.scouthq.dto.RegistrationCategoryDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class RegistrationCategoryDAOImpl implements RegistrationCategoryDAO {
    
    private final Connection con;
    
    public RegistrationCategoryDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(RegistrationCategoryDTO regCatDTO) throws Exception {
        String SQL = "Insert into registrationCategory values ('"+regCatDTO.getRegId()+"', '"+regCatDTO.getCategoryId()+"')";
        //String SQL = "Insert into registrationCategory values ('MR1', 'RSC01')";
        PreparedStatement pstm = con.prepareStatement(SQL);
        return pstm.executeUpdate(SQL)>0;
    }

    @Override
    public RegistrationCategoryDTO search(String key) throws Exception {
        String SQL = "select * from registrationCategory where regid = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery();
        RegistrationCategoryDTO registrationCategoryDTO = new RegistrationCategoryDTO();
        if(rst.next()){
            registrationCategoryDTO.setRegId(rst.getString("regId"));
            registrationCategoryDTO.setCategoryId(rst.getString("categoryId"));
        }
        return registrationCategoryDTO;
    }

    @Override
    public boolean update(RegistrationCategoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RegistrationCategoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<MemberDTO> serchAndGetAllId(String cat) throws SQLException{
        String SQL = "select * from registrationCategory where categoryId = '"+cat+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<MemberDTO> allMember = new ArrayList<>();
        while (rst.next()) {
            MemberDTO  memberDTO= new MemberDTO();
            
            memberDTO.setRegId(rst.getString("regId"));
            //memberDTO.setName(rst.getString("name"));
            //memberDTO.setAddress(rst.getString("Address"));
            
            allMember.add(memberDTO);
        }
        return allMember; 
    }
    
}
