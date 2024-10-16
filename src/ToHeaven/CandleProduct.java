/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import StoreToHeaven.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Khao
 */
public class CandleProduct extends javax.swing.JPanel {
        private ArrayList<Candle> cList;
        private Candle candleClass;
        
        public CandleProduct(Candle candle) {
            initComponents();
            getData(candle);
        }
    /**
     * Creates new form FrameProduct
     */
        public void getData(Candle candle){
        this.candleClass = candle;
        name.setText(candleClass.toString());
        details.setText(candleClass.getDetail());
        productImage.setIcon(new ImageIcon(candleClass.getPath()));
        priceLB.setText(Double.toString(candleClass.getPrice()));
}

        public Candle getFrameClass() {
        return candleClass;
    }
        
        public JPanel gertPanel(){
            return this;
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choosePieceCandle = new javax.swing.JLabel();
        pieceCandle = new javax.swing.JSpinner();
        productImage = new javax.swing.JLabel();
        scrollDetail = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        priceLB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(600, 220));
        setLayout(null);

        choosePieceCandle.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        choosePieceCandle.setText("เลือกจำนวนสินค้า");
        add(choosePieceCandle);
        choosePieceCandle.setBounds(395, 185, 110, 30);

        pieceCandle.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(pieceCandle);
        pieceCandle.setBounds(505, 184, 80, 30);

        productImage.setPreferredSize(new java.awt.Dimension(180, 180));
        add(productImage);
        productImage.setBounds(15, 14, 180, 180);

        details.setEditable(false);
        details.setColumns(20);
        details.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        details.setRows(5);
        scrollDetail.setViewportView(details);

        add(scrollDetail);
        scrollDetail.setBounds(235, 44, 330, 130);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(235, 4, 298, 31);

        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        priceLB.setText("ราคา : ");
        add(priceLB);
        priceLB.setBounds(235, 184, 100, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choosePieceCandle;
    private javax.swing.JTextArea details;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner pieceCandle;
    private javax.swing.JLabel priceLB;
    private javax.swing.JLabel productImage;
    private javax.swing.JScrollPane scrollDetail;
    // End of variables declaration//GEN-END:variables
}
