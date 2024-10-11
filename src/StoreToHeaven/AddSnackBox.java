package StoreToHeaven;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AddSnackBox extends javax.swing.JPanel {
    private ArrayList<SnackBoxDetail> sdList;
    private CardLayout cd;
    private JPanel mainPanel;
   
    public AddSnackBox(JPanel mainPanel) {
        sdList = new ArrayList<>();
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patternTF1 = new javax.swing.JTextField();
        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        deleteListBT = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        pattern1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(480, 480));

        patternTF1.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        pic_detail.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pic_detail.setText("รูปและรายละเอียดของสินค้า");

        pic_detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pic_detailJP.setBackground(new java.awt.Color(255, 204, 204));
        pic_detailJP.setPreferredSize(new java.awt.Dimension(408, 231));
        pic_detailJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_detailJPMouseClicked(evt);
            }
        });
        pic_detailJP.setLayout(new javax.swing.BoxLayout(pic_detailJP, javax.swing.BoxLayout.Y_AXIS));
        sdList.add(new SnackBoxDetail(sdList, pic_detailJP));
        pic_detailJP.add(sdList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name.setText("ชื่อสินค้า : ");

        deleteListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        deleteListBT.setText("- ลบรายการ");
        deleteListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteListBTMouseClicked(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        pattern1.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pattern1.setText("ราคาสินค้าแต่ละแบบ  : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic_detail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pattern1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patternTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(deleteListBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addListBT)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patternTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pattern1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addListBT)
                    .addComponent(deleteListBT))
                .addGap(14, 14, 14))
        );
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
        sdList.add(new SnackBoxDetail(sdList, pic_detailJP));
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+235));
        pic_detailJP.add(sdList.get(sdList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked

    private void deleteListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteListBTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteListBTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JButton deleteListBT;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pattern1;
    private javax.swing.JTextField patternTF1;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    // End of variables declaration//GEN-END:variables
}
