/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.RegistrationCategoryDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MemberDTO;
import java.util.ArrayList;
import edu.ijse.scouthq.dao.custom.MemberDAO;
import edu.ijse.scouthq.controller.custom.MemberController;
import java.sql.Connection;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberControllerImpl implements MemberController{
    
    private final MemberDAO memberDAO;
    private final RegistrationCategoryDAO regCatDAO;

    public MemberControllerImpl() {
        memberDAO = (MemberDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBER);
        regCatDAO = (RegistrationCategoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATIONCATEGORY);
    }

    @Override
    public boolean add(MemberDTO memberDTO) throws Exception {
        Connection con = ConnectionFactory.getInstance().getConnection();
        try{
            con.setAutoCommit(false);
            boolean addMember = memberDAO.add(memberDTO);
            if(addMember){
                boolean addCat = regCatDAO.add(memberDTO.getRegCatDTO());
                if(addCat){
                    con.commit();
                    return true;
                }
            }
            con.rollback();
            return false;
        }finally{
            con.setAutoCommit(true);
        }
    }

    @Override
    public boolean update(MemberDTO dto) throws Exception {
        return memberDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return memberDAO.delete(key);
        
    }

    @Override
    public MemberDTO search(String key) throws Exception {
        return memberDAO.search(key);
    }

    @Override
    public ArrayList<MemberDTO> getAll() throws Exception {
        return memberDAO.getAll();
    }
    
    @Override
    public String getId() throws Exception{
        return memberDAO.getId();
    }
}