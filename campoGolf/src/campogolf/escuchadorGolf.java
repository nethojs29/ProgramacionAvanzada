/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campogolf;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernesto
 */
public class escuchadorGolf extends JComponent implements MouseListener,ActionListener {

    String[] opciones = {"Rojo","Azul","Verde","Amarillo"};
    public String resp;
    int color; //1 = Rojo, 2 = Azul, 3 = Verde, 4 = Amarillo
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Point mouse;
        mouse = MouseInfo.getPointerInfo().getLocation();
        System.out.println("Le picaste aqui: "+mouse.x+" en x y "+mouse.y+" en y");
        
        
        if((mouse.x>110 && mouse.x<358) && (mouse.y>133 && mouse.y<230)){
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione un color", "Cambio de color", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[2]);    
        }
        if((mouse.x>128 && mouse.x<182) && (mouse.y>42 && mouse.y<60)){
            resp = (String) JOptionPane.showInputDialog(null, "Seleccione un color", "Cambio de color", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        }
        switch (resp) {
            case "Rojo":
                color = 1;
                System.out.println("Escogiste "+color);
                break;
            case "Azul":
                color = 2;
                System.out.println("Escogiste "+color);
                break;
            case "Verde":
                color = 3;
                System.out.println("Escogiste "+color);
                break;
            default:
                color = 4;
                System.out.println("Escogiste "+color);
                break;
        }
        
        dibujoCampo dc = new dibujoCampo(color);
        dc.setVisible(true);
    }
    
    @Override
     public void paint(Graphics g){
        g.drawString("Hola", 100, 100);
     }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
