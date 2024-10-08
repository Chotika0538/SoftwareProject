/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToHeaven;

import javax.swing.*;

/**
 *
 * @author Chotika
 */
public class addtest {
    public static void add(Picked_product p , JPanel jp){
        if (p.getParent() != jp){
            jp.add(p);
            jp.revalidate();
            jp.repaint();
        }
    }
}
