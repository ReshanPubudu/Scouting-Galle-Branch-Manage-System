/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller;

import edu.ijse.scouthq.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 * @param <DTO>
 */
public interface SuperController<DTO extends SuperDTO>  {
    
    public boolean add(DTO dto)throws Exception;
    
    public boolean update(DTO dto)throws Exception;
    
    public boolean delete(String key)throws Exception;
    
    public DTO search(String key)throws Exception;
    
    public ArrayList<DTO> getAll()throws Exception;
    
    public String getId() throws Exception;
    
}
