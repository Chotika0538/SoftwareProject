/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;

import java.awt.Dimension;
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
 * @author ASUS
 */
public class TempleDetail extends javax.swing.JPanel {
    private ArrayList<TempleDetail> svList;
    private JPanel jp;
    private String filePath;
    /**
     * Creates new form SnackBoxDetail
     */
    public TempleDetail(ArrayList list, JPanel mainpanel) {
        
        svList = list; 
        this.jp = mainpanel;
        initComponents();
        //deleteCB.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailLB = new javax.swing.JLabel();
        detailSP = new javax.swing.JScrollPane();
        adressdetailTA = new javax.swing.JTextArea();
        deleteCB = new javax.swing.JCheckBox();
        pattern = new javax.swing.JLabel();
        templeNameTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 217, 103));
        setPreferredSize(new java.awt.Dimension(400, 230));
        setLayout(null);

        detailLB.setBackground(new java.awt.Color(204, 255, 255));
        detailLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        detailLB.setText("รายละเอียดที่อยู่ของวัด : ");
        add(detailLB);
        detailLB.setBounds(30, 70, 140, 30);

        detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        detailSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        adressdetailTA.setColumns(20);
        adressdetailTA.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        adressdetailTA.setRows(5);
        detailSP.setViewportView(adressdetailTA);

        add(detailSP);
        detailSP.setBounds(30, 100, 340, 110);

        deleteCB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        deleteCB.setText("เลือกเพื่อลบ");
        deleteCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteCBItemStateChanged(evt);
            }
        });
        deleteCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCBMouseClicked(evt);
            }
        });
        deleteCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCBActionPerformed(evt);
            }
        });
        add(deleteCB);
        deleteCB.setBounds(310, 10, 85, 20);

        pattern.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        pattern.setText("ชื่อวัด : ");
        add(pattern);
        pattern.setBounds(30, 40, 40, 30);

        templeNameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(templeNameTF);
        templeNameTF.setBounds(70, 40, 280, 27);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleteCBItemStateChanged
        // TODO add your handling code here:
        //        if (evt.getStateChange() == ItemEvent.SELECTED){
            //           wdList.remove(  getPanelIndex());
            //        }
    }//GEN-LAST:event_deleteCBItemStateChanged

    private void deleteCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCBActionPerformed

    private void deleteCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCBMouseClicked
        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this?","Confirm", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            svList.remove(this);
            jp.remove(this);
            jp.setPreferredSize(new Dimension(408, jp.getHeight()-235));
            jp.revalidate();
            jp.repaint(); 
        }
        //Choose No option
        else{
            deleteCB.setSelected(false);
        }
    }//GEN-LAST:event_deleteCBMouseClicked
    
    
    public JTextField getTempleNameTF() {
        return templeNameTF;
    }

    public void setTempleNameTF(JTextField nameTF) {
        this.templeNameTF = nameTF;
    }
    
    public JCheckBox getDeleteCB() {
        return deleteCB ;
    }
    public void setDeleteCB(JCheckBox deleteCB) {
        this.deleteCB = deleteCB;
    }
     
    public JTextArea getTempleAdressTA() {
        return adressdetailTA;
    }
    public void setTempleAdressTA(JTextArea detailTA) {
        this.adressdetailTA = detailTA;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adressdetailTA;
    private javax.swing.JCheckBox deleteCB;
    private javax.swing.JLabel detailLB;
    private javax.swing.JScrollPane detailSP;
    private javax.swing.JLabel pattern;
    private javax.swing.JTextField templeNameTF;
    // End of variables declaration//GEN-END:variables
}
