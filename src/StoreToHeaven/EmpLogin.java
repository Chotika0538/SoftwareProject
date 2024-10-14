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

        setBackground(new java.awt.Color(244, 243, 222));
        setPreferredSize(new java.awt.Dimension(800, 600));

        passwordJF.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N

        loginLB.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        loginLB.setText("LOGIN");

        usernameLB.setFont(new java.awt.Font("TH Sarabun New", 1, 36)); // NOI18N
        usernameLB.setText("username:");

        passwordLB.setFont(new java.awt.Font("TH Sarabun New", 1, 36)); // NOI18N
        passwordLB.setText("password:");

        usernameTF.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N

        showPassRB.setBackground(new java.awt.Color(244, 243, 222));
        showPassRB.setText("Show password");
        showPassRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRBActionPerformed(evt);
            }
        });

        loginBT.setBackground(new java.awt.Color(233, 227, 179));
        loginBT.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        loginBT.setText("LOGIN");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLB)
                            .addComponent(usernameLB))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(showPassRB)
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordJF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginLB)
                        .addGap(202, 202, 202)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(loginLB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLB)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLB)
                    .addComponent(passwordJF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showPassRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(loginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
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
                card.show(mainPanel, "AddPro");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginBTActionPerformed
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
    private javax.swing.JLabel usernameLB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
