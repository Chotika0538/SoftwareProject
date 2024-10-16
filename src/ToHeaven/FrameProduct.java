/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import DAO.*;
import StoreToHeaven.Frame;
import StoreToHeaven.Wreath;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class FrameProduct extends javax.swing.JPanel {
        private ArrayList<Frame> fList;
        private Frame frameClass;
        public FrameProduct(Frame frame) {
            initComponents();
            getData(frame);
    }
    /**
     * Creates new form FrameProduct
     */
        public void getData(Frame frame){
        this.frameClass = frame;
        name.setText(frameClass.toString());
        detailProduct.setText(frameClass.getDetail());
        productImage.setIcon(new ImageIcon(frameClass.getPath()));
        priceLB.setText(Double.toString(frameClass.getPrice()));
}

        public Frame getFrameClass() {
        return frameClass;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productImage = new javax.swing.JLabel();
        detailOfProduct = new javax.swing.JScrollPane();
        detailProduct = new javax.swing.JTextArea();
        piece = new javax.swing.JSpinner();
        priceLB = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        choosePiece = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(800, 235));
        setLayout(null);

        productImage.setPreferredSize(new java.awt.Dimension(180, 180));
        add(productImage);
        productImage.setBounds(23, 25, 180, 180);

        detailOfProduct.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        detailOfProduct.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailProduct.setEditable(false);
        detailProduct.setColumns(20);
        detailProduct.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        detailProduct.setRows(5);
        detailProduct.setPreferredSize(new java.awt.Dimension(330, 140));
        detailOfProduct.setViewportView(detailProduct);

        add(detailOfProduct);
        detailOfProduct.setBounds(240, 40, 332, 144);

        piece.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(piece);
        piece.setBounds(500, 190, 64, 22);

        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        priceLB.setText("ราคา : ");
        add(priceLB);
        priceLB.setBounds(250, 190, 170, 20);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(260, 10, 298, 31);

        choosePiece.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        choosePiece.setText("เลือกจำนวนสินค้า");
        add(choosePiece);
        choosePiece.setBounds(390, 190, 110, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choosePiece;
    private javax.swing.JScrollPane detailOfProduct;
    private javax.swing.JTextArea detailProduct;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner piece;
    private javax.swing.JLabel priceLB;
    private javax.swing.JLabel productImage;
    // End of variables declaration//GEN-END:variables
}
