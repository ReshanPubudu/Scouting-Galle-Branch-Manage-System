/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.scouthq.view;

import edu.ijse.scouthq.controller.ControllerFactory;
import edu.ijse.scouthq.controller.custom.CategoryController;
import edu.ijse.scouthq.controller.custom.CoreBadgeController;
import edu.ijse.scouthq.controller.custom.RegistrationCategoryController;
import edu.ijse.scouthq.dto.CoreBadgeDTO;
import edu.ijse.scouthq.dto.MemberDTO;
import edu.ijse.scouthq.dto.RegistrationCategoryDTO;
import edu.ijse.scouthq.dto.SchoolDTO;
import edu.ijse.scouthq.dto.TeacherDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import edu.ijse.scouthq.controller.custom.MemberController;
import edu.ijse.scouthq.controller.custom.MemberCoreUpdateController;
import edu.ijse.scouthq.controller.custom.MemberMeritUpdateController;
import edu.ijse.scouthq.controller.custom.MeritBadgeController;
import edu.ijse.scouthq.controller.custom.SchoolController;
import edu.ijse.scouthq.controller.custom.TeacherController;
//import edu.ijse.scouthq.controller.custom.RoverController;
import edu.ijse.scouthq.dto.CategoryDTO;
import edu.ijse.scouthq.dto.MemberCoreUpdateDTO;
import edu.ijse.scouthq.dto.MemberMeritUpdateDTO;
import edu.ijse.scouthq.dto.MeritBadgeDTO;
import edu.ijse.scouthq.dto.MeritBadgeTeacherDTO;
import edu.ijse.scouthq.dto.TeacherSchoolDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan Pubudu
 */
public class ConformationForm extends javax.swing.JFrame {
    
    MemberController ctrlMember;
//    RoverController ctrlRover;
    TeacherController ctrlTeacher;
    SchoolController ctrlSchool;
    RegistrationCategoryController ctrlRegCat;
    CoreBadgeController ctrlCoreBadge;
    MeritBadgeController ctrlMeritBadge;
    MemberCoreUpdateController ctrlMemberCore;
    MemberMeritUpdateController ctrlMemberMerit;
    CategoryController ctrlCat;
    
    /**
     * Creates new form conformRegistration
     */
    public ConformationForm() {
        initComponents();
        this.setTitle("Conformation Form...");
        ctrlMember = (MemberController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.MEMBER);
//        ctrlRover = (RoverController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ROVER);
        ctrlTeacher = (TeacherController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.TEACHER);
        ctrlSchool = (SchoolController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.SCHOOL);
        ctrlRegCat = (RegistrationCategoryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.REGISTRATIONCATEGORY);
        ctrlCoreBadge = (CoreBadgeController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.COREBADGE);
        ctrlMeritBadge = (MeritBadgeController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.MERITBADGE);
        ctrlMemberCore = (MemberCoreUpdateController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.MEMBERCOREUPDATE);
        ctrlMemberMerit = (MemberMeritUpdateController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.MEMBERMERITUPDATE);
        ctrlCat = (CategoryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.CATEGORY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBtn.setText("No");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Yes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("If you sure you added data is correct... ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtn)
                    .addComponent(jButton1))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //System.out.println(sc);
        switch(sc){
            case "Cub Scout" :{
                try{
                    //create regid
                    String rgId = ctrlMember.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    
                    RegistrationCategoryDTO regCatDTO = new RegistrationCategoryDTO(regId, "CSC01");
                    
                    MemberDTO memberDTO = new MemberDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            sclId,
                            joiningDate,
                            registedDate,
                            regCatDTO);
                    
                    
                    boolean added = ctrlMember.add(memberDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Scout" :{ 
                try{
                    //create regid
                    String rgId = ctrlMember.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    
                    if(joiningDate.equals("")){
                        joiningDate = registedDate;
                    }
                    
                    RegistrationCategoryDTO regCatDTO = new RegistrationCategoryDTO(regId, "BSC01");
                    
                    MemberDTO memberDTO = new MemberDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            sclId,
                            joiningDate,
                            registedDate,
                            regCatDTO);
                    
                    boolean added = ctrlMember.add(memberDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Girl Scout" :{
                try{
                    //create regid
                    String rgId = ctrlMember.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    
                    if(joiningDate.equals("")){
                        joiningDate = registedDate;
                    }
                    
                    RegistrationCategoryDTO regCatDTO = new RegistrationCategoryDTO(regId, "GSC01");
                    
                    MemberDTO memberDTO = new MemberDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            sclId,
                            joiningDate,
                            registedDate,
                            regCatDTO);
                    
                    boolean added = ctrlMember.add(memberDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Rover Scout" :{
                try{
                    //create regid
                    String rgId = ctrlMember.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    
                    if(joiningDate.equals("")){
                        joiningDate = registedDate;
                    }
                    
                    RegistrationCategoryDTO regCatDTO = new RegistrationCategoryDTO(regId, "RSC01");
                    
                    MemberDTO memberDTO = new MemberDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            sclId,
                            joiningDate,
                            registedDate,
                            regCatDTO);
                    
                    boolean added = ctrlMember.add(memberDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Teacher" :{
                try{
                    //create regid
                    String rgId = ctrlTeacher.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    
                    ArrayList<TeacherSchoolDTO> teacherSchoolDTOs = new ArrayList<>();
                    for(String sclid : sclIds){
                        TeacherSchoolDTO teacherSchoolDTO = new TeacherSchoolDTO(regId, sclid);
                        teacherSchoolDTOs.add(teacherSchoolDTO);
                    }
                    
                    if(joiningDate.equals("")){
                        joiningDate = registedDate;
                    }
                    
                    TeacherDTO teacherDTO = new TeacherDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            joiningDate,
                            registedDate,
                            teacherSchoolDTOs);
                    
                    
                    try {
                        boolean added = ctrlTeacher.add(teacherDTO);
                        if(added){
                            JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                        }else{
                            JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "School" :{
                try{
                    //create regid
                    String slId = ctrlSchool.getId();
                    String numberOnly= slId.replaceAll("[^0-9]", "");
                    String stringOnly= slId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    sclId = stringOnly+rgNumber;
                    
                    SchoolDTO schoolDTO = new SchoolDTO(
                            sclId,
                            sclName,
                            address,
                            tp,
                            description,
                            startedDate,
                            registedDate);
                    
                    boolean added = ctrlSchool.add(schoolDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nSchool registration number is "+sclId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Core Badge" :{
                try{
                    
                    CoreBadgeDTO coreBadgeDTO = new CoreBadgeDTO(
                            badgeId,
                            categoryId,
                            badgeName,
                            timePeriode,
                            badgeDescription);
                    
                    boolean added = ctrlCoreBadge.add(coreBadgeDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "register new "+sc+" is as name is \""+badgeName+"\" .");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Merit Badge" :{
                try{
                    
                    MeritBadgeDTO meritBadgeDTO = new MeritBadgeDTO(
                            badgeId,
                            categoryId,
                            badgeName,
                            badgeDescription,
                            meritBadgeTeacherDTO);
                    
                    boolean added = ctrlMeritBadge.add(meritBadgeDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "register new "+sc+" is as name is \""+badgeName+"\" .");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Member Core Badge Update" :{
                try{
                    
                    MemberCoreUpdateDTO memberCoreUpdateDTO = new MemberCoreUpdateDTO(
                            passRegId,
                            passBadgeId,
                            passDate,
                            passDescription);
                    
                    boolean added = ctrlMemberCore.add(memberCoreUpdateDTO);
                    if(added){
                        MemberDTO memberDTO = ctrlMember.search(passRegId);
                        CoreBadgeDTO coreBadgeDTO = ctrlCoreBadge.search(passBadgeId);
                        RegistrationCategoryDTO registrationCategoryDTO = ctrlRegCat.search(passRegId);
                        CategoryDTO categoryDTO = ctrlCat.search(registrationCategoryDTO.getCategoryId());
                        JOptionPane.showMessageDialog(this, categoryDTO.getName()+" '"+memberDTO.getNameInit()+"' who bear Register No : "+passRegId+" has passed the '"+coreBadgeDTO.getBadgeName()+"' badge." );
                    }else{
                        //JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Member Merit Badge Update" :{
                try{
                    
                    MemberMeritUpdateDTO memberMeritUpdateDTO = new MemberMeritUpdateDTO(
                            passRegId,
                            passBadgeId,
                            passTeacher,
                            passDate,
                            passDescription);
                    
                    boolean added = ctrlMemberMerit.add(memberMeritUpdateDTO);
                    if(added){
                        MemberDTO memberDTO = ctrlMember.search(passRegId);
                        MeritBadgeDTO meritBadgeDTO = ctrlMeritBadge.search(passBadgeId);
                        RegistrationCategoryDTO registrationCategoryDTO = ctrlRegCat.search(passRegId);
                        CategoryDTO categoryDTO = ctrlCat.search(registrationCategoryDTO.getCategoryId());
                        JOptionPane.showMessageDialog(this, categoryDTO.getName()+" '"+memberDTO.getNameInit()+"' who bear Register No : "+passRegId+" has passed the '"+meritBadgeDTO.getBadgeName()+"' badge which bear the Badge Id : "+passBadgeId+"" );
                    }else{
                        //JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
            case "Update Scout" :{ 
                try{
                    //create regid
                    /*String rgId = ctrlMember.getId();
                    String numberOnly= rgId.replaceAll("[^0-9]", "");
                    String stringOnly= rgId.replaceAll("[^A-Za-z]", "");
                    int rgNumber = Integer.parseInt(numberOnly);
                    rgNumber++;
                    regId = stringOnly+rgNumber;
                    */
                    if(joiningDate.equals("")){
                        joiningDate = registedDate;
                    }
                    
                    RegistrationCategoryDTO regCatDTO = new RegistrationCategoryDTO(regId, "BSC01");
                    
                    MemberDTO memberDTO = new MemberDTO(
                            regId,
                            nameInit,
                            nameFull,
                            dateOfBirth,
                            address,
                            tp,
                            sclId,
                            joiningDate,
                            registedDate);
                    boolean added = ctrlMember.update(memberDTO);
                    if(added){
                        JOptionPane.showMessageDialog(this, "New "+sc+" registed...\nYour registration number is "+regId+"\n");
                    }else{
                        JOptionPane.showMessageDialog(this, "Sorry, we can't add this "+sc+".\nPlease check and ReEnter "+sc+"'s details.");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ConformationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConformationForm().setVisible(true);
            }
        });
    }
    
    public static String passRegId;
    public static String passBadgeId;
    public static String passTeacher;
    public static String passDate;
    public static String passDescription;
    //
    public static String badgeId;
    public static String categoryId;
    public static String badgeName;
    public static String timePeriode;
    public static String badgeDescription;
    public static ArrayList<MeritBadgeTeacherDTO> meritBadgeTeacherDTO;
    public static ArrayList<String> sclIds;
    public static String sc;
    public static String regId;
    public static String nameInit;
    public static String nameFull;
    public static String dateOfBirth;
    public static String address;
    
    public static String tp;
    public static String description;
    public static String sclId;
    public static String joiningDate;
    public static String registedDate;
    public static String sclName;
    public static String startedDate;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
