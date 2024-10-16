/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;
import DAO.Userdao;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author FILLL
 */
public class LoginPage extends JPanel {
    private String userName,password;
    private String excelPath ;
    private FileInputStream fileInput;
    private Workbook wb;
    private Sheet sheet ;
    private JPanel mainPanel;
    private CardLayout card;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        //setReadfile();
    }
    public LoginPage(JPanel mainpanel){
        this.mainPanel=mainpanel;
        this.card= (CardLayout) mainPanel.getLayout();
        initComponents();
        //setReadfile();
    }
//    private void setReadfile(){
//        try{
//            excelPath = "User.xlsx";
//            fileInput = new FileInputStream(new File(excelPath));
//            wb = new XSSFWorkbook(fileInput);
//            sheet = wb.getSheetAt(0);
//        }catch(Exception err){
//            System.out.print(err);
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLoginText = new javax.swing.JLabel();
        jLabelUsernameText = new javax.swing.JLabel();
        jLabelPasswordText = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        showPassRiado = new javax.swing.JRadioButton();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        goToAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(800, 500));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(null);

        jLoginText.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        jLoginText.setText("USER LOGIN");
        add(jLoginText);
        jLoginText.setBounds(360, 50, 240, 65);

        jLabelUsernameText.setFont(new java.awt.Font("TH Sarabun New", 0, 28)); // NOI18N
        jLabelUsernameText.setText("USERNAME  : ");
        add(jLabelUsernameText);
        jLabelUsernameText.setBounds(60, 150, 115, 38);
        jLabelUsernameText.getAccessibleContext().setAccessibleName("username  : ");

        jLabelPasswordText.setFont(new java.awt.Font("TH Sarabun New", 0, 28)); // NOI18N
        jLabelPasswordText.setText("PASSWORD  : ");
        add(jLabelPasswordText);
        jLabelPasswordText.setBounds(60, 220, 118, 38);

        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        add(jTextFieldUsername);
        jTextFieldUsername.setBounds(190, 150, 551, 32);

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        add(jPasswordField);
        jPasswordField.setBounds(190, 230, 382, 32);

        showPassRiado.setBackground(new java.awt.Color(244, 244, 224));
        showPassRiado.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        showPassRiado.setText("Show password");
        showPassRiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRiadoActionPerformed(evt);
            }
        });
        add(showPassRiado);
        showPassRiado.setBounds(610, 280, 170, 32);

        loginButton.setBackground(new java.awt.Color(147, 130, 103));
        loginButton.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        add(loginButton);
        loginButton.setBounds(320, 370, 170, 57);

        registerButton.setBackground(new java.awt.Color(204, 204, 185));
        registerButton.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        add(registerButton);
        registerButton.setBounds(190, 280, 100, 34);

        goToAdmin.setBackground(new java.awt.Color(242, 242, 242));
        goToAdmin.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        goToAdmin.setText("Admin Login");
        goToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToAdminActionPerformed(evt);
            }
        });
        add(goToAdmin);
        goToAdmin.setBounds(30, 540, 140, 30);
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkUserPass(String userName,String password){
//        for(Row row : sheet ){
//            Cell rowUsername = row.getCell(2);
//            Cell rowPassword = row.getCell(3);
////            System.out.println("Username : "+rowUsername);
////            System.out.println("Password : "+rowPassword);
//            if (rowUsername != null && rowPassword != null) {
//                if (rowUsername.getCellTypeEnum() == CellType.STRING &&  rowPassword.getCellTypeEnum() == CellType.STRING) {
//                    String excelUsername = rowUsername.getStringCellValue();
//                    String excelPassword = rowPassword.getStringCellValue();
//                    if (excelUsername.equals(userName) && excelPassword.equals(password)) {
//                        System.out.println("Login success");
//                        return true;
//                    }
//                }
//            }
//        }
        new Userdao().findData(userName, password);
        if(Userdao.checkLogin){
            System.out.println("Login success");
            Userdao.checkLogin = false;
            return true; 
        }
        JOptionPane.showMessageDialog(this, "User Not Found !", "Search Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void showPassRiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassRiadoActionPerformed
        // TODO add your handling code here:
        if (showPassRiado.isSelected()) {
            jPasswordField.setEchoChar((char) 0); // Show password
        } else {
            jPasswordField.setEchoChar('*'); // Hide password
        }
    }//GEN-LAST:event_showPassRiadoActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code hered:
         if (!jTextFieldUsername.getText().isEmpty() && jPasswordField.getPassword().length > 0) {
            userName = jTextFieldUsername.getText();
            char[] p = jPasswordField.getPassword();
            password = new String(p); 
        // Proceed with the login process (validation, etc.)
        if(checkUserPass(userName,password)){
             // DO SOMETHING
             card.show(mainPanel, "MainPage");
         }
    } else {
        JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Input Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        card.show(mainPanel, "RegisterPage");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_loginButtonMouseClicked

    private void goToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToAdminActionPerformed
        CardLayout cd = (CardLayout)mainPanel.getLayout();
        cd.show(mainPanel,"AdminPage");
    }//GEN-LAST:event_goToAdminActionPerformed
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goToAdmin;
    private javax.swing.JLabel jLabelPasswordText;
    private javax.swing.JLabel jLabelUsernameText;
    private javax.swing.JLabel jLoginText;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton showPassRiado;
    // End of variables declaration//GEN-END:variables
}
