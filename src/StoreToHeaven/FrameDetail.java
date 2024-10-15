package StoreToHeaven;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameDetail extends javax.swing.JPanel {
    final JFileChooser fc = new JFileChooser();
    private ArrayList<FrameDetail> fdList;
    private JPanel jp;
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public FrameDetail(ArrayList l, JPanel jp) {
        fdList = l; 
        this.jp = jp;
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailSP = new javax.swing.JScrollPane();
        detailTA = new javax.swing.JTextArea();
        priceLB = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        bathLB = new javax.swing.JLabel();
        deleteCB = new javax.swing.JCheckBox();
        pattern = new javax.swing.JLabel();
        patternTF = new javax.swing.JTextField();
        choosePicBT = new javax.swing.JButton();
        showPicName = new javax.swing.JLabel();
        detailLB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 224));
        setLayout(null);

        detailTA.setColumns(20);
        detailTA.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        detailTA.setRows(5);
        detailSP.setViewportView(detailTA);

        add(detailSP);
        detailSP.setBounds(12, 110, 347, 110);

        priceLB.setBackground(new java.awt.Color(204, 255, 255));
        priceLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        priceLB.setText("ราคา");
        add(priceLB);
        priceLB.setBounds(212, 80, 27, 21);

        priceTF.setFont(new java.awt.Font("TH Sarabun New", 0, 12)); // NOI18N
        add(priceTF);
        priceTF.setBounds(242, 80, 76, 23);

        bathLB.setBackground(new java.awt.Color(204, 255, 255));
        bathLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        bathLB.setText("บาทต่อชิ้น");
        add(bathLB);
        bathLB.setBounds(322, 80, 55, 21);

        deleteCB.setBackground(new java.awt.Color(244, 244, 224));
        deleteCB.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        deleteCB.setText("เลือกเพื่อลบ");
        deleteCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteCBItemStateChanged(evt);
            }
        });
        deleteCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCBActionPerformed(evt);
            }
        });
        add(deleteCB);
        deleteCB.setBounds(302, 10, 85, 20);

        pattern.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        pattern.setText("รูปแบบสินค้า : ");
        add(pattern);
        pattern.setBounds(12, 10, 90, 21);

        patternTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        add(patternTF);
        patternTF.setBounds(102, 10, 160, 27);

        choosePicBT.setBackground(new java.awt.Color(242, 242, 242));
        choosePicBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        choosePicBT.setText("กดแนบรูปภาพ");
        choosePicBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePicBTActionPerformed(evt);
            }
        });
        add(choosePicBT);
        choosePicBT.setBounds(12, 50, 106, 26);

        showPicName.setBackground(new java.awt.Color(204, 255, 255));
        showPicName.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        add(showPicName);
        showPicName.setBounds(132, 50, 160, 30);

        detailLB.setBackground(new java.awt.Color(204, 255, 255));
        detailLB.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        detailLB.setText("รายละเอียด ");
        add(detailLB);
        detailLB.setBounds(12, 80, 66, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleteCBItemStateChanged
        // TODO add your handling code here:
        //        if (evt.getStateChange() == ItemEvent.SELECTED){
            //           wdList.remove(  getPanelIndex());
            //        }
    }//GEN-LAST:event_deleteCBItemStateChanged

    private void deleteCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCBActionPerformed

    public JCheckBox getDeleteCB() {
        return deleteCB;
    }

    public void setDeleteCB(JCheckBox deleteCB) {
        this.deleteCB = deleteCB;
    }

    public JTextArea getDetailTA() {
        return detailTA;
    }

    public void setDetailTA(JTextArea detailTA) {
        this.detailTA = detailTA;
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

    private void choosePicBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePicBTActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showDialog(null, "Choose");
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            try {
                filePath = file.getCanonicalPath();          //get imgae's path
            } catch (Exception e) {
                e.printStackTrace();
            }
            showPicName.setText("รูปภาพที่แนบ: "+file.getName());
            //JOptionPane.showMessageDialog(jButton1, file);
        }
    }//GEN-LAST:event_choosePicBTActionPerformed


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
