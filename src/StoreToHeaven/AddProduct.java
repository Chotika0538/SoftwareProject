
package StoreToHeaven;
import DAO.Framedao;
import DAO.Offeringdao;
import DAO.SandalWooddao;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.*;


public class AddProduct extends javax.swing.JPanel implements CheckPanel{
    
    public AddProduct() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addChoices = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showAddProduct = new javax.swing.JPanel();
        confirmBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(null);

        addChoices.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        addChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือกตัวเลือก", "โลงศพ", "พวงหรีด", "ดอกไม้จันทน์", "ชุดไทยธรรม", "ธูปและเทียน", "ชุดอาหารว่าง", "ของชำร่วย", "กรอบรูป", "เพิ่มสินค้า" }));
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
        showAddProduct.setPreferredSize(new java.awt.Dimension(800, 600));
        showAddProduct.setLayout(new java.awt.CardLayout());
        JPanel emptyPanel = new JPanel();
        AddFrame fm = new AddFrame(showAddProduct);
        AddOffering of = new AddOffering(showAddProduct);
        AddSandalWood sw = new AddSandalWood(showAddProduct);
        AddSnackBox sb = new AddSnackBox(showAddProduct);
        emptyPanel.setBackground(new java.awt.Color(153, 255, 204));
        showAddProduct.add(emptyPanel, "empty");
        showAddProduct.add(fm, "frame");
        showAddProduct.add(of, "offering");
        showAddProduct.add(sw, "sandalWood");
        showAddProduct.add(sb, "snackBox");
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
        confirmBT.setBounds(580, 390, 120, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void addChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChoicesActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        if (((String)cb.getSelectedItem()).equals("กรอบรูป")){
            CardLayout cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "frame");
        }
        else if (((String)cb.getSelectedItem()).equals("ชุดไทยธรรม")){
            CardLayout cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "offering");
        }
        else if (((String)cb.getSelectedItem()).equals("ชุดอาหารว่าง")){
            CardLayout cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "snackBox");
        }
        else if (((String)cb.getSelectedItem()).equals("ดอกไม้จันทน์")){
           // jPanel2.add(new AddWreath(jPanel1), "wreath");
            CardLayout cd = (CardLayout) showAddProduct.getLayout();
            cd.show(showAddProduct, "sandalWood");
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

    @Override
    public void checkCurrentCard() {
        for (Component comp : showAddProduct.getComponents()) {
            //เพิ่มกรอบรูปลงexcel
             if (comp.isVisible()&&comp instanceof AddFrame) {
                  Framedao fmd = new Framedao();
                  fmd.save((AddFrame) comp);
                 break; // หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
           }
            //เพิ่มชุดไทยธรรมลงexcel
            else if(comp.isVisible()&&comp instanceof AddOffering){
                Offeringdao ofd = new Offeringdao();
                ofd.save((AddOffering)comp);
                break;// หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
            //เพิ่มดอกไม้จันทน์ลงexcel
            else if(comp.isVisible()&&comp instanceof AddSandalWood){
                SandalWooddao swd = new SandalWooddao();
                swd.save((AddSandalWood)comp);
                break;// หยุดหลังจากเจอหน้าแรกที่แสดงอยู่
            }
        }
    }
}
