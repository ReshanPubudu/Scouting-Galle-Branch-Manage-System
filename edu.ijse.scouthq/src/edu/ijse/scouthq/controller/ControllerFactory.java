/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.controller;

import edu.ijse.scouthq.controller.custom.impl.RegistrationCategoryControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.CategoryControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.CoreBadgeControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.MemberControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.MemberCoreUpdateControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.MemberMeritUpdateControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.MeritBadgeControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.MeritBadgeTeacherControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.SchoolControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.TeacherControllerImpl;
import edu.ijse.scouthq.controller.custom.impl.TeacherSchoolControllerImpl;

/**
 *
 * @author Reshan Pubudu
 */
public class ControllerFactory {
    public enum ControllerTypes{
        MEMBER, TEACHER, SCHOOL, CATEGORY, REGISTRATIONCATEGORY,COREBADGE,MERITBADGE, MERITBADGETEACHER,TEACHERSCHOOL,MEMBERCOREUPDATE,MEMBERMERITUPDATE;
    }
    
    private static ControllerFactory controllerFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (controllerFactory == null){
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }
    
    public SuperController getController(ControllerTypes daoType) {
        switch(daoType){
            case MEMBER :
                return new MemberControllerImpl();
            case TEACHER : 
                return new TeacherControllerImpl();
            case SCHOOL : 
                return new SchoolControllerImpl();
            case CATEGORY : 
                return new CategoryControllerImpl();
            case REGISTRATIONCATEGORY :
                return new RegistrationCategoryControllerImpl();
            case COREBADGE:
                return new CoreBadgeControllerImpl();
            case MERITBADGE: 
                return new MeritBadgeControllerImpl();
            case MERITBADGETEACHER:
                return new MeritBadgeTeacherControllerImpl();
            case TEACHERSCHOOL :
                return new TeacherSchoolControllerImpl();
            case MEMBERCOREUPDATE :
                return new MemberCoreUpdateControllerImpl();
            case MEMBERMERITUPDATE :
                return new MemberMeritUpdateControllerImpl();
            default:
                return null;
        }
    }
}
