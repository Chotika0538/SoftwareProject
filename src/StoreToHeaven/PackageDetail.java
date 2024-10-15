/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;

import DAO.Packagedao;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class PackageDetail extends javax.swing.JPanel {
final JFileChooser fc = new JFileChooser();
private ArrayList<PackageDetail> pgList;
private JPanel jp;
    private String FilePath;
    /**
     * Creates new form WreathDetail
     */
    public PackageDetail(ArrayList<PackageDetail> l, JPanel jp) {
        pgList = l; 
        this.jp = jp;
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        initComponents();
    }
    public PackageDetail(ArrayList<PackageDetail> l , JPanel jp , String pattern , double price , String description){
        pgList = l; 
        this.jp = jp;
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        initComponents();
        setTextFields(pattern, price, description);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choosePicBT = new javax.swing.JButton();
        showPicName = new javax.swing.JLabel();
        detailLB = new javax.swing.JLabel();
        detailSP = new javax.swing.JScrollPane();
        detailTA = new javax.swing.JTextArea();
        priceLB = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        bathLB = new javax.swing.JLabel();
        deleteCB = new javax.swing.JCheckBox();
        pattern = new javax.swing.JLabel();
        patternTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 241, 211));
        setMinimumSize(new java.awt.Dimension(400, 230));
        setPreferredSize(new java.awt.Dimension(400, 240));
        setLayout(null);

        choosePicBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        choosePicBT.setText("กดแนบรูปภาพ");
        choosePicBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePicBTActionPerformed(evt);
            }
        });
        add(choosePicBT);
        choosePicBT.setBounds(10, 50, 106, 26);

        showPicName.setBackground(new java.awt.Color(204, 255, 255));
        showPicName.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        add(showPicName);
        showPicName.setBounds(130, 50, 160, 30);

        detailLB.setBackground(new java.awt.Color(204, 255, 255));
        detailLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        detailLB.setText("รายละเอียด ");
        add(detailLB);
        detailLB.setBounds(10, 80, 66, 22);

        detailTA.setColumns(20);
        detailTA.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        detailTA.setRows(5);
        detailSP.setViewportView(detailTA);

        add(detailSP);
        detailSP.setBounds(10, 110, 347, 110);

        priceLB.setBackground(new java.awt.Color(204, 255, 255));
        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        priceLB.setText("ราคา");
        add(priceLB);
        priceLB.setBounds(210, 80, 27, 21);

        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        add(priceTF);
        priceTF.setBounds(240, 80, 76, 22);

        bathLB.setBackground(new java.awt.Color(204, 255, 255));
        bathLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        bathLB.setText("บาทต่อชิ้น");
        add(bathLB);
        bathLB.setBounds(320, 80, 55, 21);

        deleteCB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        deleteCB.setText("เลือกเพื่อลบ");
        deleteCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteCBItemStateChanged(evt);
            }
        });
        deleteCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCBActionPerformed(evt);
            }
        });
        add(deleteCB);
        deleteCB.setBounds(300, 10, 85, 20);

        pattern.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        pattern.setText("รูปแบบสินค้า : ");
        add(pattern);
        pattern.setBounds(10, 10, 90, 21);

        patternTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        patternTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternTFActionPerformed(evt);
            }
        });
        add(patternTF);
        patternTF.setBounds(100, 10, 160, 27);
    }// </editor-fold>//GEN-END:initComponents
    private void setTextFields(String pattern, double price, String description) {
        // Ensure that the text fields are initialized
        if (patternTF != null && priceTF != null && detailTA != null) {
            System.out.println("Not null ");
            patternTF.setText(pattern);
            priceTF.setText(price+"");
            detailTA.setText(description);
        }else{System.out.println("ITS NULL");}
    }
    private void choosePicBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePicBTActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showDialog(null, "Choose");
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            try {
                FilePath = file.getCanonicalPath();
            } catch (Exception e) {
                e.printStackTrace();
            }
            showPicName.setText("รูปภาพที่แนบ: "+file.getName());
        }
    }//GEN-LAST:event_choosePicBTActionPerformed

    private void deleteCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCBActionPerformed
         // Only proceed if the checkbox is selected
        if (deleteCB.isSelected()) {
            int result = JOptionPane.showConfirmDialog(null, 
                "You can not go back after you choose. Do you want to continue?", 
                "Confirm", 
                JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                Packagedao dao = new Packagedao();
                dao.deletePackageDetail(this);
                pgList.remove(this);
                jp.remove(this);
                jp.setPreferredSize(new Dimension(408, jp.getHeight() - 235));
                jp.revalidate();
                jp.repaint(); 
            } else {
                // If they choose NO, you may want to uncheck the checkbox
                deleteCB.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกข้อมูลเพื่อลบ");
        }
    }//GEN-LAST:event_deleteCBActionPerformed

    private void deleteCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleteCBItemStateChanged
        
    }//GEN-LAST:event_deleteCBItemStateChanged

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void patternTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patternTFActionPerformed
private int getPanelIndex(){
    return pgList.indexOf(this);
}
// /* testing panel*/
//    public static void main(String[] args){
//        JFrame f = new JFrame();
//        f.setContentPane(new WreathDetail());
//        f.setSize(1200,700);
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // สร้างตัวแปรสำหรับ Packagedao
    Packagedao packageDao = new Packagedao();
    
    // เช็คว่า checkbox ถูกเลือกหรือไม่
    if (deleteCB.isSelected()) {
        // เรียกใช้ฟังก์ชันเพื่อลบ
        packageDao.deletePackageDetail(this);
        
        // แสดงข้อความหรือการอัพเดท UI ที่จำเป็น
        showPicName.setText("ข้อมูลถูกลบเรียบร้อยแล้ว");
    } else {
        showPicName.setText("กรุณาเลือกข้อมูลเพื่อลบ");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bathLB;
    private javax.swing.JButton choosePicBT;
    private javax.swing.JCheckBox deleteCB;
    private javax.swing.JLabel detailLB;
    private javax.swing.JScrollPane detailSP;
    private javax.swing.JTextArea detailTA;
    private javax.swing.JLabel pattern;
    private javax.swing.JTextField patternTF;
    private javax.swing.JLabel priceLB;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel showPicName;
    // End of variables declaration//GEN-END:variables

    public JCheckBox getDeleteCB() {
        return deleteCB;
    }

    public void setDeleteCB(JCheckBox deleteCB) {
        this.deleteCB = deleteCB;
    }

    public JTextArea getDetailTA() {
        return detailTA;
    }

    public JTextField getPatternTF() {
        return patternTF;
    }

    public JTextField getPriceTF() {
        return priceTF;
    }

    public String getFilePath() {
        return FilePath ;
    }
}
