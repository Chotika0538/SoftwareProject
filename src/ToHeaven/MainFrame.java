package ToHeaven;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    
    public MainFrame(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
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

        menuBar = new javax.swing.JPanel();
        customBT = new javax.swing.JToggleButton();
        packageBT = new javax.swing.JToggleButton();
        productBT = new javax.swing.JToggleButton();
        homeBT = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        frameJP = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        menuBar.setBackground(new java.awt.Color(255, 204, 204));
        menuBar.setPreferredSize(new java.awt.Dimension(800, 100));
        menuBar.setLayout(null);

        customBT.setBackground(new java.awt.Color(255, 204, 204));
        customBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        customBT.setText("ปรับแต่ง");
        customBT.setBorder(null);
        customBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customBTMouseClicked(evt);
            }
        });
        menuBar.add(customBT);
        customBT.setBounds(650, 0, 110, 100);

        packageBT.setBackground(new java.awt.Color(255, 204, 204));
        packageBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        packageBT.setText("แพ็คเกจ\n");
        packageBT.setBorder(null);
        packageBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packageBTMouseClicked(evt);
            }
        });
        menuBar.add(packageBT);
        packageBT.setBounds(530, 0, 110, 100);

        productBT.setBackground(new java.awt.Color(255, 204, 204));
        productBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        productBT.setText("ผลิตภัณฑ์");
        productBT.setBorder(null);
        productBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productBTMouseClicked(evt);
            }
        });
        menuBar.add(productBT);
        productBT.setBounds(410, 0, 110, 100);

        homeBT.setBackground(new java.awt.Color(255, 204, 204));
        homeBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        homeBT.setText("เกี่ยวกับเรา");
        homeBT.setBorder(null);
        homeBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBTMouseClicked(evt);
            }
        });
        menuBar.add(homeBT);
        homeBT.setBounds(280, 0, 120, 100);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel1.setText("LOGO");
        menuBar.add(jLabel1);
        jLabel1.setBounds(70, 40, 60, 28);

        add(menuBar, java.awt.BorderLayout.PAGE_START);

        frameJP.setLayout(new java.awt.CardLayout());
        Home home = new Home(frameJP);
        ProductPage product = new ProductPage(frameJP);
        WreathProductPage wpp = new WreathProductPage(frameJP);
        CustomCoffin coffincustom = new CustomCoffin(frameJP);
        CustomFuneral funeral = new CustomFuneral(frameJP);
        CustomAsh ash = new CustomAsh(frameJP);
        PackagePage packagepage = new PackagePage(frameJP);
        SnackProductPage snackPage = new SnackProductPage(frameJP);
        /*add each pages into cardlayout on frameJP*/
        frameJP.add(home, "home");
        frameJP.add(product, "product");
        frameJP.add(wpp, "wreathproductpage");
        frameJP.add(coffincustom, "coffincustom");
        frameJP.add(funeral, "funeral");
        frameJP.add(ash, "ash");
        frameJP.add(packagepage, "packagePage");
        frameJP.add(snackPage, "snackPage");
        /*called home page(1st page)*/
        CardLayout cd = (CardLayout) frameJP.getLayout();
        cd.show(frameJP, "home");
        add(frameJP, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void productBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBTMouseClicked
        CardLayout cd = (CardLayout) frameJP.getLayout();
        cd.show(frameJP, "product");
    }//GEN-LAST:event_productBTMouseClicked

    private void homeBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBTMouseClicked
        // TODO add your handling code here:
        CardLayout cd = (CardLayout) frameJP.getLayout();
        cd.show(frameJP, "home");
    }//GEN-LAST:event_homeBTMouseClicked

    private void packageBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageBTMouseClicked
        // TODO add your handling code here:
       CardLayout cd = (CardLayout) frameJP.getLayout();
       cd.show(frameJP, "packagePage");
    }//GEN-LAST:event_packageBTMouseClicked

    private void customBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customBTMouseClicked
        // TODO add your handling code here:
         CardLayout cd = (CardLayout) frameJP.getLayout();
         cd.show(frameJP, "coffin");
    }//GEN-LAST:event_customBTMouseClicked
// /* testing panel*/
//    public static void main(String[] args){
//        JFrame f = new JFrame();
//        f.setContentPane(new MainFrame());
//        f.setSize(800,640);
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton customBT;
    private javax.swing.JPanel frameJP;
    private javax.swing.JToggleButton homeBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuBar;
    private javax.swing.JToggleButton packageBT;
    private javax.swing.JToggleButton productBT;
    // End of variables declaration//GEN-END:variables
}
