/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToHeaven;


import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp {
    
    public static void main(String[] args) {
        // สร้าง JFrame หลัก
        JFrame f = new JFrame("CardLayout Example");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // สร้าง JPanel หลักที่จะเก็บทุกหน้าและตั้งค่า CardLayout ให้กับ JPanel นี้
        JPanel mainPanel = new JPanel(new CardLayout());

        // สร้างแต่ละหน้าที่จะใช้ใน CardLayout
        home homePanel = new home(mainPanel);  // ส่ง mainPanel ให้ home panel เพื่อสามารถสลับหน้าได้
        regist registPanel = new regist(mainPanel);  // ส่ง mainPanel ให้ regist panel
        login loginPanel   = new login(mainPanel);
        product productPanel = new product(mainPanel);
        
        // เพิ่มแต่ละหน้าเข้าไปใน mainPanel พร้อมตั้งชื่อเพื่อใช้อ้างอิง
        mainPanel.add(homePanel, "home");
        mainPanel.add(registPanel, "regist");
        mainPanel.add(loginPanel, "login");
        mainPanel.add(productPanel,"product");

        // แสดงหน้าแรก (home)
        CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
        cardLayout.show(mainPanel, "login");

        // ตั้ง mainPanel เป็น ContentPane ของ JFrame
        f.setContentPane(mainPanel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

