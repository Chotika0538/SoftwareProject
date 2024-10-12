
package StoreToHaven;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Khao
 */
public class AddCandle extends javax.swing.JPanel {
    private ArrayList<CandleDetail> cndList;
    private CardLayout cd;
    private JPanel mainPanel;
    /**
     * Creates new form AddWreath
     */
    public AddCandle(JPanel mainPanel) {
        cndList = new ArrayList<>();
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

        jColorChooser1 = new javax.swing.JColorChooser();
        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();
        deleteListBT = new javax.swing.JButton();
        sizeTF = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        nameTF1 = new javax.swing.JTextField();
        name3 = new javax.swing.JLabel();

        setLayout(null);

        pic_detail.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pic_detail.setText("รูปและรายละเอียดของสินค้า");
        add(pic_detail);
        pic_detail.setBounds(30, 90, 157, 27);

        pic_detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pic_detailJP.setBackground(new java.awt.Color(255, 204, 204));
        pic_detailJP.setPreferredSize(new java.awt.Dimension(400, 300));
        pic_detailJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_detailJPMouseClicked(evt);
            }
        });
        pic_detailJP.setLayout(new javax.swing.BoxLayout(pic_detailJP, javax.swing.BoxLayout.Y_AXIS));
        cndList.add(new CandleDetail(cndList, pic_detailJP));
        pic_detailJP.add(cndList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        add(pic_detailSP);
        pic_detailSP.setBounds(30, 120, 400, 250);

        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });
        add(addListBT);
        addListBT.setBounds(240, 380, 100, 32);

        deleteListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        deleteListBT.setText("- ลบรายการ");
        deleteListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteListBTMouseClicked(evt);
            }
        });
        add(deleteListBT);
        deleteListBT.setBounds(130, 380, 93, 32);

        sizeTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        add(sizeTF);
        sizeTF.setBounds(100, 50, 270, 27);

        name1.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name1.setText("ชื่อสินค้า : ");
        add(name1);
        name1.setBounds(30, 10, 58, 27);

        nameTF1.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        add(nameTF1);
        nameTF1.setBounds(100, 10, 270, 27);

        name3.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        name3.setText("ขนาด : ");
        add(name3);
        name3.setBounds(30, 50, 50, 23);
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
        cndList.add(new CandleDetail(cndList, pic_detailJP));
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+235));
        pic_detailJP.add(cndList.get(cndList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked

    private void deleteListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteListBTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteListBTMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JButton deleteListBT;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name3;
    private javax.swing.JTextField nameTF1;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    private javax.swing.JTextField sizeTF;
    // End of variables declaration//GEN-END:variables
   
    public JTextField getNameTF() {
        return sizeTF;
    }

    public JPanel getPic_detailJP() {
        return pic_detailJP;
    }
    public JTextField getSizeTF() {
        return sizeTF;
    }
}



