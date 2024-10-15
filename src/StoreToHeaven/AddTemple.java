package StoreToHeaven;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddTemple extends javax.swing.JPanel{
    private ArrayList<TempleDetail> tmpList;
    private CardLayout cd;
    private JPanel mainPanel;
    private int countPic_DetailJP;
    /**
     * Creates new form AddOffering
     */
    public AddTemple(JPanel mainPanel) {
        tmpList = new ArrayList<>();
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTF = new javax.swing.JTextField();
        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();
        name = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 226));
        setPreferredSize(new java.awt.Dimension(480, 480));

        nameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        pic_detail.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pic_detail.setText("เพิ่มรายละเอียด:");

        pic_detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pic_detailJP.setBackground(new java.awt.Color(244, 244, 224));
        pic_detailJP.setPreferredSize(new java.awt.Dimension(408, 231));
        pic_detailJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_detailJPMouseClicked(evt);
            }
        });
        pic_detailJP.setLayout(new javax.swing.BoxLayout(pic_detailJP, javax.swing.BoxLayout.Y_AXIS));
        tmpList.add(new TempleDetail(tmpList, pic_detailJP));
        pic_detailJP.add(tmpList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        addListBT.setBackground(new java.awt.Color(242, 242, 242));
        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name.setText("จังหวัด :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic_detail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(addListBT)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pic_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addListBT)
                .addContainerGap(63, Short.MAX_VALUE))
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
        tmpList.add(new TempleDetail(tmpList, pic_detailJP));
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+235));
        pic_detailJP.add(tmpList.get(tmpList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked


    public JTextField getProvinceTF() {
        return nameTF;
    }
    public void setProvinceTF(JTextField nameTF) {
        this.nameTF = nameTF;
    }
    public JPanel getPic_detailJP() {
        return pic_detailJP;
    }
    public void setPic_detailJP(JPanel pic_detailJP) {
        this.pic_detailJP = pic_detailJP;
    }
    public int getCountPic_DetailJP() {
        return countPic_DetailJP;
    }
     public void checkCurrentCard() {
        countPic_DetailJP = 0;
        for(Component c : pic_detailJP.getComponents()){
            countPic_DetailJP+=1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    // End of variables declaration//GEN-END:variables
}
