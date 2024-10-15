package ToHeaven;

import DAO.*;
import StoreToHeaven.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;


public class CoffinProductPage extends javax.swing.JPanel {
    
    private ArrayList<Coffin> coffinClassList ;
    protected static ArrayList<CoffinProduct> coffinProduct;
    private CardLayout cd;
    private JPanel mainPanel;
    int i = 1;
    private Coffindao coffindao;
    
    public CoffinProductPage(JPanel mainPanel) {
        coffindao = new Coffindao();
        coffinClassList = coffindao.getAll();
        coffinProduct = new ArrayList<>();
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

        coffinNameLB = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        addBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coffinProductPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(101, 85, 61));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        coffinNameLB.setBackground(new java.awt.Color(255, 204, 204));
        coffinNameLB.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        coffinNameLB.setForeground(new java.awt.Color(255, 255, 255));
        coffinNameLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coffinNameLB.setText("โลงศพ");
        coffinNameLB.setPreferredSize(new java.awt.Dimension(800, 50));
        add(coffinNameLB, java.awt.BorderLayout.PAGE_START);

        menuPanel.setBackground(new java.awt.Color(101, 85, 61));

        addBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addBT.setText("เพิ่มสินค้า");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });

        backBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
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

        coffinProductPanel.setBackground(new java.awt.Color(244, 244, 224));
        coffinProductPanel.setPreferredSize(new java.awt.Dimension(798, 2500));
        coffinProductPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        //wreathList.add(new WreathProduct().getData(wreath));
        //wreathProductPanel.add(wreathList.get(0));
        jScrollPane1.setViewportView(coffinProductPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        // TODO add your handling code here:
        ProductInCart.add(new Picked_product("test",100*Math.random(),(int)(10*Math.random()),"/ToHeaven/t.png"));
    }//GEN-LAST:event_addBTActionPerformed

    private void backBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTMouseClicked
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "productpage");
    }//GEN-LAST:event_backBTMouseClicked
//    public void getWreathData(){
//         wreathClassList = wreathdao.getAll();
//    }
//    public void showData(){
//        for (Coffin coffin : coffinClassList){
//            coffinProduct.add(new CoffinProduct(coffin));
//            coffinProductPanel.add(coffinProduct.getLast());
//            coffinProductPanel.setPreferredSize(new Dimension(800, coffinProduct.size() * 150));
//            coffinProductPanel.revalidate();
//            coffinProductPanel.repaint();
//        }
//
//        // Revalidate JScrollPane ด้วย
//        jScrollPane1.revalidate();
//        jScrollPane1.repaint();
//    }
       public void showData() {
    // ตรวจสอบขนาดของรายการ
    System.out.println("Size of coffinClassList: " + coffinClassList.size());

    // แสดงข้อมูลชื่อโลงศพ
    for (Coffin coffin : coffinClassList) {
        System.out.println(coffin.getName());  // ตรวจสอบข้อมูลชื่อโลงศพ
        coffinProduct.add(new CoffinProduct(coffin));
        coffinProductPanel.add(coffinProduct.get(coffinProduct.size() - 1));
        coffinProductPanel.setPreferredSize(new Dimension(800, coffinProduct.size() * 250));
        coffinProductPanel.revalidate();
        coffinProductPanel.repaint();
    }

    // Revalidate JScrollPane ด้วย
    jScrollPane1.revalidate();
    jScrollPane1.repaint();
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JButton backBT;
    private javax.swing.JLabel coffinNameLB;
    private javax.swing.JPanel coffinProductPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
