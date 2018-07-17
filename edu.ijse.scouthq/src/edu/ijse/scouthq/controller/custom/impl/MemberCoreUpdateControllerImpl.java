/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.MemberCoreUpdateController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.MemberCoreUpdateDAO;
import edu.ijse.scouthq.dto.MemberCoreUpdateDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MemberCoreUpdateControllerImpl implements MemberCoreUpdateController{

    MemberCoreUpdateDAO memberCoreUpdateDAO;
    
    public MemberCoreUpdateControllerImpl() {
        memberCoreUpdateDAO = (MemberCoreUpdateDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEMBERCOREUPDATE);
    }

    @Override
    public boolean add(MemberCoreUpdateDTO memberCoreUpdateDTO) throws Exception {
        return memberCoreUpdateDAO.add(memberCoreUpdateDTO);
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
    public MemberCoreUpdateDTO search(String key) throws Exception {
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
