/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;
import DAO.Userdao;
import StoreToHeaven.*;
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
//    private FileInputStream fileInput;
//    private FileOutputStream fos;
//    private Workbook wb;
//    private Sheet sheet ;
//    private String excelPath ;
    public Register() {
        initComponents();
        //setReadfile();
    }    
    public Register(JPanel mainpanel){
        this.mainPanel=mainpanel;
        this.card= (CardLayout) mainPanel.getLayout();
        initComponents();
        //setReadfile();
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

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        passwordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        userNameField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        setPreferredSize(new java.awt.Dimension(800, 500));

        jLoginText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLoginText.setText("REGISTER");

        backToLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backToLogin.setText("< Login");
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Surname");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Phone");

        phoneField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        userNamefield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        nameFieldJlable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameFieldJlable.setText("Name");

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password");

        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLoginText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backToLogin)
                                .addGap(106, 106, 106)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameFieldJlable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressField)
                                    .addComponent(phoneField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(userNamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameFieldJlable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backToLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField, jLabel2, jLabel3, jLabel4, passwordfield, phoneField, userNamefield});

    }// </editor-fold>//GEN-END:initComponents
//    private void setReadfile(){
//        wb=null;
//         try{
//            excelPath = "UserInfo.xlsx";
//            fileInput = new FileInputStream(new File("./UserInfo.xlsx"));
//            wb = new XSSFWorkbook(fileInput);
//            sheet = wb.getSheetAt(0);
//        }catch(Exception err){
//            System.out.print(err);
//        }
//    }
    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        // TODO add your handling code here:
        card.show(mainPanel,"LoginPage");
    }//GEN-LAST:event_backToLoginActionPerformed

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
    private void savetoExcel(){
        new Userdao().save(this);
        if(Userdao.complete){
            JOptionPane.showMessageDialog(this, "Registered successed", "Registered", JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            surnameField.setText("");
            userNamefield.setText("");
            passwordfield.setText("");
            addressField.setText("");    
            phoneField.setText("");
            card.show(mainPanel,"LoginPage");
        }
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getPasswordfield() {
        return passwordfield;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }

    public JTextField getUserNamefield() {
        return userNamefield;
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
