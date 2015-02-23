/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campogolf;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Ernesto
 */
public class dibujoCampo extends javax.swing.JComponent{
    
    int color;
    
    public dibujoCampo(int x){
        this.color = x;
    }
    
    public dibujoCampo(){
        
    }
        
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.GREEN);
        g.fillOval(100, 100, 250, 100);
        
        
        g.setColor(Color.BLACK);
        g.fillOval(115,140,35,35);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(120, 10, 10, 165);
        
        switch(color){
            case 1:
                g.setColor(Color.red);
            case 2:
                g.setColor(Color.blue);
            case 3:
                g.setColor(Color.green);
            case 4:
                g.setColor(Color.yellow);
        }        
        System.out.println(color);
        g.fillRect(120,10,55,20);
        
        g.setColor(Color.WHITE);
        g.fillOval(240,150,20,20);
        
    }
    
}
