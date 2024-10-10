/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Payment extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel Mainpanel;
    public static ArrayList<Picked_product> products;
    private JFileChooser fileChooser = new JFileChooser();
    public Payment(JPanel mainPanel) {
        products = new ArrayList();
        Mainpanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slipImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        qrImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollProduct = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        backToCart = new javax.swing.JLabel();
        addSlipBT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        comfirmBtn = new javax.swing.JLabel();
        numOfProduct = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 234));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(null);

        slipImg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        slipImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slipImg.setText("แนบไฟล์รูป");
        slipImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(slipImg);
        slipImg.setBounds(560, 90, 200, 200);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ชนิด");
        add(jLabel3);
        jLabel3.setBounds(160, 60, 50, 22);

        jPanel1.setBackground(new java.awt.Color(215, 186, 143));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("รายการชำระเงิน");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        qrImg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qrImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        qrImg.setPreferredSize(new java.awt.Dimension(100, 100));
        add(qrImg);
        qrImg.setBounds(360, 120, 100, 100);
        ImageIcon icon = new ImageIcon(getClass().getResource("tmpQR.png"));
        Image img = icon.getImage();
        // Scale the image to fit the JLabel after it has a valid size
        Image scaledImg = img.getScaledInstance(qrImg.getWidth(), qrImg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        // Set the scaled icon to the JLabel
        qrImg.setIcon(scaledIcon);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        scrollProduct.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout scrollProductLayout = new javax.swing.GroupLayout(scrollProduct);
        scrollProduct.setLayout(scrollProductLayout);
        scrollProductLayout.setHorizontalGroup(
            scrollProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        scrollProductLayout.setVerticalGroup(
            scrollProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(scrollProduct);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 290, 210);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("สินค้าทั้งหมด");
        add(jLabel6);
        jLabel6.setBounds(20, 60, 110, 22);

        jPanel5.setBackground(new java.awt.Color(196, 166, 121));

        backToCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backToCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backToCart.setText("กลับหน้าตะกร้า");
        backToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToCartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(backToCart)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(backToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel5);
        jPanel5.setBounds(10, 320, 140, 30);

        addSlipBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addSlipBT.setText("แนปสลิป");
        addSlipBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSlipBTActionPerformed(evt);
            }
        });
        add(addSlipBT);
        addSlipBT.setBounds(590, 290, 140, 29);

        jPanel4.setBackground(new java.awt.Color(196, 166, 121));

        comfirmBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comfirmBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comfirmBtn.setText("ยืนยันการชำระ");
        comfirmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comfirmBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(comfirmBtn))
        );

        add(jPanel4);
        jPanel4.setBounds(640, 320, 140, 30);

        numOfProduct.setBackground(new java.awt.Color(255, 255, 255));
        numOfProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numOfProduct.setText("-10");
        add(numOfProduct);
        numOfProduct.setBounds(130, 60, 40, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("กรุณาชำระเงิน");
        add(jLabel1);
        jLabel1.setBounds(360, 90, 150, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void addSlipBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSlipBTActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this); // 'this' refers to the parent component
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Check if the file is a valid image (JPG or PNG)
            String fileName = selectedFile.getName().toLowerCase();
            if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
                // Load the image
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                // Resize the image to fit the JLabel
                Image image = imageIcon.getImage().getScaledInstance(slipImg.getWidth(), slipImg.getHeight(), Image.SCALE_SMOOTH);
                // Set the resized image to the JLabel
                slipImg.setIcon(new ImageIcon(image));
                slipImg.setText(""); // Remove the text after adding the image
            } else {
                // Show an error if the selected file is not JPG or PNG
                slipImg.setText("Invalid file format. Please select a JPG or PNG file.");
            }
        } else {
            slipImg.setText("No file selected.");
        }
    }//GEN-LAST:event_addSlipBTActionPerformed

    private void backToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToCartMouseClicked
        // TODO add your handling code here:
        cd.show(Mainpanel,"ToHeaven.ProductInCart");
        ProductInCart.setDisplay();
    }//GEN-LAST:event_backToCartMouseClicked

    private void comfirmBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comfirmBtnMouseClicked
        // TODO add your handling code here:
         if (slipImg.getIcon() != null) {
            JOptionPane.showMessageDialog(null, "Order confirmed!","Confirm",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No image found. Please upload a slip.","WARNING",JOptionPane.WARNING_MESSAGE);
            saveOrderExcel();
        }
    }//GEN-LAST:event_comfirmBtnMouseClicked
    public static void setDisplay() {
        scrollProduct.removeAll(); // Clear previous items
        scrollProduct.setLayout(new BoxLayout(scrollProduct, BoxLayout.Y_AXIS)); // Use a BoxLayout for vertical alignment
        JPanel[] tmp = new JPanel[products.size()];
        int num = 0;
        double total=0;
        for (Picked_product p : products) {
            tmp[num] = new JPanel(new BorderLayout()); // Use BorderLayout for top-bottom sections
            tmp[num].setPreferredSize(new Dimension(scrollProduct.getWidth(), 60)); // Set preferred size
            tmp[num].setMaximumSize(new Dimension(scrollProduct.getWidth(), 60)); // Set maximum size
            tmp[num].setMinimumSize(new Dimension(scrollProduct.getWidth(), 60)); // Set minimum size
            // Set background color to [255, 204, 102]
            tmp[num].setBackground(new Color(255, 204, 102));

            // Set a bottom border with 1 pixel thickness, black color
            tmp[num].setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));

            // Create label for the product name (top section)
            String intro = p.getName()+" ("+p.getPrice()+")";
            JLabel productName = new JLabel(intro);
            productName.setFont(new Font("Arial", Font.BOLD, 16)); // Adjust font if needed
            productName.setHorizontalAlignment(SwingConstants.LEFT); // Left align text

            // Create label for quantity and total price (bottom section)
            String productDetails = "Quantity: " + p.getQuantity() + " , Total: " + (p.getQuantity() * p.getPrice()) + " B";
            JLabel productInfo = new JLabel(productDetails);
            productInfo.setFont(new Font("Arial", Font.PLAIN, 14));
            productInfo.setHorizontalAlignment(SwingConstants.LEFT); // Left align text

            // Add labels to the panel in different sections
            tmp[num].add(productName, BorderLayout.NORTH); // Top section
            tmp[num].add(productInfo, BorderLayout.CENTER); // Bottom section

            scrollProduct.add(tmp[num]); // Add panel to the scrollProduct
            num++;
            total+=(p.getPrice()*p.getQuantity());
        }
       // Create a panel to show the total price
        JPanel showTotal = new JPanel();
        showTotal.setPreferredSize(new Dimension(scrollProduct.getWidth(), 60)); // Set preferred size
        showTotal.setMaximumSize(new Dimension(scrollProduct.getWidth(), 60)); // Set maximum size
        showTotal.setMinimumSize(new Dimension(scrollProduct.getWidth(), 60)); // Set minimum size
        String totalText = "Total: " + total + " B";
        JLabel totalLabel = new JLabel(totalText);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Bold font for total
        showTotal.add(totalLabel);
        scrollProduct.add(showTotal); // Add the total price panel  
        adjustScrollPageSize(products.size()+1); // Adjust the scroll page size based on the number of items
        numOfProduct.setText(String.valueOf(num)); // Display the number of products
        System.out.println(total);
    }

    private static void adjustScrollPageSize(int num) {
        int heightPerObject = 60; // Adjust the height per product as needed
        int totalHeight = num * heightPerObject;
        scrollProduct.setPreferredSize(new Dimension(scrollProduct.getWidth(), totalHeight));
        scrollProduct.revalidate(); // Revalidate to update the layout
        scrollProduct.repaint();    // Repaint to refresh the view
    }
    private void saveOrderExcel(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSlipBT;
    private javax.swing.JLabel backToCart;
    private javax.swing.JLabel comfirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JLabel numOfProduct;
    static javax.swing.JLabel qrImg;
    static javax.swing.JPanel scrollProduct;
    private javax.swing.JLabel slipImg;
    // End of variables declaration//GEN-END:variables
}
