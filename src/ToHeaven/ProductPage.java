/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class ProductPage extends javax.swing.JPanel {

    private JPanel mainPanel;
    
    public ProductPage(JPanel mainPanel) {
        this.mainPanel = mainPanel;
       // cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product = new javax.swing.JLabel();
        wreath = new javax.swing.JButton();
        snackBox = new javax.swing.JButton();
        frame = new javax.swing.JButton();
        sandalWood = new javax.swing.JButton();
        Souvenir = new javax.swing.JButton();
        incense = new javax.swing.JButton();
        candle = new javax.swing.JButton();
        coffin = new javax.swing.JButton();
        offering = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 217, 220));
        setMaximumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(null);

        product.setFont(new java.awt.Font("TH Sarabun New", 1, 36)); // NOI18N
        product.setText("ผลิตภัณฑ์");
        add(product);
        product.setBounds(40, 22, 140, 61);

        wreath.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        wreath.setText("พวงหรีด");
        wreath.setBorder(null);
        wreath.setPreferredSize(new java.awt.Dimension(75, 30));
        add(wreath);
        wreath.setBounds(147, 89, 135, 41);

        snackBox.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        snackBox.setText("ชุดอาหารว่าง");
        snackBox.setBorder(null);
        snackBox.setPreferredSize(new java.awt.Dimension(75, 30));
        snackBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackBoxActionPerformed(evt);
            }
        });
        add(snackBox);
        snackBox.setBounds(147, 152, 135, 41);

        frame.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        frame.setText("กรอบรูป");
        frame.setBorder(null);
        frame.setPreferredSize(new java.awt.Dimension(75, 30));
        add(frame);
        frame.setBounds(147, 214, 135, 41);

        sandalWood.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        sandalWood.setText("ดอกไม้จันทน์");
        sandalWood.setBorder(null);
        sandalWood.setPreferredSize(new java.awt.Dimension(75, 30));
        add(sandalWood);
        sandalWood.setBounds(147, 272, 135, 41);

        Souvenir.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        Souvenir.setText("ของชำร่วย");
        Souvenir.setBorder(null);
        Souvenir.setPreferredSize(new java.awt.Dimension(75, 30));
        add(Souvenir);
        Souvenir.setBounds(500, 89, 135, 41);

        incense.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        incense.setText("ธูป");
        incense.setBorder(null);
        incense.setPreferredSize(new java.awt.Dimension(75, 30));
        add(incense);
        incense.setBounds(500, 152, 135, 41);

        candle.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        candle.setText("เทียน");
        candle.setBorder(null);
        candle.setPreferredSize(new java.awt.Dimension(75, 30));
        add(candle);
        candle.setBounds(500, 214, 135, 41);

        coffin.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        coffin.setText("โลงศพ");
        coffin.setBorder(null);
        coffin.setPreferredSize(new java.awt.Dimension(75, 30));
        add(coffin);
        coffin.setBounds(500, 272, 135, 41);

        offering.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        offering.setText("เครื่องไทยธรรม");
        offering.setBorder(null);
        offering.setPreferredSize(new java.awt.Dimension(75, 30));
        add(offering);
        offering.setBounds(500, 333, 143, 41);
    }// </editor-fold>//GEN-END:initComponents

    private void snackBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snackBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Souvenir;
    private javax.swing.JButton candle;
    private javax.swing.JButton coffin;
    private javax.swing.JButton frame;
    private javax.swing.JButton incense;
    private javax.swing.JButton offering;
    private javax.swing.JLabel product;
    private javax.swing.JButton sandalWood;
    private javax.swing.JButton snackBox;
    private javax.swing.JButton wreath;
    // End of variables declaration//GEN-END:variables
}
