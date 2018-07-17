/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.CoreBadgeController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.CoreBadgeDAO;
import edu.ijse.scouthq.dto.CoreBadgeDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class CoreBadgeControllerImpl implements CoreBadgeController{
    
    private final CoreBadgeDAO coreBadgeDAO;

    public CoreBadgeControllerImpl() {
        coreBadgeDAO = (CoreBadgeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COREBADGE);
    }
    
    @Override
    public boolean add(CoreBadgeDTO coreBadgeDTO) throws Exception {
        return coreBadgeDAO.add(coreBadgeDTO);
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
    public CoreBadgeDTO search(String key) throws Exception {
        return coreBadgeDAO.search(key);
    }

    @Override
    public ArrayList<CoreBadgeDTO> getAll() throws Exception {
        return coreBadgeDAO.getAll();
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
