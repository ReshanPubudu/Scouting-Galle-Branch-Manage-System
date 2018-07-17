/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.MemberCoreUpdateDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MemberCoreUpdateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberCoreUpdateDAOImpl implements MemberCoreUpdateDAO{

    Connection con;

    public MemberCoreUpdateDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MemberCoreUpdateDTO memberCoreUpdateDTO) throws Exception {
        String SQL = "insert into MemberCore values ('"+memberCoreUpdateDTO.getRegId()+"', '"+memberCoreUpdateDTO.getBadgeId()+"', '"+memberCoreUpdateDTO.getDate()+"', '"+memberCoreUpdateDTO.getDescription()+"')";
        PreparedStatement pstm = con.prepareStatement(SQL);
        return pstm.executeUpdate(SQL)>0;
    }

    @Override
    public MemberCoreUpdateDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MemberCoreUpdateDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MemberCoreUpdateDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
