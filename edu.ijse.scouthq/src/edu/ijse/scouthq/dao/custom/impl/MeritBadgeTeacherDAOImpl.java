/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.MeritBadgeTeacherDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MeritBadgeTeacherDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MeritBadgeTeacherDAOImpl implements MeritBadgeTeacherDAO{

    private final Connection con;

    public MeritBadgeTeacherDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MeritBadgeTeacherDTO meritBadgeTeacherDTO) throws Exception {
        String SQL = "insert into meritBadgeTeacher value('"+meritBadgeTeacherDTO.getBadgeId()+"', '"+meritBadgeTeacherDTO.gettId()+"')";
        PreparedStatement pstm = con.prepareStatement(SQL);
        return pstm.executeUpdate(SQL) > 0;
    }
   
    @Override
    public MeritBadgeTeacherDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MeritBadgeTeacherDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MeritBadgeTeacherDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<MeritBadgeTeacherDTO> searchAndGetAllId(String badgeId) throws SQLException {
        String SQL = "select * from meritBadgeTeacher where badgeId = '"+badgeId+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<MeritBadgeTeacherDTO> allBadge = new ArrayList<>();
        while (rst.next()) {
            MeritBadgeTeacherDTO  meritBadgeTeacherDTO= new MeritBadgeTeacherDTO();
            
            meritBadgeTeacherDTO.setBadgeId(rst.getString("badgeId"));
            meritBadgeTeacherDTO.settId(rst.getString("tId"));
            
            allBadge.add(meritBadgeTeacherDTO);
        }
        return allBadge;
    }
    
}
