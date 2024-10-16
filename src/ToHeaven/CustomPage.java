/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class CustomPage extends javax.swing.JPanel {
    
    private CardLayout cd;
    private JPanel mainPanel;
    /**
     * Creates new form StartPage1
     */
    public CustomPage(JPanel mainPanel) {
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

        jPanel1 = new javax.swing.JPanel();
        coffinStageLB = new javax.swing.JLabel();
        funeralStageLB = new javax.swing.JLabel();
        boneStageLB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customFrameJP = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 1200));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));
        jPanel1.setLayout(null);

        coffinStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        coffinStageLB.setText("สั่งซื้อโลงศพ");
        jPanel1.add(coffinStageLB);
        coffinStageLB.setBounds(70, 20, 110, 41);

        funeralStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        funeralStageLB.setText("งานฌาปนกิจ");
        jPanel1.add(funeralStageLB);
        funeralStageLB.setBounds(340, 20, 121, 41);

        boneStageLB.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        boneStageLB.setText("การจัดการอัฐิ");
        jPanel1.add(boneStageLB);
        boneStageLB.setBounds(610, 20, 117, 41);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        customFrameJP.setBackground(new java.awt.Color(255, 51, 51));
        customFrameJP.setLayout(new java.awt.CardLayout());
        CustomCoffin coffin = new CustomCoffin(customFrameJP);
        CustomFuneral funeral = new CustomFuneral(customFrameJP);
        CustomAsh ash = new CustomAsh(customFrameJP);

        customFrameJP.add(coffin, "coffincustom");
        customFrameJP.add(funeral, "funeralcustom");
        customFrameJP.add(ash, "ashcustom");

        CardLayout  cd = (CardLayout) customFrameJP.getLayout();
        cd.show(customFrameJP, "coffincustom");
        jScrollPane1.setViewportView(customFrameJP);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
//    /* testing panel*/
//    public static void main(String[] args){
//    JFrame f = new JFrame();
//    f.setContentPane(new CustomPage());
//    f.setSize(1200,700);
//    f.setResizable(false);
//    f.setLocationRelativeTo(null);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boneStageLB;
    private javax.swing.JLabel coffinStageLB;
    private javax.swing.JPanel customFrameJP;
    private javax.swing.JLabel funeralStageLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
