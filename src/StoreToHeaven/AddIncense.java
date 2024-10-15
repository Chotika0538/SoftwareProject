
package StoreToHeaven;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Khao
 */
public class AddIncense extends javax.swing.JPanel {
   private ArrayList<IncenseDetail> icdList;
    private CardLayout cd;
    private JPanel mainPanel;
    /**
     * Creates new form AddWreath
     */
    public AddIncense(JPanel mainPanel) {
        icdList = new ArrayList<>();
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

        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();
        deleteListBT = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 238, 226));
        setLayout(null);

        pic_detail.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pic_detail.setText("รูปและรายละเอียดของสินค้า");
        add(pic_detail);
        pic_detail.setBounds(30, 50, 157, 27);

        pic_detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pic_detailJP.setBackground(new java.awt.Color(244, 244, 224));
        pic_detailJP.setPreferredSize(new java.awt.Dimension(400, 300));
        pic_detailJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_detailJPMouseClicked(evt);
            }
        });
        pic_detailJP.setLayout(new javax.swing.BoxLayout(pic_detailJP, javax.swing.BoxLayout.Y_AXIS));
        icdList.add(new IncenseDetail(icdList, pic_detailJP));
        pic_detailJP.add(icdList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        add(pic_detailSP);
        pic_detailSP.setBounds(30, 80, 400, 250);

        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });
        add(addListBT);
        addListBT.setBounds(240, 350, 100, 32);

        deleteListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        deleteListBT.setText("- ลบรายการ");
        deleteListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteListBTMouseClicked(evt);
            }
        });
        add(deleteListBT);
        deleteListBT.setBounds(130, 350, 93, 32);

        name1.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name1.setText("ชื่อสินค้า : ");
        add(name1);
        name1.setBounds(30, 10, 58, 27);

        nameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        add(nameTF);
        nameTF.setBounds(100, 10, 270, 27);
    }// </editor-fold>//GEN-END:initComponents

    private void pic_detailJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_detailJPMouseClicked
        // TODO add your handling code here:
        //       JPanel clickjp = (JPanel) evt.getSource();
        //       for(int i =0; i< wdList.size(); i++){
            //           if (wdList.get(i) == clickjp){
                //               if (clickjp.)
                //       }
    }//GEN-LAST:event_pic_detailJPMouseClicked

    private void addListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addListBTMouseClicked
        // TODO add your handling code here:
        icdList.add(new IncenseDetail(icdList, pic_detailJP));
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+235));
        pic_detailJP.add(icdList.get(icdList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked

    private void deleteListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteListBTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteListBTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JButton deleteListBT;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    // End of variables declaration//GEN-END:variables
  
     public JPanel getPic_detailJP() {
        return pic_detailJP;
    }
    
    public JTextField getNameTF() {
        return nameTF;
    }

}

