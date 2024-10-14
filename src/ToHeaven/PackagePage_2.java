package ToHeaven;

import DAO.*;
import StoreToHeaven.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PackagePage_2 extends javax.swing.JPanel {
    
    private ArrayList<Packages> packageClassList;
    private ArrayList<PackageProduct_2> packageProduct;
    private CardLayout cd;
    private JPanel mainPanel;
//    int i = 1;
    private Packagedao packdao;
    
    public PackagePage_2(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        packdao = new Packagedao();
        packageClassList = packdao.getAll();
        packageProduct = new ArrayList<>();

//        this.mainPanel = mainPanel;
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

        packageLB = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        addBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        packageProductPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        packageLB.setBackground(new java.awt.Color(255, 204, 204));
        packageLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        packageLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        packageLB.setText("แพ็คเกจ");
        packageLB.setPreferredSize(new java.awt.Dimension(800, 50));
        add(packageLB, java.awt.BorderLayout.PAGE_START);

        addBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        addBT.setText("เพิ่มสินค้า");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(667, Short.MAX_VALUE)
                .addComponent(addBT)
                .addGap(56, 56, 56))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(addBT)
                .addGap(18, 18, 18))
        );

        add(menuPanel, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        packageProductPanel.setBackground(new java.awt.Color(0, 153, 153));
        packageProductPanel.setDoubleBuffered(false);
        packageProductPanel.setPreferredSize(new java.awt.Dimension(798, 500));
        packageProductPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        //wreathList.add(new WreathProduct().getData(wreath));
        //wreathProductPanel.add(wreathList.get(0));
        jScrollPane1.setViewportView(packageProductPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    public void showData(){
        for (Packages pack : packageClassList){
            packageProduct.add(new PackageProduct_2(pack));
            
            if(packageClassList.size()>1){
                
                packageProductPanel.setPreferredSize(new Dimension(800, packageProductPanel.getHeight()+500));

            }
            packageProductPanel.add(packageProduct.getLast());
            packageProductPanel.revalidate();
            packageProductPanel.repaint();
        }
    }
//    public void showData(){
//        for(Wreath wreath : wreathClassList){
//            WreathProduct product = new WreathProduct (wreath);
//            wreathProduct.add(product);  // เพิ่มเข้าไปในลิสต์ packageProduct
//        
//            wreathProductPanel.add(product);  // เพิ่มคอมโพเนนต์ product ลงใน jPanel1
//        }
//    
//        wreathProductPanel.revalidate();  // ปรับขนาดใหม่ของ Panel
//        wreathProductPanel.repaint();     // รีเฟรชหน้าจอ
//    }
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel packageLB;
    private javax.swing.JPanel packageProductPanel;
    // End of variables declaration//GEN-END:variables
}
