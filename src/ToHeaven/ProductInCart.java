/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Chotika
 */
public class ProductInCart extends javax.swing.JPanel {
    public static ArrayList<Picked_product> products;
    private CardLayout cd;
    private JPanel Mainpanel;
    public ProductInCart(JPanel mainPanel) {
        products = new ArrayList();
        Mainpanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderJP = new javax.swing.JPanel();
        header_textJL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Scroll_page = new javax.swing.JPanel();
        PaybarJP = new javax.swing.JPanel();
        PayButton_JP = new javax.swing.JPanel();
        goPayment = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        HeaderJP.setBackground(new java.awt.Color(102, 102, 0));
        HeaderJP.setPreferredSize(new java.awt.Dimension(800, 52));

        header_textJL.setBackground(new java.awt.Color(0, 0, 0));
        header_textJL.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        header_textJL.setForeground(new java.awt.Color(255, 255, 255));
        header_textJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_textJL.setText("สินค้าในตะกร้า");

        javax.swing.GroupLayout HeaderJPLayout = new javax.swing.GroupLayout(HeaderJP);
        HeaderJP.setLayout(HeaderJPLayout);
        HeaderJPLayout.setHorizontalGroup(
            HeaderJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderJPLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(header_textJL, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        HeaderJPLayout.setVerticalGroup(
            HeaderJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_textJL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(HeaderJP, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Scroll_page.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout Scroll_pageLayout = new javax.swing.GroupLayout(Scroll_page);
        Scroll_page.setLayout(Scroll_pageLayout);
        Scroll_pageLayout.setHorizontalGroup(
            Scroll_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        Scroll_pageLayout.setVerticalGroup(
            Scroll_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        Scroll_page.setLayout(new java.awt.GridLayout(0, 1));
        Scroll_page.setPreferredSize(new java.awt.Dimension(800, 600));
        Scroll_page.setPreferredSize(new java.awt.Dimension(800, 900));

        jScrollPane2.setViewportView(Scroll_page);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        PaybarJP.setBackground(new java.awt.Color(215, 186, 143));
        PaybarJP.setPreferredSize(new java.awt.Dimension(800, 45));

        PayButton_JP.setBackground(new java.awt.Color(196, 166, 121));
        PayButton_JP.setPreferredSize(new java.awt.Dimension(100, 52));
        PayButton_JP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayButton_JPMouseClicked(evt);
            }
        });

        goPayment.setBackground(new java.awt.Color(204, 204, 204));
        goPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        goPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goPayment.setText("ชำระเงิน>");
        goPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goPaymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PayButton_JPLayout = new javax.swing.GroupLayout(PayButton_JP);
        PayButton_JP.setLayout(PayButton_JPLayout);
        PayButton_JPLayout.setHorizontalGroup(
            PayButton_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayButton_JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        PayButton_JPLayout.setVerticalGroup(
            PayButton_JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayButton_JPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PaybarJPLayout = new javax.swing.GroupLayout(PaybarJP);
        PaybarJP.setLayout(PaybarJPLayout);
        PaybarJPLayout.setHorizontalGroup(
            PaybarJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaybarJPLayout.createSequentialGroup()
                .addGap(0, 683, Short.MAX_VALUE)
                .addComponent(PayButton_JP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PaybarJPLayout.setVerticalGroup(
            PaybarJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PayButton_JP, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        add(PaybarJP, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    // create new Picked_product with for loop , add parameter 
    private void PayButton_JPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayButton_JPMouseClicked
        cd.show(Mainpanel,"payment");
    }//GEN-LAST:event_PayButton_JPMouseClicked

    private void goPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goPaymentMouseClicked
        Payment.products=products;
        Payment.setDisplay();
        cd.show(Mainpanel,"payment");
    }//GEN-LAST:event_goPaymentMouseClicked
    private static void adjustScrollPageSize() {
        int numberOfObjects = Scroll_page.getComponentCount(); 
        int heightPerObject = 260; 
        int totalHeight = numberOfObjects * heightPerObject;
        Scroll_page.setPreferredSize(new java.awt.Dimension(800, totalHeight));
        Scroll_page.revalidate(); 
    }
    public static void add(Picked_product p){
        products.add(p);
        Scroll_page.add(p);
        adjustScrollPageSize();
    }
    public static void setDisplay(){
        for(Picked_product p : products){
            Scroll_page.add(p);
        }
        adjustScrollPageSize();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderJP;
    private javax.swing.JPanel PayButton_JP;
    private javax.swing.JPanel PaybarJP;
    static javax.swing.JPanel Scroll_page;
    private javax.swing.JLabel goPayment;
    private javax.swing.JLabel header_textJL;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
