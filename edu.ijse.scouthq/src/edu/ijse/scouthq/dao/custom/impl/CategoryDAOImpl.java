/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao.custom.impl;

import edu.ijse.scouthq.dao.custom.CategoryDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.CategoryDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class CategoryDAOImpl implements CategoryDAO{
    
    private final Connection con;
    
    public CategoryDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
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
        String SQL = "select * from category where categoryId = '"+key+"'";
        PreparedStatement pstm = con.prepareStatement(SQL);
        ResultSet rst = pstm.executeQuery(SQL); 
        CategoryDTO categoryDTO = new CategoryDTO();
        if(rst.next()){
            categoryDTO.setCatId(rst.getString("categoryId"));
            categoryDTO.setName(rst.getString("catName"));
        }
        return categoryDTO;
    }

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //////
}
