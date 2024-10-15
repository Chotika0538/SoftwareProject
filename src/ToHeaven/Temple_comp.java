/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ToHeaven;

import java.util.ArrayList;
import javax.swing.JPanel;
import StoreToHeaven.*;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author Chotika
 */
public class Temple_comp extends javax.swing.JPanel {

    private ArrayList<Temple_comp> TemList;
    private Temple temple_class;
    private JPanel selectedListPanel;
    private boolean chosen;
    private JLabel[] all_choices = new JLabel[5];
    private ArrayList<JLabel> all_chosenTem;
    public Temple_comp(Temple tp, ArrayList<JLabel> lables) {
        this.temple_class = tp;
        //this.selectedListPanel = selectedTemJP;
        TemList = new ArrayList<>();
        all_chosenTem = lables;
        chosen = false;
        initComponents();
        setData();
        
//        for(int i=0; i<selectedTemJP.length; i++){
//            all_choices[i] = selectedTemJP[i];
//        }
        //Component selectedListPanel.getComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adressTA = new javax.swing.JTextArea();
        temNameLB = new javax.swing.JLabel();
        chooseCB = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(244, 244, 224));
        setPreferredSize(new java.awt.Dimension(310, 150));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel1.setText("ที่อยู่ :");
        add(jLabel1);
        jLabel1.setBounds(20, 40, 70, 20);

        adressTA.setColumns(20);
        adressTA.setRows(5);
        jScrollPane1.setViewportView(adressTA);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 66, 270, 70);

        temNameLB.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        add(temNameLB);
        temNameLB.setBounds(20, 10, 220, 20);

        chooseCB.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        chooseCB.setText("เลือก");
        chooseCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseCBMouseClicked(evt);
            }
        });
        chooseCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCBActionPerformed(evt);
            }
        });
        add(chooseCB);
        chooseCB.setBounds(250, 0, 60, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseCBMouseClicked
        if(chooseCB.isSelected()){
            //setShownChosenTem(temNameLB.getText()); 
            for(JLabel lb: all_chosenTem){
                if(lb.getText()==""){
                    lb.setText(temNameLB.getText());
                    break;
                }
            }
        }
        //unchecked
        else{
           for(JLabel lb: all_chosenTem){
                if(lb.getText().equals(temNameLB.getText())){
                    lb.setText("");
                    break;
                }
            }
        }
//        chooseCB.setVisible(true);
    }//GEN-LAST:event_chooseCBMouseClicked

    private void chooseCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCBActionPerformed
        
    }//GEN-LAST:event_chooseCBActionPerformed
    
    public String getTempleName(){
        return temNameLB.getText();
    }

    public void setData(){
        temNameLB.setText(temple_class.getTempleName());
        adressTA.setText(temple_class.getTempleAddress());
    }
    
    public boolean chosenTemple(){
        return chosen;
    }
    public JPanel getJPanel(){
        return this;
    }
    public void setChooseBT(boolean selected){
        chooseCB.setSelected(selected);
    }
    public void setChooseBTenable(boolean enable){
        chooseCB.setEnabled(enable);
    }
    public boolean getChooseBT(){
        if(chooseCB.isSelected()){
            return true;
        }
        return false;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adressTA;
    private javax.swing.JCheckBox chooseCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel temNameLB;
    // End of variables declaration//GEN-END:variables
}
