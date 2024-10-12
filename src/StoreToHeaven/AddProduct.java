/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.*;
import java.util.ArrayList;
import DAO.Wreathdao;
import DAO.Snackboxdao;
public class AddProduct extends javax.swing.JPanel implements CheckPanel{
    
    private ArrayList<Wreath> wList;
    private ArrayList<SnackBox> snackList;
    
    public AddProduct() {
        wList = new ArrayList<>();
        snackList = new ArrayList<>();
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

        addChoices = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showAddProduct = new javax.swing.JPanel();
        confirmBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        addChoices.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        addChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือกตัวเลือก", "โลงศพ", "พวงหรีดและดอกไม้จันทน์", "ชุดไทยธรรม", "ธูปและเทียน", "ชุดอาหารว่าง", "ของชำร่วย", "กรอบรูป", "เพิ่มสินค้า" }));
        addChoices.setAlignmentX(1.0F);
        addChoices.setAlignmentY(1.0F);
        addChoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChoicesActionPerformed(evt);
            }
        });
        add(addChoices);
        addChoices.setBounds(520, 130, 241, 39);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("เพิ่ม - ลดสินค้า");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 100);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 100);

        showAddProduct.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.setLayout(new java.awt.CardLayout());
        JPanel emptyPanel = new JPanel();
        AddWreath wreath = new AddWreath(showAddProduct);
        AddSnackBox boxset = new AddSnackBox(showAddProduct);

        emptyPanel.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.add(emptyPanel, "empty");
        showAddProduct.add(wreath, "wreath");
        showAddProduct.add(boxset, "snackbox");
        add(showAddProduct);
        showAddProduct.setBounds(10, 110, 480, 480);

        confirmBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        confirmBT.setText("ยืนยันรายการ");
        confirmBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmBTMouseClicked(evt);
            }
        });
        confirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBTActionPerformed(evt);
            }
        });
        add(confirmBT);
        confirmBT.setBounds(590, 460, 120, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void addChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChoicesActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        CardLayout cd;
        //choose wreath&flower
        if (((String)cb.getSelectedItem()).equals("พวงหรีดและดอกไม้จันทน์")){
           // jPanel2.add(new AddWreath(jPanel1), "wreath");
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "wreath");
        }
        //choose coffin
        else if(((String)cb.getSelectedItem()).equals("โลงศพ")){
//            cd = (CardLayout) showAddProduct.getLayout();
//            cd.show(showAddProduct, "");
        }
        //choose snack box
        else if(((String)cb.getSelectedItem()).equals("ชุดอาหารว่าง")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "snackbox");
        }
        //choose offerings
        else if(((String)cb.getSelectedItem()).equals("ชุดไทยธรรม")){
            //cd = (CardLayout) showAddProduct.getLayout();
            //cd.show(showAddProduct, "");
        }
        //choose candles
        else if(((String)cb.getSelectedItem()).equals("ธูปและเทียน")){
            //cd = (CardLayout) showAddProduct.getLayout();
            //cd.show(showAddProduct, "");
        }
        //choose sevanior
        else if(((String)cb.getSelectedItem()).equals("ของชำร่วย")){
            //cd = (CardLayout) showAddProduct.getLayout();
            //cd.show(showAddProduct, "");
        }
        //choose frame 
        else if(((String)cb.getSelectedItem()).equals("กรอบรูป")){
            //cd = (CardLayout) showAddProduct.getLayout();
            //cd.show(showAddProduct, "");
        }
        //choose add product
        else if(((String)cb.getSelectedItem()).equals("เพิ่มสินค้า")){
            //cd = (CardLayout) showAddProduct.getLayout();
            //cd.show(showAddProduct, "");
        }
    }//GEN-LAST:event_addChoicesActionPerformed

    private void confirmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmBTActionPerformed

    private void confirmBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBTMouseClicked
        // TODO add your handling code here:
        checkCurrentCard();
    }//GEN-LAST:event_confirmBTMouseClicked
 /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new AddProduct());
        f.setSize(800,640);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addChoices;
    private javax.swing.JButton confirmBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel showAddProduct;
    // End of variables declaration//GEN-END:variables

    public void buildTemplate(){
        
    }
    
    @Override
    public void checkCurrentCard() {
        for (Component comp : showAddProduct.getComponents()) {
            if (comp.isVisible()&& comp instanceof AddWreath) {
                AddWreath aw = (AddWreath) comp;
                Wreathdao wd = new Wreathdao();
                
                wd.save(aw);//save to excel
                for(int i = 0; i<aw.getCountPic_DetailJP(); i++){
                    WreathDetail temp = (WreathDetail) aw.getPic_detailJP().getComponent(i);
                    String name = aw.getNameTF().getText();
                    String pattern = temp.getPatternTF().getText();
                    String detail = temp.getDetailTA().getText();
                    String path = temp.getFilePath();
                    String material = aw.getMaterialTF().getText();
                    String color = aw.getColorTF().getText();
                    String price = aw.getPriceTF().getText();
                    wList.add(new Wreath(name,pattern,detail,path,material,color,price));       
                }
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่String pattern = wd.get(a).getPatternTF().getText();
            }
            else if (comp.isVisible()&& comp instanceof AddSnackBox){
                AddSnackBox as = (AddSnackBox)comp;
                Snackboxdao sd = new Snackboxdao();
                sd.save(as);
                for(int i = 0; i<as.getCountPic_DetailJP(); i++){
                    SnackBoxDetail temp = (SnackBoxDetail) as.getPic_detailJP().getComponent(i);
                    
                    String name = as.getNameTF().getText();
                    String pattern = temp.getPatternTF().getText();
                    String detail = temp.getDetailTA().getText();
                    String path = temp.getFilePath();
                    String price = temp.getPriceTF().getText();
                    snackList.add(new SnackBox(name, pattern, detail,path, price));   
                }
                break;
            }
//            else if (comp.isVisible()&& comp instanceof AddCoffin) {
//                Wreathdao wd = new Wreathdao();
//                wd.save((AddWreath) comp);
//                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
//            }
        }
    }
}
