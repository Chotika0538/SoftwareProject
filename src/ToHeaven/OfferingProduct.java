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
public class OfferingProduct extends javax.swing.JPanel {
    private ArrayList<Offering> oList;
    private Offering offeringClass;
    public OfferingProduct(Offering offering) {
        initComponents();
        getData(offering);
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
        choosePieceWreath = new javax.swing.JLabel();
        pieceWreath = new javax.swing.JSpinner();
        productImage = new javax.swing.JLabel();
        scrollDetail = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        priceLB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 217, 220));
        setPreferredSize(new java.awt.Dimension(800, 240));
        setLayout(null);

        choosePieceWreath.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        choosePieceWreath.setText("เลือกจำนวนสินค้า");
        add(choosePieceWreath);
        choosePieceWreath.setBounds(480, 191, 110, 30);

        pieceWreath.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(pieceWreath);
        pieceWreath.setBounds(590, 190, 80, 30);

        productImage.setPreferredSize(new java.awt.Dimension(180, 180));
        add(productImage);
        productImage.setBounds(100, 20, 180, 180);

        scrollDetail.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDetail.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        details.setEditable(false);
        details.setColumns(20);
        details.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        details.setRows(5);
        scrollDetail.setViewportView(details);

        add(scrollDetail);
        scrollDetail.setBounds(320, 80, 330, 91);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(320, 30, 298, 31);

        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        priceLB.setText("ราคา : ");
        add(priceLB);
        priceLB.setBounds(320, 190, 100, 30);
    }// </editor-fold>//GEN-END:initComponents

    public void getData(Offering offering){
    this.offeringClass = offering;
    name.setText(offeringClass.toString());
    details.setText(offeringClass.getDetail());
    productImage.setIcon(new ImageIcon(offeringClass.getPath()));
    priceLB.setText(Double.toString(offeringClass.getPrice()));
}

    public Offering getOfferingClass() {
        return offeringClass;
    }
    public JPanel gertPanel(){
        return this;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choosePieceWreath;
    private javax.swing.JTextArea details;
    private javax.swing.ButtonGroup groupColors;
    private javax.swing.ButtonGroup groupWreath;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner pieceWreath;
    private javax.swing.JLabel priceLB;
    private javax.swing.JLabel productImage;
    private javax.swing.JScrollPane scrollDetail;
    // End of variables declaration//GEN-END:variables
}
