
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.MatteBorder;
/**
 *
 * @author Chotika
 */
public class Picked_product extends javax.swing.JPanel {
    private String productName;
    private double price;
    private int quentity;
    private String PATH_IMG;
    public Picked_product(String name,double price,int quentity,String path) {
        this.productName=name;
        this.price=price;
        this.quentity=quentity;
        PATH_IMG=path;
        initComponents();
        setEverything();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minusBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PlusBT = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kk = new javax.swing.JLabel();
        productImgPanel = new javax.swing.JPanel();
        productImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        deleteProductBtn = new javax.swing.JLabel();
        quentityLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(800, 260));
        setLayout(null);

        minusBT.setBackground(new java.awt.Color(242, 242, 242));
        minusBT.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        minusBT.setText("-");
        minusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBTActionPerformed(evt);
            }
        });
        add(minusBT);
        minusBT.setBounds(410, 160, 50, 40);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("฿");
        add(jLabel1);
        jLabel1.setBounds(670, 120, 20, 24);

        PlusBT.setBackground(new java.awt.Color(242, 242, 242));
        PlusBT.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        PlusBT.setText("+");
        PlusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusBTActionPerformed(evt);
            }
        });
        add(PlusBT);
        PlusBT.setBounds(570, 160, 50, 40);

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("จำนวน ");
        add(jLabel4);
        jLabel4.setBounds(330, 170, 80, 33);

        kk.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        kk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kk.setText("ราคา");
        add(kk);
        kk.setBounds(350, 120, 60, 30);

        productImgPanel.setBackground(new java.awt.Color(204, 204, 204));

        productImg.setFont(new java.awt.Font("TH Sarabun New", 0, 12)); // NOI18N
        productImg.setPreferredSize(new java.awt.Dimension(260, 180));

        javax.swing.GroupLayout productImgPanelLayout = new javax.swing.GroupLayout(productImgPanel);
        productImgPanel.setLayout(productImgPanelLayout);
        productImgPanelLayout.setHorizontalGroup(
            productImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productImgPanelLayout.setVerticalGroup(
            productImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(productImgPanel);
        productImgPanel.setBounds(30, 60, 260, 180);

        jPanel1.setBackground(new java.awt.Color(101, 85, 61));

        deleteProductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ToHeaven/bin(1).png"))); // NOI18N
        deleteProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(deleteProductBtn)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(deleteProductBtn)
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        quentityLabel.setOpaque(true);
        quentityLabel.setBackground(new java.awt.Color(255, 255, 255));
        quentityLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add(quentityLabel);
        quentityLabel.setBounds(460, 160, 110, 40);

        name.setFont(new java.awt.Font("TH Sarabun New", 1, 30)); // NOI18N
        name.setText("Product's Name");
        add(name);
        name.setBounds(330, 60, 390, 40);

        priceLabel.setOpaque(true);
        priceLabel.setBackground(new java.awt.Color(255, 255, 255));
        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add(priceLabel);
        priceLabel.setBounds(410, 110, 260, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void PlusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusBTActionPerformed
        // TODO add your handling code here:
        quentity+=1;
        quentityLabel.setText(quentity+"");
    }//GEN-LAST:event_PlusBTActionPerformed

    private void minusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBTActionPerformed
        // TODO add your handling code here:
        quentity-=1;
        quentityLabel.setText(quentity+"");
    }//GEN-LAST:event_minusBTActionPerformed

    private void deleteProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductBtnMouseClicked
        // Remove this product from the list of products
        ProductInCart.products.remove(this);

        // Remove this JPanel (the current Picked_product instance) from its parent
        Container parent = this.getParent(); // Get the parent container (likely the panel in the scrollPane)
        parent.remove(this); // Remove this JPanel from the parent container

        // Revalidate and repaint the parent container to update the UI
        parent.revalidate();
        parent.repaint();

        // Optionally, update the display in ProductInCart
        ProductInCart.setDisplay();
    }//GEN-LAST:event_deleteProductBtnMouseClicked
    private void setEverything(){
        name.setText(productName);
        priceLabel.setText(price+"");
        quentityLabel.setText(quentity+"");
       
         productImg.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentResized(java.awt.event.ComponentEvent evt) {
                // Load the image from the resource path
                ImageIcon icon = new ImageIcon(getClass().getResource(PATH_IMG));
                Image img = icon.getImage();

                // Scale the image to fit the JLabel after it has a valid size
                Image scaledImg = img.getScaledInstance(productImg.getWidth(), productImg.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImg);

                // Set the scaled icon to the JLabel
                productImg.setIcon(scaledIcon);
            }
        });
    }

    public String getName(){return productName;}
    public double getPrice(){return price;}
    public int getQuantity(){return quentity;}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PlusBT;
    static javax.swing.JLabel deleteProductBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kk;
    private javax.swing.JButton minusBT;
    private javax.swing.JLabel name;
    private javax.swing.JLabel priceLabel;
    static javax.swing.JLabel productImg;
    private javax.swing.JPanel productImgPanel;
    private javax.swing.JLabel quentityLabel;
    // End of variables declaration//GEN-END:variables
}
