package StoreToHeaven;

import ToHeaven.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_emp extends javax.swing.JFrame {
        private CardLayout cardLayout;
        private JPanel mainPanel;

    public Main_emp() {
        initComponents();
         cardLayout = new CardLayout();
        mainPanel = new  JPanel(cardLayout);
        mainPanel.add(new EmpLogin(mainPanel),"EmpLogin");
        mainPanel.add(new AddProduct(mainPanel),"AddPro");
        add(mainPanel);
        cardLayout.show(mainPanel,"EmpLogin");
        setSize(800,640);
        setContentPane(mainPanel);
               setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
