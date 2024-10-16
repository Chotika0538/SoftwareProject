/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;
import DAO.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.*;
import java.util.ArrayList;
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
        confirmBT = new javax.swing.JButton();
        showAddProduct = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        addChoices.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        addChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือกตัวเลือก", "โลงศพ", "พวงหรีด", "ดอกไม้จันทน์", "ชุดไทยธรรม", "ธูป", "เทียน", "ชุดอาหารว่าง", "ของชำร่วย", "กรอบรูป", "แพ็คเกจ" }));
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

        showAddProduct.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.setLayout(new java.awt.CardLayout());
        JPanel emptyPanel = new JPanel();
        AddWreath wreath = new AddWreath(showAddProduct);
        AddCoffin coffin = new AddCoffin(showAddProduct);
        AddFrame frame = new AddFrame(showAddProduct);
        AddIncense incense = new AddIncense(showAddProduct);
        AddCandle candle = new AddCandle(showAddProduct);
        AddOffering offering = new AddOffering(showAddProduct);
        AddSandalWood sandalwood = new AddSandalWood(showAddProduct);
        AddSnackBox snackbox = new AddSnackBox(showAddProduct);
        AddSouvenir souvenir= new AddSouvenir(showAddProduct);
        AddPackage pk = new AddPackage(showAddProduct);
        emptyPanel.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.add(emptyPanel, "empty");
        showAddProduct.add(coffin, "coffin");
        showAddProduct.add(wreath, "wreath");
        showAddProduct.add(frame, "frame");
        showAddProduct.add(incense, "incense");
        showAddProduct.add(candle, "candle");
        showAddProduct.add(offering, "offering");
        showAddProduct.add(sandalwood, "sandalwood");
        showAddProduct.add(snackbox, "snackbox");
        showAddProduct.add(souvenir, "souvenir");
        showAddProduct.add(pk, "package");
        add(showAddProduct);
        showAddProduct.setBounds(10, 110, 480, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void addChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChoicesActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        CardLayout cd;
        //choose wreath
        if (((String)cb.getSelectedItem()).equals("พวงหรีด")){
           // jPanel2.add(new AddWreath(jPanel1), "wreath");
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "wreath");
        }
        //choose sandalwood
        else if (((String)cb.getSelectedItem()).equals("ดอกไม้จันทน์")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "sandalwood");
        }
        //choose coffin
        else if(((String)cb.getSelectedItem()).equals("โลงศพ")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "coffin");
        }
        //choose snack box
        else if(((String)cb.getSelectedItem()).equals("ชุดอาหารว่าง")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "snackbox");
        }
        //choose offerings
        else if(((String)cb.getSelectedItem()).equals("ชุดไทยธรรม")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "offering");
        }
        //choose candles
        else if(((String)cb.getSelectedItem()).equals("เทียน")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "candle");
        }
        //choose incense
        else if(((String)cb.getSelectedItem()).equals("ธูป")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "incense");
        }
        //choose sevanior
        else if(((String)cb.getSelectedItem()).equals("ของชำร่วย")){
             cd = (CardLayout) showAddProduct.getLayout();
             cd.show(showAddProduct, "souvenir");
        }
        //choose frame 
        else if(((String)cb.getSelectedItem()).equals("กรอบรูป")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "frame");
        }
        //choose add product
        else if(((String)cb.getSelectedItem()).equals("แพ็คเกจ")){
            cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "package");
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
               break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่String pattern = wd.get(a).getPatternTF().getText();
            }
            if (comp.isVisible()&& comp instanceof AddSnackBox){
                AddSnackBox as = (AddSnackBox)comp;
                SnackBoxdao sd = new SnackBoxdao();
                sd.save(as);
                break;
            }
            else if (comp.isVisible()&& comp instanceof AddOffering) {
                Offeringdao od = new Offeringdao();
                od.save((AddOffering) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddCoffin) {
                Coffindao cd = new Coffindao();
                cd.save((AddCoffin) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddCandle) {
                Candledao cand = new Candledao();
                cand.save((AddCandle) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddIncense) {
                Incensedao ind = new Incensedao();
                ind.save((AddIncense) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddSandalWood) {
                SandalWooddao sand = new SandalWooddao();
                sand.save((AddSandalWood) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddSouvenir) {
                Souvenirdao soud = new Souvenirdao();
                soud.save((AddSouvenir) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddPackage) {
                Packagedao packd = new Packagedao();
                packd.save((AddPackage) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            else if (comp.isVisible()&& comp instanceof AddFrame) {
                Framedao framed = new Framedao();
                framed.save((AddFrame) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }            
        }
    }
}
