package StoreToHeaven;

import DAO.Employeedao;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author ASUS
 */
public class EmpLogin extends javax.swing.JPanel {
        private String userName,password;
        private String excelPath ;
        private FileInputStream fileInput;
        private Workbook wb;
        private Sheet sheet ;
        private JPanel mainPanel;
        private CardLayout card;
    /**
     * Creates new form EmpLogin
     */
    public EmpLogin() {
        initComponents();
    }
    
    public EmpLogin(JPanel mainpanel){
        this.mainPanel=mainpanel;
        this.card= (CardLayout) mainPanel.getLayout();
        initComponents();
//        setReadfile();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordJF = new javax.swing.JPasswordField();
        loginLB = new javax.swing.JLabel();
        usernameLB = new javax.swing.JLabel();
        passwordLB = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        showPassRB = new javax.swing.JRadioButton();
        loginBT = new javax.swing.JButton();
        toUserBT = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 243, 222));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        passwordJF.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        add(passwordJF);
        passwordJF.setBounds(305, 288, 350, 32);

        loginLB.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        loginLB.setText("ADMIN LOGIN");
        add(loginLB);
        loginLB.setBounds(300, 60, 209, 65);

        usernameLB.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        usernameLB.setText("username:");
        add(usernameLB);
        usernameLB.setBounds(134, 179, 160, 49);
        usernameLB.getAccessibleContext().setAccessibleName("username :");

        passwordLB.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        passwordLB.setText("password:");
        add(passwordLB);
        passwordLB.setBounds(134, 277, 160, 49);

        usernameTF.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        add(usernameTF);
        usernameTF.setBounds(305, 190, 350, 32);

        showPassRB.setBackground(new java.awt.Color(244, 243, 222));
        showPassRB.setText("Show password");
        showPassRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRBActionPerformed(evt);
            }
        });
        add(showPassRB);
        showPassRB.setBounds(550, 332, 140, 21);

        loginBT.setBackground(new java.awt.Color(233, 227, 179));
        loginBT.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        loginBT.setText("LOGIN");
        loginBT.setBorder(null);
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });
        add(loginBT);
        loginBT.setBounds(318, 418, 156, 60);

        toUserBT.setBackground(new java.awt.Color(242, 242, 242));
        toUserBT.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        toUserBT.setText("switch to user login");
        toUserBT.setBorder(null);
        toUserBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUserBTActionPerformed(evt);
            }
        });
        add(toUserBT);
        toUserBT.setBounds(17, 549, 170, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void showPassRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassRBActionPerformed
        // TODO add your handling code here:
        if (showPassRB.isSelected()) {
            passwordJF.setEchoChar((char) 0); // Show password
        } else {
            passwordJF.setEchoChar('*'); // Hide password
        }
    }//GEN-LAST:event_showPassRBActionPerformed

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
        // TODO add your handling code here:
        if (!usernameTF.getText().isEmpty() && passwordJF.getPassword().length > 0) {
            userName = usernameTF.getText();
            char[] p = passwordJF.getPassword();
            password = new String(p);
            // Proceed with the login process (validation, etc.)
            if(checkEmpPass(userName,password)){
                // DO SOMETHING
                card.show(mainPanel, "AddProduct");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginBTActionPerformed

    private void toUserBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUserBTActionPerformed
        CardLayout cd = (CardLayout)mainPanel.getLayout();
        cd.show(mainPanel,"LoginPage");
    }//GEN-LAST:event_toUserBTActionPerformed
private boolean checkEmpPass(String userName,String password){
        new Employeedao().findData(userName, password);
        if(Employeedao.checkLogin){
            System.out.println("Login success");
            Employeedao.checkLogin = false;
            return true; 
        }
        JOptionPane.showMessageDialog(this, "User Not Found !", "Search Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBT;
    private javax.swing.JLabel loginLB;
    private javax.swing.JPasswordField passwordJF;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JRadioButton showPassRB;
    private javax.swing.JButton toUserBT;
    private javax.swing.JLabel usernameLB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
