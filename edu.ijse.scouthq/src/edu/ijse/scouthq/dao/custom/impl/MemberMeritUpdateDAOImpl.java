/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.MemberMeritUpdateDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MemberMeritUpdateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberMeritUpdateDAOImpl implements MemberMeritUpdateDAO{

    Connection con;

    public MemberMeritUpdateDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MemberMeritUpdateDTO meritUpdateDTO) throws Exception {
        String SQL = "insert into MemberMerit values ('"+meritUpdateDTO.getRegId()+"', '"+meritUpdateDTO.getBadgeId()+"', '"+meritUpdateDTO.gettId()+"', '"+meritUpdateDTO.getDate()+"', '"+meritUpdateDTO.getDescription()+"')";
        PreparedStatement pstm = con.prepareStatement(SQL);
        return pstm.executeUpdate(SQL)>0;
    }

    @Override
    public MemberMeritUpdateDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MemberMeritUpdateDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MemberMeritUpdateDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
