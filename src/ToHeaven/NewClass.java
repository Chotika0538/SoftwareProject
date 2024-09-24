/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToHeaven;

import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class NewClass extends JFrame {
    public NewClass(){
        setLayout(new CardLayout());
        setContentPane(new login());
        
        
        setSize(500, 500);  // กำหนดขนาดของ JFrame

        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new NewClass();
    }
}
