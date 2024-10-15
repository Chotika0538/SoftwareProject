package ToHeaven;

import DAO.*;
import StoreToHeaven.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;


public class WreathProductPage extends javax.swing.JPanel {
    
    private ArrayList<Wreath> wreathClassList;
    private ArrayList<WreathProduct> wreathProduct;
    private CardLayout cd;
    private JPanel mainPanel;
    int i = 1;
    private Wreathdao wreathdao;
    
    public WreathProductPage(JPanel mainPanel) {
        wreathdao = new Wreathdao();
         wreathClassList = wreathdao.getAll();
         wreathProduct = new ArrayList<>();
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

        wreathNameLB = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        addBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wreathProductPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(201, 156, 99));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        wreathNameLB.setBackground(new java.awt.Color(255, 204, 204));
        wreathNameLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        wreathNameLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wreathNameLB.setText("พวงหรีด");
        wreathNameLB.setPreferredSize(new java.awt.Dimension(800, 50));
        add(wreathNameLB, java.awt.BorderLayout.PAGE_START);

        addBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        addBT.setText("เพิ่มสินค้า");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });

        backBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        backBT.setText("<ย้อนกลับ");
        backBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(backBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                .addComponent(addBT)
                .addGap(56, 56, 56))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBT)
                    .addComponent(backBT))
                .addGap(18, 18, 18))
        );

        add(menuPanel, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        wreathProductPanel.setBackground(new java.awt.Color(255, 180, 87));
        wreathProductPanel.setPreferredSize(new java.awt.Dimension(798, 600));
        wreathProductPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        //wreathList.add(new WreathProduct().getData(wreath));
        //wreathProductPanel.add(wreathList.get(0));
        jScrollPane1.setViewportView(wreathProductPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTMouseClicked
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "productpage");
    }//GEN-LAST:event_backBTMouseClicked

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        // TODO add your handling code here:
        ProductInCart.add(new Picked_product("test",100*Math.random(),(int)(10*Math.random()),"/ToHeaven/t.png"));
    }//GEN-LAST:event_addBTActionPerformed
//    public void getWreathData(){
//         wreathClassList = wreathdao.getAll();
//    }
    public void showData(){
        for (Wreath wreath : wreathClassList){
            wreathProduct.add(new WreathProduct(wreath));
            if(wreathClassList.size()>1){
                wreathProductPanel.setPreferredSize(new Dimension(800, wreathProductPanel.getHeight()+1000));
            }
            wreathProductPanel.add(wreathProduct.getLast());
            wreathProductPanel.revalidate();
            wreathProductPanel.repaint();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JButton backBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel wreathNameLB;
    private javax.swing.JPanel wreathProductPanel;
    // End of variables declaration//GEN-END:variables
}
