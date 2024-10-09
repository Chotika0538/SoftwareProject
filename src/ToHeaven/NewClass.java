/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToHeaven;

import javax.swing.JFrame;

/**
 *
 * @author Khao
 */
public class NewClass extends JFrame {
    public NewClass(){
        setContentPane(new ProductCoffin());
        setSize(800,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new NewClass();
    }
}
