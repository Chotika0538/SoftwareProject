package ToHeaven;

import DAO.*;
import StoreToHeaven.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;


public class IncenseProductPage extends javax.swing.JPanel {
    
    private ArrayList<Incense> incenseClassList;
    private ArrayList<IncenseProduct> incenseProduct;
    private CardLayout cd;
    private JPanel mainPanel;
    private Incensedao incensedao;
    
    public IncenseProductPage(JPanel mainPanel) {
        incensedao= new Incensedao();
        incenseClassList = incensedao.getAll();
        incenseProduct = new ArrayList<>();
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incenseNameLB = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        addBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        incenseProductPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(201, 156, 99));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        incenseNameLB.setBackground(new java.awt.Color(255, 204, 204));
        incenseNameLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        incenseNameLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incenseNameLB.setText("ธูป (Incense)");
        incenseNameLB.setPreferredSize(new java.awt.Dimension(800, 50));
        add(incenseNameLB, java.awt.BorderLayout.PAGE_START);

        addBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        addBT.setText("เพิ่มสินค้า");

        backBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        backBT.setText("<ย้อนกลับ");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        jButton1.setText("TEST");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(backBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(231, 231, 231)
                .addComponent(addBT)
                .addGap(56, 56, 56))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBT)
                    .addComponent(backBT)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        add(menuPanel, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        incenseProductPanel.setBackground(new java.awt.Color(255, 180, 87));
        incenseProductPanel.setPreferredSize(new java.awt.Dimension(798, 500));
        incenseProductPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        //wreathList.add(new WreathProduct().getData(wreath));
        //wreathProductPanel.add(wreathList.get(0));
        jScrollPane1.setViewportView(incenseProductPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBTActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //        for(int j = 1; j<5; j++){
            //           wreathList.add(new WreathProduct());
            //           wreathProductPanel.setPreferredSize(new Dimension(800, wreathProductPanel.getHeight()+500));
            //           wreathProductPanel.add(wreathList.get(j));
            //           wreathProductPanel.revalidate();
            //        }

    }//GEN-LAST:event_jButton1MouseClicked
//    public void getWreathData(){
//         wreathClassList = wreathdao.getAll();
//    }
   public void showData(){
        for (Incense incense : incenseClassList){
            incenseProduct.add(new IncenseProduct(incense));
            //candleProductPanel.setPreferredSize(new Dimension(800, candleProductPanel.getHeight()+500));
            incenseProductPanel.add(incenseProduct.getLast());
            incenseProductPanel.revalidate();
            incenseProductPanel.repaint();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JButton backBT;
    private javax.swing.JLabel incenseNameLB;
    private javax.swing.JPanel incenseProductPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
