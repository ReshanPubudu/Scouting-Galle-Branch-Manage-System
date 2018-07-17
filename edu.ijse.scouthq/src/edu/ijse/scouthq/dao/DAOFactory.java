/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.dao;

import edu.ijse.scouthq.dao.custom.impl.RegistrationCategoryDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.CategoryDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.CoreBadgeDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.MemberCoreUpdateDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.MemberDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.MemberMeritUpdateDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.MeritBadgeDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.MeritBadgeTeacherDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.SchoolDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.TeacherDAOImpl;
import edu.ijse.scouthq.dao.custom.impl.TeacherSchoolDAOImpl;

/**
 *
 * @author Reshan Pubudu
 */
public class DAOFactory {
    public enum DAOTypes{
        MEMBER, ROVER, TEACHER, SCHOOL, CATEGORY, REGISTRATIONCATEGORY, COREBADGE, MERITBADGE, MERITBADGETEACHER,TEACHERSCHOOL,MEMBERCOREUPDATE,MEMBERMERITUPDATE;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
            case MEMBER :
                return new MemberDAOImpl();
            //case ROVER : 
            //    return new RoverDAOImpl();
            case TEACHER : 
                return new TeacherDAOImpl();
            case SCHOOL : 
                return new SchoolDAOImpl();
            case CATEGORY : 
                return new CategoryDAOImpl();
            case REGISTRATIONCATEGORY : 
                return new RegistrationCategoryDAOImpl();
            case COREBADGE:
                return new CoreBadgeDAOImpl();
            case MERITBADGE: 
                return new MeritBadgeDAOImpl();
            case MERITBADGETEACHER:
                return new MeritBadgeTeacherDAOImpl();
            case TEACHERSCHOOL: 
                return new TeacherSchoolDAOImpl();
            case MEMBERCOREUPDATE : 
                return new MemberCoreUpdateDAOImpl();
            case MEMBERMERITUPDATE :
                return new MemberMeritUpdateDAOImpl();
            default:
                return null;
        }
    }
}
