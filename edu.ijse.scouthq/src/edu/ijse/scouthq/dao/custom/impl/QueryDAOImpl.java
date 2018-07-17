/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.CoreBadgeDTO;
import edu.ijse.scouthq.dto.MeritBadgeDTO;
import edu.ijse.scouthq.dto.QueryDTO;
import edu.ijse.scouthq.dto.RoverDTO;
import edu.ijse.scouthq.dto.SchoolDTO;
import edu.ijse.scouthq.dto.TeacherDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class QueryDAOImpl {
    
    private final Connection con;
    
    public QueryDAOImpl() {
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    public ArrayList<QueryDTO> getAll(String catId, String assendnBy) throws SQLException{
        //String SQL = "select mebr.regId, categoryId, nameinit from registrationCategory = catReg, member = mebr";
        String SQL = "select distinct catReg.regId, catReg.categoryId, nameInit, nameFull, dateOfBirth, address, tp, sclId, joiningDate, registedDate"
                + " from registrationCategory = catReg, member = mebr "
                + "where catReg.categoryId = '"+catId+"' "
                + "order by mebr.regId asc;";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<QueryDTO> getAll = new ArrayList<>();
        while(rst.next()){
            QueryDTO queyDTO = new QueryDTO();
            
                queyDTO.setRegId(rst.getString("catReg.regId"));
                queyDTO.setCatId(rst.getString("catReg.categoryId"));
                queyDTO.setNameInit(rst.getString("nameInit"));
                queyDTO.setNameFull(rst.getString("nameFull"));
                queyDTO.setDateOfBirth(rst.getString("dateOfBirth"));
                queyDTO.setAddress(rst.getString("address"));
                queyDTO.setTp(rst.getString("tp"));
                queyDTO.setSclId(rst.getString("sclId"));
                queyDTO.setJoiningDate(rst.getString("joiningDate"));
                queyDTO.setRegistedDate(rst.getString("registedDate"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
    
    public ArrayList<RoverDTO> roverQry( String ass) throws SQLException{
        //String SQL = "select mebr.regId, categoryId, nameinit from registrationCategory = catReg, member = mebr";
        String SQL = "select * from rover order by "+ ass+" asc";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<RoverDTO> getAll = new ArrayList<>();
        while(rst.next()){
            RoverDTO queyDTO = new RoverDTO();
                queyDTO.setRegId(rst.getString("rId"));
                queyDTO.setNameInit(rst.getString("nameInit"));
                queyDTO.setNameFull(rst.getString("nameFull"));
                queyDTO.setDateOfBirth(rst.getString("dateOfBirth"));
                queyDTO.setAddress(rst.getString("address"));
                queyDTO.setTp(rst.getString("tp"));
                queyDTO.setJoiningDate(rst.getString("joiningDate"));
                queyDTO.setRegistedDate(rst.getString("registedDate"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
    
    public ArrayList<SchoolDTO> schoolQry( String ass) throws SQLException{
        //String SQL = "select mebr.regId, categoryId, nameinit from registrationCategory = catReg, member = mebr";
        String SQL = "select * from school order by "+ ass+" asc";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<SchoolDTO> getAll = new ArrayList<>();
        while(rst.next()){
            SchoolDTO queyDTO = new SchoolDTO();
                queyDTO.setSclId(rst.getString("sclId"));
                queyDTO.setName(rst.getString("Name"));
                queyDTO.setAddress(rst.getString("address"));
                queyDTO.setTp(rst.getString("tp"));
                queyDTO.setDescrption(rst.getString("disecription"));
                queyDTO.setStartedDate(rst.getString("startedDate"));
                queyDTO.setRegistedDate(rst.getString("registedDate"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
    
    public ArrayList<TeacherDTO> teacherQry( String ass) throws SQLException{
        //String SQL = "select mebr.regId, categoryId, nameinit from registrationCategory = catReg, member = mebr";
        String SQL = "select * from teacher order by "+ ass+" asc";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<TeacherDTO> getAll = new ArrayList<>();
        while(rst.next()){
            TeacherDTO queyDTO = new TeacherDTO();
                queyDTO.setTId(rst.getString("tId"));
                queyDTO.setNameInit(rst.getString("nameInit"));
                queyDTO.setAddress(rst.getString("nameFull"));
                queyDTO.setDateOfBirth(rst.getString("dateOfBirth"));
                queyDTO.setAddress(rst.getString("address"));
                queyDTO.setTp(rst.getString("tp"));
                queyDTO.setJoiningDate(rst.getString("joiningDate"));
                queyDTO.setRegistedDate(rst.getString("registedDate"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
    
    public ArrayList<CoreBadgeDTO> coreBadgeQry( String viewBy) throws SQLException{
        String SQL = "select distinct * from coreBadge where categoryId = '"+viewBy+"' order by badgeId";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<CoreBadgeDTO> getAll = new ArrayList<>();
        while(rst.next()){
            CoreBadgeDTO queyDTO = new CoreBadgeDTO();
                queyDTO.setBadgeId(rst.getString("badgeId"));
                queyDTO.setCategoryId(rst.getString("categoryId"));
                queyDTO.setBadgeName(rst.getString("badgeName"));
                queyDTO.setTimePeriode(rst.getString("timePrd"));
                queyDTO.setDescription(rst.getString("description"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
    
    public ArrayList<MeritBadgeDTO> meritBadgeQry( String viewBy) throws SQLException{
        String SQL = "select distinct * from meritBadge where categoryId = '"+viewBy+"' order by badgeId asc;";
        
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<MeritBadgeDTO> getAll = new ArrayList<>();
        while(rst.next()){
            MeritBadgeDTO queyDTO = new MeritBadgeDTO();
                queyDTO.setBadgeId(rst.getString("badgeId"));
                queyDTO.setCategoryId(rst.getString("categoryId"));
                queyDTO.setBadgeName(rst.getString("badgeName"));
                queyDTO.setDescription(rst.getString("description"));
            getAll.add(queyDTO);
        }
        return getAll;
    }
}
