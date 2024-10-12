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
    
  //  private CardLayout cd;
    private JPanel mainPanel;
    
    public CustomCoffin(JPanel mainPanel) {
        this.mainPanel = mainPanel;
       // cd = (CardLayout) mainPanel.getLayout();
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
        buttonPanel = new javax.swing.JPanel();
        confirmBT = new javax.swing.JButton();
        nextBT = new javax.swing.JButton();
        coffinPanel = new javax.swing.JPanel();

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

        confirmBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        confirmBT.setText("ยืนยัน");

        nextBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        nextBT.setText("หน้าถัดไป>");
        nextBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(confirmBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(nextBT)
                .addGap(48, 48, 48))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBT)
                    .addComponent(nextBT))
                .addGap(37, 37, 37))
        );

        add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        coffinPanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout coffinPanelLayout = new javax.swing.GroupLayout(coffinPanel);
        coffinPanel.setLayout(coffinPanelLayout);
        coffinPanelLayout.setHorizontalGroup(
            coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        coffinPanelLayout.setVerticalGroup(
            coffinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1295, Short.MAX_VALUE)
        );

        add(coffinPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBTMouseClicked
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "funeral");
    }//GEN-LAST:event_nextBTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boneStageLB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel coffinPanel;
    private javax.swing.JLabel coffinStageLB;
    private javax.swing.JButton confirmBT;
    private javax.swing.JLabel funeralStageLB;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel menuCustom;
    private javax.swing.JButton nextBT;
    // End of variables declaration//GEN-END:variables
}
