/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.MemberMeritUpdateController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.MemberMeritUpdateDAO;
import edu.ijse.scouthq.dto.MemberMeritUpdateDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberMeritUpdateControllerImpl implements MemberMeritUpdateController{
    
    MemberMeritUpdateDAO memberMeritUpdateDAO;

    public MemberMeritUpdateControllerImpl() {
        memberMeritUpdateDAO = (MemberMeritUpdateDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBERMERITUPDATE);
    }
    
    @Override
    public boolean add(MemberMeritUpdateDTO memberMeritUpdateDTO) throws Exception {
        return memberMeritUpdateDAO.add(memberMeritUpdateDTO);
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
    public MemberMeritUpdateDTO search(String key) throws Exception {
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
