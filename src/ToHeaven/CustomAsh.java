package ToHeaven;

import java.awt.CardLayout;
import javax.swing.JPanel;


public class CustomAsh extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    
    public CustomAsh(JPanel mainPanel) {
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

        menuCustom = new javax.swing.JPanel();
        coffinStageLB = new javax.swing.JLabel();
        funeralStageLB = new javax.swing.JLabel();
        boneStageLB = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        backPanel = new javax.swing.JButton();
        confirmPanel = new javax.swing.JButton();
        ashPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(800, 600));
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

        backPanel.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        backPanel.setText("<ย้อนกลับ");
        backPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPanelMouseClicked(evt);
            }
        });
        backPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPanelActionPerformed(evt);
            }
        });

        confirmPanel.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        confirmPanel.setText("ยืนยัน");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(backPanel)
                .addGap(265, 265, 265)
                .addComponent(confirmPanel)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPanel)
                    .addComponent(backPanel))
                .addGap(25, 25, 25))
        );

        add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        ashPanel.setBackground(new java.awt.Color(204, 204, 255));

        jComboBox1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัดพระศรีมหาธาตุ (กรุงเทพ)", "วัดโสมนัส (กรุงเทพ)", "วัดหัวลำโพง (กรุงเทพ)", "วัดเขาใหญ่ (สุพรรณบุรี)", "วัดบ้านบึง (พิษณุโลก)", "วัดสว่างอารมณ์ (กำแพงเพชร)", "วัดบางม่วง (นนทบุรี)", "วัดไผ่ล้อม (นครปฐม)", "วัดป้อมแก้ว (สมุทรสงคราม)", "วัดป่าอดุลยาราม (ขอนแก่น)", "วัดสุกาวาส (บุรีรัมย์)", "วัดหนองคู (นครราชสีมา)", "วัดสว่างสระทอง (ร้อยเอ็ด)", "วัดจันทิมา (อำนาจเจริญ)", "วัดสองพี่น้อง (สระแก้ว)", "วัดหัวสวน (ฉะเชิงเทรา)", "วัดสายวารี (ชลบุรี)", "วัดน้ำใส (ระยอง)", "วัดทองทั่ว (จันทบุรี)", "วัดดอนเจดีย์ (ตาก)", "วัดท่าเรือ (กาญจนบุรี)", "วัดทุ่งตาล (ราชบุรี)", "วัดแหลมปอ (ชุมพร)", "วัดจันทาราม (ระนอง)", "วัดแก้วโกรวาราม (กระบี่)" }));
        ashPanel.add(jComboBox1);

        add(ashPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backPanelActionPerformed

    private void backPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseClicked
        // TODO add your handling code here:
         ((CardLayout)mainPanel.getLayout()).show(mainPanel, "funeral");
    }//GEN-LAST:event_backPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ashPanel;
    private javax.swing.JButton backPanel;
    private javax.swing.JLabel boneStageLB;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel coffinStageLB;
    private javax.swing.JButton confirmPanel;
    private javax.swing.JLabel funeralStageLB;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel menuCustom;
    // End of variables declaration//GEN-END:variables
}
