/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.MeritBadgeTeacherController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.MeritBadgeTeacherDAO;
import edu.ijse.scouthq.dto.MeritBadgeTeacherDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MeritBadgeTeacherControllerImpl implements MeritBadgeTeacherController{
    
    private final MeritBadgeTeacherDAO meritBadgeTeacherDAO;

    public MeritBadgeTeacherControllerImpl() {
        meritBadgeTeacherDAO = (MeritBadgeTeacherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MERITBADGETEACHER);
    }
    
    @Override
    public boolean add(MeritBadgeTeacherDTO meritBadgeTeacherDTO) throws Exception {
        return meritBadgeTeacherDAO.add(meritBadgeTeacherDTO);
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
    public MeritBadgeTeacherDTO search(String key) throws Exception {
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
    
}
