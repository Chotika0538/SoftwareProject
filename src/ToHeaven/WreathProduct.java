/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import StoreToHeaven.*;
import java.util.*;
//import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author ASUS
 */
public class WreathProduct extends javax.swing.JPanel {
    private ArrayList<Wreath> wList;
    /**
     * Creates new form ProductWreath
     */
    public WreathProduct() {
        initComponents();
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
        choose = new javax.swing.JLabel();
        chooseColor = new javax.swing.JLabel();
        choosePieceWreath = new javax.swing.JLabel();
        pieceWreath = new javax.swing.JSpinner();
        productImage = new javax.swing.JLabel();
        scrollDetail = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        message = new javax.swing.JLabel();
        textMessage = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        colorCB = new javax.swing.JComboBox<>();
        typeCB1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(242, 217, 220));
        setPreferredSize(new java.awt.Dimension(600, 750));
        setLayout(null);

        choose.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        choose.setText("กรุณาเลือกชนิดพวงหรีด");
        add(choose);
        choose.setBounds(46, 223, 176, 33);

        chooseColor.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        chooseColor.setText("กรุณาเลือกสีพวงหรีด");
        add(chooseColor);
        chooseColor.setBounds(330, 220, 155, 41);

        choosePieceWreath.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        choosePieceWreath.setText("กรุณาเลือกจำนวนสินค้า");
        add(choosePieceWreath);
        choosePieceWreath.setBounds(50, 440, 172, 33);

        pieceWreath.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(pieceWreath);
        pieceWreath.setBounds(220, 440, 80, 30);

        productImage.setPreferredSize(new java.awt.Dimension(180, 180));
        add(productImage);
        productImage.setBounds(23, 25, 180, 180);

        details.setEditable(false);
        details.setColumns(20);
        details.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        details.setRows(5);
        scrollDetail.setViewportView(details);

        add(scrollDetail);
        scrollDetail.setBounds(246, 79, 330, 91);

        message.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        message.setText("กรุณาระบุข้อความบนพวงหรีด");
        add(message);
        message.setBounds(50, 330, 219, 33);
        add(textMessage);
        textMessage.setBounds(50, 370, 358, 45);

        price.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        add(price);
        price.setBounds(371, 188, 80, 20);

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(name);
        name.setBounds(246, 36, 298, 31);

        colorCB.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        colorCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกสี" }));
        add(colorCB);
        colorCB.setBounds(340, 270, 120, 30);

        typeCB1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        typeCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกชนิด" }));
        add(typeCB1);
        typeCB1.setBounds(60, 270, 120, 30);
    }// </editor-fold>//GEN-END:initComponents
public void getData(){
   
}


    public ArrayList<Wreath> getwList() {
        return wList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choose;
    private javax.swing.JLabel chooseColor;
    private javax.swing.JLabel choosePieceWreath;
    private javax.swing.JComboBox<String> colorCB;
    private javax.swing.JTextArea details;
    private javax.swing.ButtonGroup groupColors;
    private javax.swing.ButtonGroup groupWreath;
    private javax.swing.JLabel message;
    private javax.swing.JLabel name;
    private javax.swing.JSpinner pieceWreath;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productImage;
    private javax.swing.JScrollPane scrollDetail;
    private javax.swing.JTextField textMessage;
    private javax.swing.JComboBox<String> typeCB1;
    // End of variables declaration//GEN-END:variables
}
