package StoreToHeaven;

import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SandalWoodDetail extends javax.swing.JPanel {
final JFileChooser fc = new JFileChooser();
private ArrayList<SandalWoodDetail> sddList;
private JPanel jp;
private String filePath;


public String getFilePath() {
        return filePath;
    }

    /**
     * Creates new form WreathDetail
     */
    public SandalWoodDetail (ArrayList l, JPanel jp) {
        sddList = l; 
        this.jp = jp;
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choosePicBT = new javax.swing.JButton();
        showPicName = new javax.swing.JLabel();
        detailLB = new javax.swing.JLabel();
        detailSP = new javax.swing.JScrollPane();
        detailTA = new javax.swing.JTextArea();
        priceLB = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        bathLB = new javax.swing.JLabel();
        deleteCB = new javax.swing.JCheckBox();
        pattern = new javax.swing.JLabel();
        patternTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 228, 236));

        choosePicBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        choosePicBT.setText("กดแนบรูปภาพ");
        choosePicBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePicBTActionPerformed(evt);
            }
        });

        showPicName.setBackground(new java.awt.Color(204, 255, 255));
        showPicName.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N

        detailLB.setBackground(new java.awt.Color(204, 255, 255));
        detailLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        detailLB.setText("รายละเอียด ");

        detailTA.setColumns(20);
        detailTA.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        detailTA.setRows(5);
        detailSP.setViewportView(detailTA);

        priceLB.setBackground(new java.awt.Color(204, 255, 255));
        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        priceLB.setText("ราคา");

        priceTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 12)); // NOI18N

        bathLB.setBackground(new java.awt.Color(204, 255, 255));
        bathLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        bathLB.setText("บาทต่อชิ้น");

        deleteCB.setBackground(new java.awt.Color(204, 228, 236));
        deleteCB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        deleteCB.setText("เลือกเพื่อลบ");
        deleteCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteCBItemStateChanged(evt);
            }
        });
        deleteCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCBMouseClicked(evt);
            }
        });
        deleteCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCBActionPerformed(evt);
            }
        });

        pattern.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        pattern.setText("รูปแบบสินค้า : ");

        patternTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pattern, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(patternTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(deleteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(choosePicBT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(showPicName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(detailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(priceLB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(bathLB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pattern)
                        .addComponent(patternTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(choosePicBT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showPicName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(detailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceLB)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bathLB))
                    .addGap(8, 8, 8)
                    .addComponent(detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choosePicBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePicBTActionPerformed
        int returnVal = fc.showDialog(null, "Choose");
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            try {
                filePath = file.getCanonicalPath(); //get imgae's path
            } catch (Exception e) {
                e.printStackTrace();
            }
            showPicName.setText("รูปภาพที่แนบ: "+file.getName());
            //JOptionPane.showMessageDialog(jButton1, file);
        }
    }//GEN-LAST:event_choosePicBTActionPerformed

    private void deleteCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleteCBItemStateChanged
        // TODO add your handling code here:
        //        if (evt.getStateChange() == ItemEvent.SELECTED){
            //           wdList.remove(  getPanelIndex());
            //        }
    }//GEN-LAST:event_deleteCBItemStateChanged

    private void deleteCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCBActionPerformed

    private void deleteCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCBMouseClicked
        sddList.remove(this);
        jp.remove(this);
        jp.setPreferredSize(new Dimension(408, jp.getHeight()-235));
        jp.revalidate();
        jp.repaint();
    }//GEN-LAST:event_deleteCBMouseClicked

    public JTextArea getDetailTA() {
        return detailTA;
    }
    
    public void setDetailTA(JTextArea detailTA) {
        this.detailTA = detailTA;
    }

    public JCheckBox getDeleteCB() {
        return deleteCB;
    }

    public void setDeleteCB(JCheckBox deleteCB) {
        this.deleteCB = deleteCB;
    }

    public JTextField getPatternTF() {
        return patternTF;
    }

    public void setPatternTF(JTextField patternTF) {
        this.patternTF = patternTF;
    }

    public JTextField getPriceTF() {
        return priceTF;
    }

    public void setPriceTF(JTextField priceTF) {
        this.priceTF = priceTF;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bathLB;
    private javax.swing.JButton choosePicBT;
    private javax.swing.JCheckBox deleteCB;
    private javax.swing.JLabel detailLB;
    private javax.swing.JScrollPane detailSP;
    private javax.swing.JTextArea detailTA;
    private javax.swing.JLabel pattern;
    private javax.swing.JTextField patternTF;
    private javax.swing.JLabel priceLB;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel showPicName;
    // End of variables declaration//GEN-END:variables
}
