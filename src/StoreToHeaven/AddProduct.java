/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreToHeaven;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.*;
import DAO.*;
import java.util.ArrayList;

public class AddProduct extends javax.swing.JPanel implements CheckPanel{
    private ArrayList<Wreath> wList;  //keep data to show at wreath template of user
    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        wList = new ArrayList<>();
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
        addChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือกตัวเลือก", "โลงศพ", "พวงหรีด", "ดอกไม้จันทน์", "ชุดไทยธรรม", "ธูป", "เทียน", "ชุดอาหารว่าง", "ของชำร่วย", "กรอบรูป" }));
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
        //AddCoffin coffin = new AddCoffin(showAddProduct);
        //AddFrame frame = new AddFrame(showAddProduct);
        //AddIncense incense = new AddIncense(showAddProduct);
        //AddCandle candle = new AddCandle(showAddProduct);
        AddOffering offering = new AddOffering(showAddProduct);
        //AddSandalWood sandalwood = new AddSandalWood(showAddProduct);
        //AddSnackBox snackbox = new AddSnackBox(showAddProduct);
        //AddSouvenirs souvenir= new AddSouvenirs(showAddProduct);
        emptyPanel.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.add(emptyPanel, "empty");
        //showAddProduct.add(coffin, "coffin");
        showAddProduct.add(wreath, "wreath");
        //showAddProduct.add(frame, "frame");
        //showAddProduct.add(incense, "incense");
        //showAddProduct.add(candle, "candle");
        showAddProduct.add(offering, "offering");
        //showAddProduct.add(sandlewood, "sandlewood");
        //showAddProduct.add(snackbox, "snackbox");
        //showAddProduct.add(souvenir, "souvenir");
        add(showAddProduct);
        showAddProduct.setBounds(10, 110, 480, 480);

        confirmBT.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        confirmBT.setText("ยืนยันรายการ");
        confirmBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmBTMouseClicked(evt);
            }
        });
        add(confirmBT);
        confirmBT.setBounds(590, 460, 120, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void addChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChoicesActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        CardLayout cd = (CardLayout) showAddProduct.getLayout();
        if (((String)cb.getSelectedItem()).equals("โลงศพ")){
            cd.show(showAddProduct, "coffin");
        } else if(((String)cb.getSelectedItem()).equals("พวงหรีด")){
             cd.show(showAddProduct, "wreath");
//        }else if(((String)cb.getSelectedItem()).equals("ดอกไม้จันทน์")){
//             cd.show(showAddProduct, "sandlewood");
        }else if(((String)cb.getSelectedItem()).equals("ชุดไทยธรรม")){
             cd.show(showAddProduct, "offering");
//        }else if(((String)cb.getSelectedItem()).equals("ธูป")){
//             cd.show(showAddProduct, "incense");
//        }else if(((String)cb.getSelectedItem()).equals("เทียน")){
//             cd.show(showAddProduct, "candle");
//        }else if(((String)cb.getSelectedItem()).equals("ชุดอาหารว่าง")){
//             cd.show(showAddProduct, "snackbox");
//        }else if(((String)cb.getSelectedItem()).equals("ของชำร่วย")){
//             cd.show(showAddProduct, "souvenir");
//        }else if(((String)cb.getSelectedItem()).equals("กรอบรูป")){
//             cd.show(showAddProduct, "frame");
        }
    }//GEN-LAST:event_addChoicesActionPerformed

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
                wd.save(aw);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่String pattern = wd.get(a).getPatternTF().getText();
            }
            else if (comp.isVisible()&& comp instanceof AddOffering) {
                Offeringdao od = new Offeringdao();
                od.save((AddOffering) comp);
                break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
        }
    }
}
