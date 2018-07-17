/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MemberDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.MemberDAO;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberDAOImpl implements MemberDAO{
    
    private final Connection con;
    
    public MemberDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MemberDTO memberDTO) throws Exception {
        String SQL = "insert into member values ('"+memberDTO.getRegId()+"', '"+memberDTO.getNameInit()+"', '"+memberDTO.getNameFull()+"', '"+memberDTO.getDateOfBirth()+"', '"+memberDTO.getAddress()+"', '"+memberDTO.getTp()+"', '"+memberDTO.getSclId()+"', '"+memberDTO.getJoiningDate()+"', '"+memberDTO.getRegistedDate()+"')";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public boolean update(MemberDTO memberDTO) throws Exception {
        String SQL = "update member set nameInit = '"+memberDTO.getNameInit()+"', nameFull = '"+memberDTO.getNameFull()+"', dateOfBirth =  '"+memberDTO.getDateOfBirth()+"',Address = '"+memberDTO.getAddress()+"',tp =  "+memberDTO.getTp()+",sclId = '"+memberDTO.getSclId()+"',joiningDate = '"+memberDTO.getJoiningDate()+"',registedDate = '"+memberDTO.getRegistedDate()+"' where  regId = '"+memberDTO.getRegId()+"'";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        
        String SQL = "Delete from member where  regId = '"+key+"'";
        PreparedStatement stm = con.prepareStatement(SQL);
        return stm.executeUpdate(SQL)> 0;
    }

    @Override
    public MemberDTO search(String key) throws Exception {
        String SQL = "select * from member where regId = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        MemberDTO  memberDTO= new MemberDTO();
        
        while (rst.next()) {
            
            memberDTO.setRegId(rst.getString("regId"));
            memberDTO.setNameInit(rst.getString("nameInit"));
            memberDTO.setNameFull(rst.getString("nameFull"));
            memberDTO.setDateOfBirth(rst.getString("dateOfBirth"));
            memberDTO.setAddress(rst.getString("Address"));
            memberDTO.setTp(rst.getString("tp"));
            memberDTO.setSclId(rst.getString("sclId"));
            memberDTO.setJoiningDate(rst.getString("joiningDate"));
            memberDTO.setRegistedDate(rst.getString("registedDate"));
        }
        return memberDTO;
    }

    @Override
    public ArrayList<MemberDTO> getAll() throws Exception {
        String SQL = "select * from member";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL);
        ArrayList<MemberDTO> allMember = new ArrayList<>();
        while (rst.next()) {
            MemberDTO  memberDTO= new MemberDTO();
            
            memberDTO.setRegId(rst.getString("regId"));
            memberDTO.setNameInit(rst.getString("nameInit"));
            memberDTO.setNameFull(rst.getString("nameFull"));
            memberDTO.setDateOfBirth(rst.getString("dateOfBirth"));
            memberDTO.setAddress(rst.getString("Address"));
            memberDTO.setTp(rst.getString("tp"));
            memberDTO.setSclId(rst.getString("sclId"));
            memberDTO.setJoiningDate(rst.getString("joiningDate"));
            memberDTO.setRegistedDate(rst.getString("registedDate"));
            
            allMember.add(memberDTO);
        }
        return allMember;
    }
    
    @Override
    public String getId() throws ClassNotFoundException, SQLException{
        String SQL = "select regId from member order by regId desc limit 1;";
        PreparedStatement stm = con.prepareStatement(SQL);
        ResultSet rst =  stm.executeQuery(SQL);
        String regId;
        if(rst.next()){
            regId = rst.getString("regId");
            return regId;
        }
        return null;
    }
    
    
}
