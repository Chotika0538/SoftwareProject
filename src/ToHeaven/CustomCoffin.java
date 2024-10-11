/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author LENOVO
 */
public class CustomCoffin extends javax.swing.JPanel {
    
    private CardLayout cd;
    private JPanel mainPanel;
    
    public CustomCoffin(JPanel mainPanel) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        menuCustom = new javax.swing.JPanel();
        coffinStageLB = new javax.swing.JLabel();
        funeralStageLB = new javax.swing.JLabel();
        boneStageLB = new javax.swing.JLabel();
        coffinPanel = new javax.swing.JPanel();
        negletBT = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        sizeLB = new javax.swing.JLabel();
        size20BT = new javax.swing.JRadioButton();
        size22BT = new javax.swing.JRadioButton();
        size24BT = new javax.swing.JRadioButton();
        cof1Pic = new javax.swing.JLabel();
        cof2Pic = new javax.swing.JLabel();
        cof3Pic = new javax.swing.JLabel();
        cof4Pic = new javax.swing.JLabel();
        cof5Pic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailCof1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailCof2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        detailCof3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        detailCof4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        detailCof5 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirmBT = new javax.swing.JButton();
        nextBT = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setPreferredSize(new java.awt.Dimension(800, 1400));
        setLayout(new java.awt.BorderLayout());

        menuCustom.setBackground(new java.awt.Color(0, 204, 204));
        menuCustom.setPreferredSize(new java.awt.Dimension(800, 80));
        menuCustom.setLayout(null);

        coffinStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        coffinStageLB.setText("สั่งซื้อโลงศพ");
        menuCustom.add(coffinStageLB);
        coffinStageLB.setBounds(70, 20, 110, 41);

        funeralStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        funeralStageLB.setText("งานฌาปนกิจ");
        menuCustom.add(funeralStageLB);
        funeralStageLB.setBounds(340, 20, 121, 41);

        boneStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        boneStageLB.setText("การจัดการอัฐิ");
        menuCustom.add(boneStageLB);
        boneStageLB.setBounds(610, 20, 117, 41);

        add(menuCustom, java.awt.BorderLayout.PAGE_START);

        coffinPanel.setBackground(new java.awt.Color(204, 255, 204));
        coffinPanel.setPreferredSize(new java.awt.Dimension(800, 900));

        negletBT.setFont(new java.awt.Font("RainyThin", 0, 20)); // NOI18N
        negletBT.setText("ไม่สนใจสั่งซื้อ");
        negletBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negletBTMouseClicked(evt);
            }
        });

        sizeLB.setFont(new java.awt.Font("MiTNThin", 0, 18)); // NOI18N
        sizeLB.setText("ขนาด :");

        buttonGroup1.add(size20BT);
        size20BT.setFont(new java.awt.Font("MiTNThin", 1, 14)); // NOI18N
        size20BT.setText("20");
        size20BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size20BTActionPerformed(evt);
            }
        });

        buttonGroup1.add(size22BT);
        size22BT.setFont(new java.awt.Font("MiTNThin", 1, 14)); // NOI18N
        size22BT.setText("22");

        buttonGroup1.add(size24BT);
        size24BT.setFont(new java.awt.Font("MiTNThin", 1, 14)); // NOI18N
        size24BT.setText("24");

        cof1Pic.setText("pic 1");
        cof1Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cof2Pic.setText("pic 2");
        cof2Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cof3Pic.setText("pic 3");

        cof4Pic.setText("pic 4");

        cof5Pic.setText("pic 5");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailCof1.setColumns(20);
        detailCof1.setFont(new java.awt.Font("MiTNThin", 0, 14)); // NOI18N
        detailCof1.setRows(5);
        detailCof1.setText("รายละเอียดโรงศพ\n-\n-\n-");
        jScrollPane1.setViewportView(detailCof1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailCof2.setColumns(20);
        detailCof2.setFont(new java.awt.Font("MiTNThin", 0, 14)); // NOI18N
        detailCof2.setRows(5);
        detailCof2.setText("รายละเอียดโรงศพ\n-\n-\n-");
        jScrollPane2.setViewportView(detailCof2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailCof3.setColumns(20);
        detailCof3.setFont(new java.awt.Font("MiTNThin", 0, 14)); // NOI18N
        detailCof3.setRows(5);
        detailCof3.setText("รายละเอียดโรงศพ\n-\n-\n-");
        jScrollPane3.setViewportView(detailCof3);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailCof4.setColumns(20);
        detailCof4.setFont(new java.awt.Font("MiTNThin", 0, 14)); // NOI18N
        detailCof4.setRows(5);
        detailCof4.setText("รายละเอียดโรงศพ\n-\n-\n-");
        jScrollPane4.setViewportView(detailCof4);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        detailCof5.setColumns(20);
        detailCof5.setFont(new java.awt.Font("MiTNThin", 0, 14)); // NOI18N
        detailCof5.setRows(5);
        detailCof5.setText("รายละเอียดโรงศพ\n-\n-\n-");
        jScrollPane5.setViewportView(detailCof5);

        jLabel1.setFont(new java.awt.Font("RainyThin", 0, 18)); // NOI18N
        jLabel1.setText("จำนวน");

        jLabel2.setFont(new java.awt.Font("MoopaThin", 1, 18)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setFont(new java.awt.Font("MoopaThin", 1, 18)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("MoopaThin", 1, 18)); // NOI18N
        jLabel4.setText("+");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cof1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cof2Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cof3Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cof4Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cof5Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sizeLB)
                        .addGap(55, 55, 55)
                        .addComponent(size20BT)
                        .addGap(56, 56, 56)
                        .addComponent(size22BT)
                        .addGap(56, 56, 56)
                        .addComponent(size24BT)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(size20BT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(size22BT)
                        .addComponent(size24BT))
                    .addComponent(sizeLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cof1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cof2Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cof3Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cof4Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cof5Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        confirmBT.setFont(new java.awt.Font("MoopaThin", 0, 20)); // NOI18N
        confirmBT.setText("ยืนยัน");

        nextBT.setFont(new java.awt.Font("MoopaThin", 0, 20)); // NOI18N
        nextBT.setText("ถัดไป >");

        javax.swing.GroupLayout coffinPanelLayout = new javax.swing.GroupLayout(coffinPanel);
        coffinPanel.setLayout(coffinPanelLayout);
        coffinPanelLayout.setHorizontalGroup(
            coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffinPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(negletBT)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(coffinPanelLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(confirmBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBT)
                .addGap(72, 72, 72))
        );
        coffinPanelLayout.setVerticalGroup(
            coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffinPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(negletBT)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBT)
                    .addComponent(nextBT))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(coffinPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void negletBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negletBTMouseClicked
        // TODO add your handling code here:
        JRadioButton bt = (JRadioButton) evt.getSource();
        if(bt.isSelected()){
            jPanel3.setEnabled(false);
            for(Component cp : jPanel3.getComponents()){
                cp.setEnabled(false);
            }
        } else{
            jPanel3.setEnabled(true);
            for(Component cp : jPanel3.getComponents()){
                cp.setEnabled(true);
            }
        }
       

    }//GEN-LAST:event_negletBTMouseClicked

    private void size20BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size20BTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_size20BTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boneStageLB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cof1Pic;
    private javax.swing.JLabel cof2Pic;
    private javax.swing.JLabel cof3Pic;
    private javax.swing.JLabel cof4Pic;
    private javax.swing.JLabel cof5Pic;
    private javax.swing.JPanel coffinPanel;
    private javax.swing.JLabel coffinStageLB;
    private javax.swing.JButton confirmBT;
    private javax.swing.JTextArea detailCof1;
    private javax.swing.JTextArea detailCof2;
    private javax.swing.JTextArea detailCof3;
    private javax.swing.JTextArea detailCof4;
    private javax.swing.JTextArea detailCof5;
    private javax.swing.JLabel funeralStageLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel menuCustom;
    private javax.swing.JRadioButton negletBT;
    private javax.swing.JButton nextBT;
    private javax.swing.JRadioButton size20BT;
    private javax.swing.JRadioButton size22BT;
    private javax.swing.JRadioButton size24BT;
    private javax.swing.JLabel sizeLB;
    // End of variables declaration//GEN-END:variables
}
