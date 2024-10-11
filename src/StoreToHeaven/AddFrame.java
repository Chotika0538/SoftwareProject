package StoreToHeaven;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.zip.Checksum;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddFrame extends javax.swing.JPanel{
    private ArrayList<FrameDetail> fdList;
    private CardLayout cd;
    private JPanel mainPanel;
    private int countPic_DetailJP;
    /**
     * Creates new form AddFrame
     */
    public AddFrame(JPanel mainPanel) {
        fdList = new ArrayList<>();
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        material = new javax.swing.JLabel();
        deleteListBT = new javax.swing.JButton();
        priceTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        materialTF = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(480, 480));

        name.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name.setText("ชื่อสินค้า : ");

        material.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        material.setText("วัสดุ  : ");

        deleteListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        deleteListBT.setText("- ลบรายการ");
        deleteListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteListBTMouseClicked(evt);
            }
        });
        deleteListBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteListBTActionPerformed(evt);
            }
        });

        priceTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        nameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        materialTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        price.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        price.setText("ราคาสินค้าแต่ละแบบ  : ");

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
        fdList.add(new FrameDetail(fdList, pic_detailJP));
        pic_detailJP.add(fdList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });

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
                                .addComponent(price)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(name)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTF))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(material)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(materialTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addListBT)
                    .addComponent(deleteListBT))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteListBTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteListBTMouseClicked

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
        fdList.add(new FrameDetail(fdList, pic_detailJP));
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+235));
        pic_detailJP.add(fdList.get(fdList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void deleteListBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteListBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteListBTActionPerformed

    public JTextField getMaterialTF() {
        return materialTF;
    }

    public void setMaterialTF(JTextField materialTF) {
        this.materialTF = materialTF;
    }

    public JTextField getPriceTF() {
        return priceTF;
    }

    public void setPriceTF(JTextField priceTF) {
        this.priceTF = priceTF;
    }

    public JTextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(JTextField nameTF) {
        this.nameTF = nameTF;
    }

    public JPanel getPic_detailJP() {
        return pic_detailJP;
    }

    public int getCountPic_DetailJP() {
        return countPic_DetailJP;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JButton deleteListBT;
    private javax.swing.JLabel material;
    private javax.swing.JTextField materialTF;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTF;
    // End of variables declaration//GEN-END:variables

    public void CheckCurentCard() {
        countPic_DetailJP = 0;
        for(Component c : pic_detailJP.getComponents()){
            countPic_DetailJP+=1;
        }
    }

 
}
