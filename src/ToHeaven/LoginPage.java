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

        jLoginText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLoginText.setText("LOGIN");

        jLabelUsernameText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelUsernameText.setText("USERNAME  : ");

        jLabelPasswordText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPasswordText.setText("PASSWORD  : ");

        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        showPassRiado.setText("Show password");
        showPassRiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRiadoActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setText("Login");
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

        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsernameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUsername))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPasswordText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showPassRiado)
                                .addGap(9, 9, 9))
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLoginText)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsernameText))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPasswordText)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showPassRiado)
                    .addComponent(registerButton))
                .addGap(44, 44, 44)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
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
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
