/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author LENOVO
 */
public class AddPackage extends javax.swing.JPanel {
    private static boolean FIRST_LOAD = true ;
    private ArrayList<PackageDetail> wdList;
    private CardLayout cd;
    private JPanel mainPanel;
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    
    public AddPackage(JPanel mainPanel) {
        wdList = new ArrayList<>();
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        loadAllfromExcel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        pic_detail = new javax.swing.JLabel();
        pic_detailSP = new javax.swing.JScrollPane();
        pic_detailJP = new javax.swing.JPanel();
        addListBT = new javax.swing.JButton();
        deleteListBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(480, 480));

        name.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        name.setText("ชื่อสินค้า : ");

        nameTF.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        pic_detail.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        pic_detail.setText("รูปและรายละเอียดของสินค้า");

        pic_detailSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pic_detailJP.setBackground(new java.awt.Color(255, 204, 204));
        pic_detailJP.setPreferredSize(new java.awt.Dimension(410, 300));
        pic_detailJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_detailJPMouseClicked(evt);
            }
        });
        pic_detailJP.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        wdList.add(new PackageDetail(wdList, pic_detailJP));
        pic_detailJP.add(wdList.get(0));
        pic_detailSP.setViewportView(pic_detailJP);

        addListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        addListBT.setText("+ เพิ่มรายการ");
        addListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListBTMouseClicked(evt);
            }
        });
        addListBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListBTActionPerformed(evt);
            }
        });

        deleteListBT.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        deleteListBT.setText("- ลบรายการ");
        deleteListBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteListBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(deleteListBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addListBT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTF))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pic_detail)
                                    .addComponent(pic_detailSP, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pic_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_detailSP, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addListBT)
                    .addComponent(deleteListBT))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadAllfromExcel(){
        int i = 0,numOfRow=-1;
        System.out.println("In load");
        if(FIRST_LOAD){
            try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(8); // เปลี่ยนไปที่ชีต 8
            for(Row row: sheet){
                numOfRow++;
            }
            System.out.println(numOfRow);
            for(Row row : sheet){
                if(i==0){ 
                    i++; continue;
                }
                String pattern = row.getCell(0).getStringCellValue();
                String description = row.getCell(1).getStringCellValue();
                double price = row.getCell(3).getNumericCellValue();
                wdList.add(new PackageDetail(wdList, pic_detailJP,pattern , price , description));
                pic_detailJP.setPreferredSize(new Dimension(408, numOfRow*250));
                pic_detailJP.add(wdList.get(wdList.size()-1));
                pic_detailJP.revalidate();
                pic_detailJP.repaint();
                System.out.println("test "+i++);
            }
            FIRST_LOAD = false;
            }catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (wb != null) {
                        wb.close();
                    }
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void addListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addListBTMouseClicked
        // TODO add your handling code here:
        pic_detailJP.setPreferredSize(new Dimension(408, pic_detailJP.getHeight()+280));
        wdList.add(new PackageDetail(wdList, pic_detailJP));
        pic_detailJP.add(wdList.get(wdList.size()-1));
        pic_detailJP.revalidate();
        pic_detailJP.repaint();
    }//GEN-LAST:event_addListBTMouseClicked

    private void deleteListBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteListBTMouseClicked

    }//GEN-LAST:event_deleteListBTMouseClicked

    private void pic_detailJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_detailJPMouseClicked

//       }
    }//GEN-LAST:event_pic_detailJPMouseClicked

    private void addListBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addListBTActionPerformed

    public JTextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(JTextField nameTF) {
        this.nameTF = nameTF;
    }

    public JPanel getPic_detailJP() {
        return pic_detailJP;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListBT;
    private javax.swing.JButton deleteListBT;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pic_detail;
    private javax.swing.JPanel pic_detailJP;
    private javax.swing.JScrollPane pic_detailSP;
    // End of variables declaration//GEN-END:variables

    public Object getPatternTF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
