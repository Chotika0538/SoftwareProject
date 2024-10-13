/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import DAO.*;
import StoreToHeaven.*;
import java.util.*;
import javax.swing.ImageIcon;
//import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ASUS
 */
public class CoffinProduct extends javax.swing.JPanel {
        private ArrayList<Coffin> cfList;
        private Coffin coffinClass;
        public CoffinProduct(Coffin coffin) {
        initComponents();
        getData(coffin);
    }
    /**
     * Creates new form FrameProduct
     */
        public void getData(Coffin coffin){
        this.coffinClass = coffin;
        name.setText(coffinClass.toString());
        details.setText(coffinClass.getDetail());
        productImage.setIcon(new ImageIcon(coffinClass.getPath()));
        //priceLB.setText(Double.toString(coffinClass.getSize20price()));
        
}

        public Coffin getFrameClass() {
        return coffinClass;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupWreath = new javax.swing.ButtonGroup();
        groupColors = new javax.swing.ButtonGroup();
        groupSize = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        productImage = new javax.swing.JLabel();
        choosePieceCoffin = new javax.swing.JLabel();
        pieceCoffin = new javax.swing.JSpinner();
        scrollDetail = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        priceLB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 217, 220));
        setPreferredSize(new java.awt.Dimension(800, 240));
        setLayout(null);

        groupSize.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("20 นิ้ว");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1);
        jRadioButton1.setBounds(87, 28, 63, 32);

        groupSize.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        jRadioButton2.setText("24 นิ้ว");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2);
        jRadioButton2.setBounds(245, 28, 64, 32);

        groupSize.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        jRadioButton3.setText("22 นิ้ว");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        add(jRadioButton3);
        jRadioButton3.setBounds(166, 28, 64, 32);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel1.setText("ขนาด");
        add(jLabel1);
        jLabel1.setBounds(20, 26, 40, 33);

        productImage.setPreferredSize(new java.awt.Dimension(272, 139));
        add(productImage);
        productImage.setBounds(90, 70, 280, 110);

        choosePieceCoffin.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        choosePieceCoffin.setText("เลือกจำนวนสินค้า");
        add(choosePieceCoffin);
        choosePieceCoffin.setBounds(570, 190, 110, 30);

        pieceCoffin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(pieceCoffin);
        pieceCoffin.setBounds(680, 190, 80, 30);

        scrollDetail.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDetail.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        details.setEditable(false);
        details.setColumns(20);
        details.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        details.setRows(5);
        scrollDetail.setViewportView(details);

        add(scrollDetail);
        scrollDetail.setBounds(410, 70, 330, 110);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(410, 10, 298, 31);

        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        priceLB.setText("ราคา : ");
        add(priceLB);
        priceLB.setBounds(410, 190, 100, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        priceLB.setText("ราคา: " + coffinClass.getSize20price() + " บาท");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        priceLB.setText("ราคา: " + coffinClass.getSize22price() + " บาท");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        priceLB.setText("ราคา: " + coffinClass.getSize24price() + " บาท");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    public Coffin getCoffinClass() {
        return coffinClass;
    }
    public JPanel gertPanel(){
        return this;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choosePieceCoffin;
    private javax.swing.JTextArea details;
    private javax.swing.ButtonGroup groupColors;
    private javax.swing.ButtonGroup groupSize;
    private javax.swing.ButtonGroup groupWreath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner pieceCoffin;
    private javax.swing.JLabel priceLB;
    private javax.swing.JLabel productImage;
    private javax.swing.JScrollPane scrollDetail;
    // End of variables declaration//GEN-END:variables
}
