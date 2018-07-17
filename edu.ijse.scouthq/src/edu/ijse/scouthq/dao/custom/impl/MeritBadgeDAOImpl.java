/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.MeritBadgeDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MeritBadgeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MeritBadgeDAOImpl implements MeritBadgeDAO{
    
    private final Connection con;

    public MeritBadgeDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MeritBadgeDTO meritBadgeDTO) throws Exception {
        String SQL = "insert into meritBadge values ('"+meritBadgeDTO.getBadgeId()+"', '"+meritBadgeDTO.getCategoryId()+"', '"+meritBadgeDTO.getBadgeName()+"', '"+meritBadgeDTO.getDescription()+"')";
        //String SQL = "insert into meritBadge values ('BgI2', 'BSC01', 'Name', 'Description')";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public MeritBadgeDTO search(String key) throws Exception {
        String SQL = "select * from meritBadge where badgeId = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        MeritBadgeDTO  meritBadgeDTO= new MeritBadgeDTO();
        while (rst.next()) {
            meritBadgeDTO.setBadgeId(rst.getString("badgeId"));
            meritBadgeDTO.setCategoryId(rst.getString("categoryId"));
            meritBadgeDTO.setBadgeName(rst.getString("badgeName"));
            meritBadgeDTO.setDescription(rst.getString("description"));
        }
        return meritBadgeDTO;
    }

    @Override
    public boolean update(MeritBadgeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MeritBadgeDTO> getAll() throws Exception {
        String SQL = "Select * from meritBadge";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery();
        ArrayList<MeritBadgeDTO> getAll = new ArrayList<>();
        while(rst.next()){
            MeritBadgeDTO meritBadgeDTO = new MeritBadgeDTO(
                    rst.getString("badgeId"),
                    rst.getString("categoryId"),
                    rst.getString("badgeName"),
                    rst.getString("description"));
            
            getAll.add(meritBadgeDTO);
        }
        return getAll;
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<MeritBadgeDTO> searchAndGetAllId(String cat) throws SQLException{
        String SQL = "select * from meritBadge where categoryId = '"+cat+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<MeritBadgeDTO> allBadge = new ArrayList<>();
        while (rst.next()) {
            MeritBadgeDTO  meritBadgeDTO= new MeritBadgeDTO();
            
            meritBadgeDTO.setBadgeId(rst.getString("badgeId"));
            //memberDTO.setName(rst.getString("name"));
            //memberDTO.setAddress(rst.getString("Address"));
            
            allBadge.add(meritBadgeDTO);
        }
        return allBadge;
    }

}
