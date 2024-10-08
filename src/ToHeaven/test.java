
package ToHeaven;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class test extends JFrame{
     
    final JFileChooser fc;
    public test(){
        super("Demo");
        fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true);
        //fc.setCurrentDirectory(new )
    }
    
    public static void main(String[] args) {
        test t = new test();
    }
}
