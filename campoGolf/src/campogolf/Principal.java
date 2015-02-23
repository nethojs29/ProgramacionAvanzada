/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campogolf;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Jesús Ernesto Jaramillo Salazar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        escuchadorGolf eg = new escuchadorGolf();
        
        dibujoCampo dc;
        dc = new dibujoCampo();
        JFrame jf1 = new JFrame();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        
        jf1.getContentPane().add(dc);
        jf1.setVisible(true);
        jf1.setSize((int)size.getWidth(),(int)size.getHeight());
        
        dc.addMouseListener(eg);
        dc = new dibujoCampo(eg.color);
        System.out.println(eg.color);
        jf1.getContentPane().add(dc);
        dc.addMouseListener(eg);
        
    }
    
}
