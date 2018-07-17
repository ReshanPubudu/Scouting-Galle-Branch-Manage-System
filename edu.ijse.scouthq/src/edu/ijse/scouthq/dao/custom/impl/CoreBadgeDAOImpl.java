/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.CoreBadgeDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.CoreBadgeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class CoreBadgeDAOImpl implements CoreBadgeDAO{
    
    private final Connection con;

    public CoreBadgeDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(CoreBadgeDTO coreBadgeDTO) throws Exception {
        String SQL = "insert into coreBadge values ('"+coreBadgeDTO.getBadgeId()+"', '"+coreBadgeDTO.getCategoryId()+"', '"+coreBadgeDTO.getBadgeName()+"', '"+coreBadgeDTO.getTimePeriode()+"', '"+coreBadgeDTO.getDescription()+"')";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public CoreBadgeDTO search(String key) throws Exception {
        String SQL = "select * from coreBadge where badgeId = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        CoreBadgeDTO coreBadgeDTO= new CoreBadgeDTO();
        while (rst.next()) {
            coreBadgeDTO.setBadgeId(rst.getString("badgeId"));
            coreBadgeDTO.setCategoryId(rst.getString("categoryId"));
            coreBadgeDTO.setBadgeName(rst.getString("badgeName"));
            coreBadgeDTO.setTimePeriode(rst.getString("timePrd"));
            coreBadgeDTO.setDescription(rst.getString("description"));
        }
        return coreBadgeDTO;
    }

    @Override
    public boolean update(CoreBadgeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CoreBadgeDTO> getAll() throws Exception {
        String SQL = "Select * from coreBadge";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery();
        ArrayList<CoreBadgeDTO> getAll = new ArrayList<>();
        while(rst.next()){
            CoreBadgeDTO badgeDTO = new CoreBadgeDTO(
                    rst.getString("badgeId"),
                    rst.getString("categoryId"),
                    rst.getString("badgeName"),
                    rst.getString("timePrd"),
                    rst.getString("description"));
            
            getAll.add(badgeDTO);
        }
        return getAll;
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<CoreBadgeDTO> searchAndGetAllId(String cat) throws SQLException{
        String SQL = "select * from coreBadge where categoryId = '"+cat+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<CoreBadgeDTO> allBadge = new ArrayList<>();
        while (rst.next()) {
            CoreBadgeDTO  coreBadgeDTO= new CoreBadgeDTO();
            
            coreBadgeDTO.setBadgeId(rst.getString("badgeId"));
            //memberDTO.setName(rst.getString("name"));
            //memberDTO.setAddress(rst.getString("Address"));
            
            allBadge.add(coreBadgeDTO);
        }
        return allBadge;
    }
    
    
}
