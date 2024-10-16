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
import javax.swing.JRadioButton;

/**
 *
 * @author ASUS
 */
public class SnackBoxProduct extends javax.swing.JPanel {
    //private ArrayList<SnackBox> sList;
    private SnackBox snackboxClass;
    
    public SnackBoxProduct(SnackBox boxset) {
        initComponents();
        getData(boxset);
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
        priceLB1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(800, 240));
        setLayout(null);

        choosePieceWreath.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        choosePieceWreath.setText("เลือกจำนวนสินค้า");
        add(choosePieceWreath);
        choosePieceWreath.setBounds(490, 190, 110, 30);

        pieceWreath.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(pieceWreath);
        pieceWreath.setBounds(600, 190, 70, 30);

        productImage.setPreferredSize(new java.awt.Dimension(180, 180));
        add(productImage);
        productImage.setBounds(80, 30, 180, 180);

        scrollDetail.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDetail.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        details.setEditable(false);
        details.setColumns(20);
        details.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        details.setRows(5);
        scrollDetail.setViewportView(details);

        add(scrollDetail);
        scrollDetail.setBounds(350, 80, 320, 100);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(350, 20, 298, 31);

        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        priceLB.setText("รายละเอียด");
        add(priceLB);
        priceLB.setBounds(350, 50, 120, 30);

        priceLB1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        priceLB1.setText("ราคา : ");
        add(priceLB1);
        priceLB1.setBounds(350, 190, 90, 30);
    }// </editor-fold>//GEN-END:initComponents

    public void getData(SnackBox boxset){
    this.snackboxClass = boxset;
    name.setText(snackboxClass.toString());
    details.setText(snackboxClass.getDetail());
    productImage.setIcon(new ImageIcon(snackboxClass.getPath()));
    priceLB.setText(snackboxClass.getPrice()+"บาท");
}

    public SnackBox getsnackboxClass() {
        return snackboxClass;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choosePieceWreath;
    private javax.swing.JTextArea details;
    private javax.swing.ButtonGroup groupColors;
    private javax.swing.ButtonGroup groupWreath;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner pieceWreath;
    private javax.swing.JLabel priceLB;
    private javax.swing.JLabel priceLB1;
    private javax.swing.JLabel productImage;
    private javax.swing.JScrollPane scrollDetail;
    // End of variables declaration//GEN-END:variables
}
