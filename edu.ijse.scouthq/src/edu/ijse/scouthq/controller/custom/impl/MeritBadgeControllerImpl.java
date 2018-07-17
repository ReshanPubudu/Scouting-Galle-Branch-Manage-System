/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller.custom.impl;

import edu.ijse.scouthq.controller.custom.MeritBadgeController;
import edu.ijse.scouthq.dao.DAOFactory;
import edu.ijse.scouthq.dao.custom.MeritBadgeDAO;
import edu.ijse.scouthq.dao.custom.MeritBadgeTeacherDAO;
import edu.ijse.scouthq.db.ConnectionFactory;
import edu.ijse.scouthq.dto.MeritBadgeDTO;
import edu.ijse.scouthq.dto.MeritBadgeTeacherDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class MeritBadgeControllerImpl implements MeritBadgeController{
    
    private final MeritBadgeDAO meritBadgeDAO;
    private final MeritBadgeTeacherDAO meritTeacherDAO;

    public MeritBadgeControllerImpl() {
        meritBadgeDAO = (MeritBadgeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MERITBADGE);
        meritTeacherDAO = (MeritBadgeTeacherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MERITBADGETEACHER);
    }

    @Override
    public boolean add(MeritBadgeDTO meritBadgeDTO) throws Exception {
        Connection con = ConnectionFactory.getInstance().getConnection();
        try{
            con.setAutoCommit(false);
            boolean meritAd = meritBadgeDAO.add(meritBadgeDTO);
            if(meritAd){
                ArrayList<MeritBadgeTeacherDTO> meritBadgeTeacherDTOs = meritBadgeDTO.getMeritBgTeacherDTO();
                int i = 0, j =0;
                for(MeritBadgeTeacherDTO meritBadgeTeacherDTO1 : meritBadgeTeacherDTOs){
                    i++;
                    boolean added = meritTeacherDAO.add(meritBadgeTeacherDTO1);
                    if(added){
                        j++;
                    }
                }
                if(i==j){
                    con.commit();
                    return true;
                }else{
                    con.rollback();
                    return false;
                }
            }
            con.rollback();
            return false;
        }finally{
            con.setAutoCommit(true);
        }
    }

    @Override
    public boolean update(MeritBadgeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MeritBadgeDTO search(String key) throws Exception {
        return meritBadgeDAO.search(key);
    }

    @Override
    public ArrayList<MeritBadgeDTO> getAll() throws Exception {
        return meritBadgeDAO.getAll();
    }

    @Override
    public String getId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
