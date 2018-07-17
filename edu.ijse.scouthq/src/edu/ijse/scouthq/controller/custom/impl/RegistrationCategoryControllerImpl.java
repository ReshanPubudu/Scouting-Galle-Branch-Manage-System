/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.dao.custom.RegistrationCategoryDAO;
import edu.ijse.scouthq.controller.custom.RegistrationCategoryController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dto.RegistrationCategoryDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class RegistrationCategoryControllerImpl implements RegistrationCategoryController {
    
    private final RegistrationCategoryDAO ctrlRegistrCat;
    
    public RegistrationCategoryControllerImpl(){
        ctrlRegistrCat = (RegistrationCategoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATIONCATEGORY);
    }

    @Override
    public boolean add(RegistrationCategoryDTO regCatDTO) throws Exception {
        return ctrlRegistrCat.add(regCatDTO);
    }

    @Override
    public boolean update(RegistrationCategoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationCategoryDTO search(String key) throws Exception {
        return ctrlRegistrCat.search(key);
    }

    @Override
    public ArrayList<RegistrationCategoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
