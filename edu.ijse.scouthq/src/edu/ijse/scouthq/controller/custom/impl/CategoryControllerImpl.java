/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.CategoryController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.CategoryDAO;
import edu.ijse.scouthq.dto.CategoryDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class CategoryControllerImpl implements CategoryController{
    
    private final CategoryDAO ctrlCategory;
    
    public CategoryControllerImpl (){
        ctrlCategory = (CategoryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CATEGORY);
    }
    
    @Override
    public boolean add(CategoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CategoryDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO search(String key) throws Exception {
        return ctrlCategory.search(key);
    }

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
