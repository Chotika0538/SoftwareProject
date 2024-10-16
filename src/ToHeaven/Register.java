/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
/**
 *
 * @author FILLL
 */
public class Register extends javax.swing.JPanel {
    private JPanel mainPanel;
    private CardLayout card;
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private Workbook wb;
    private Sheet sheet ;
    private String excelPath ;
    public Register() {
        initComponents();
        setReadfile();
    }    
    public Register(JPanel mainpanel){
        this.mainPanel=mainpanel;
        this.card= (CardLayout) mainPanel.getLayout();
        initComponents();
        setReadfile();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsernameText = new javax.swing.JLabel();
        jLabelPasswordText = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JTextField();
        userNameField1 = new javax.swing.JTextField();
        jLoginText = new javax.swing.JLabel();
        backToLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        userNamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        nameFieldJlable = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();

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

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        passwordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        userNameField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        setBackground(new java.awt.Color(244, 243, 222));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jLoginText.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        jLoginText.setText("REGISTER");
        add(jLoginText);
        jLoginText.setBounds(340, 50, 140, 73);

        backToLogin.setBackground(new java.awt.Color(233, 227, 179));
        backToLogin.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        backToLogin.setText("Back to Login");
        backToLogin.setBorder(null);
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });
        add(backToLogin);
        backToLogin.setBounds(20, 540, 140, 40);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel1.setText("Username");
        add(jLabel1);
        jLabel1.setBounds(110, 170, 79, 24);

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel2.setText("Surname");
        add(jLabel2);
        jLabel2.setBounds(420, 210, 78, 33);

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel3.setText("Address");
        add(jLabel3);
        jLabel3.setBounds(110, 270, 79, 33);

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel4.setText("Phone");
        add(jLabel4);
        jLabel4.setBounds(110, 320, 79, 33);

        phoneField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        add(phoneField);
        phoneField.setBounds(200, 320, 524, 33);

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        add(addressField);
        addressField.setBounds(200, 270, 524, 33);

        userNamefield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamefieldActionPerformed(evt);
            }
        });
        add(userNamefield);
        userNamefield.setBounds(200, 160, 214, 33);

        passwordfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        add(passwordfield);
        passwordfield.setBounds(510, 160, 214, 33);

        registerButton.setBackground(new java.awt.Color(233, 227, 179));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        add(registerButton);
        registerButton.setBounds(300, 394, 229, 70);

        nameFieldJlable.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        nameFieldJlable.setText("Name");
        add(nameFieldJlable);
        nameFieldJlable.setBounds(110, 210, 79, 24);

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField);
        nameField.setBounds(200, 210, 214, 33);

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel8.setText("Password");
        add(jLabel8);
        jLabel8.setBounds(420, 170, 76, 25);

        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });
        add(surnameField);
        surnameField.setBounds(510, 210, 214, 33);
    }// </editor-fold>//GEN-END:initComponents
    private void setReadfile(){
        wb=null;
         try{
            excelPath = "User.xlsx";
            fileInput = new FileInputStream(new File("./User.xlsx"));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(0);
        }catch(Exception err){
            System.out.print(err);
        }
    }
    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        // TODO add your handling code here:
        card.show(mainPanel,"LoginPage");
    }//GEN-LAST:event_backToLoginActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void userNamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNamefieldActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code hered:
        if(!surnameField.getText().isEmpty()&&!nameField.getText().isEmpty()&&!passwordfield.getText().isEmpty() && !userNamefield.getText().isEmpty() && !addressField.getText().isEmpty() && !phoneField.getText().isEmpty()){
            if(nameField.getText().matches(".*\\d.*") || surnameField.getText().matches(".*\\d.*")){
                JOptionPane.showMessageDialog(this, "Name and surname connot be digits !", "Input Error", JOptionPane.ERROR_MESSAGE);
            } 
            else if (!userNamefield.getText().matches("^(?=.*[a-zA-Z])(?=.*\\d).+$")||!passwordfield.getText().matches("^(?=.*[a-zA-Z])(?=.*\\d).+$")) {
                JOptionPane.showMessageDialog(this, "Username and password must contain both alphabetic characters and digits!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        // Check if address contains at least one alphabetic character
            else if (!addressField.getText().matches(".*[a-zA-Z]+.*")) {
                JOptionPane.showMessageDialog(this, "Address must contain at least one alphabetic character!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            // Check if phone contains only digits and is 10 digits long
            else if (!phoneField.getText().matches("0\\d{9}")) {
                // Phone number must start with '0' and be 10 digits long
                if (!phoneField.getText().startsWith("0")) {
                    JOptionPane.showMessageDialog(this, "Phone number must start with '0'!", "Input Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Phone number must be exactly 10 digits long!", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                savetoExcel();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please enter all information", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed
    private void savetoExcel(){
        setReadfile();
        try{
            int lastRow = sheet.getLastRowNum();
            Row newRow = sheet.createRow(lastRow+1);
            newRow.createCell(0).setCellValue(nameField.getText());
            newRow.createCell(1).setCellValue(surnameField.getText());
            newRow.createCell(2).setCellValue(userNamefield.getText());
            newRow.createCell(3).setCellValue(passwordfield.getText());
            newRow.createCell(4).setCellValue(addressField.getText());
            String phone = phoneField.getText();
            if (phone.length() == 10) {
                phone = phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6);
            }
            newRow.createCell(5).setCellValue(phone);
            fos = new FileOutputStream(excelPath);
            wb.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(this, "Registered successed", "Registered", JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            surnameField.setText("");
            userNamefield.setText("");
            passwordfield.setText("");
            addressField.setText("");    
            phoneField.setText("");
            card.show(mainPanel,"LoginPage");
            
            // have to re-programe When registerd. !!!!!!!!!!!
        }catch(Exception err){
            System.out.println(err);
        }finally{
            if(wb!=null){
                try{
                    wb.close();
                }catch(Exception err){
                    System.out.println(err);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backToLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPasswordText;
    private javax.swing.JLabel jLabelUsernameText;
    private javax.swing.JLabel jLoginText;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameFieldJlable;
    private javax.swing.JTextField passwordField1;
    private javax.swing.JTextField passwordfield;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField userNameField1;
    private javax.swing.JTextField userNamefield;
    // End of variables declaration//GEN-END:variables
}
