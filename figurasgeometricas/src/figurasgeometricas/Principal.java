/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import figurasgeometricas.guis.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Ernesto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal vp1 = new VentanaPrincipal();
        MenuPanel mp1 = new MenuPanel();
        EscuchadorVentana ev = new EscuchadorVentana();
        vp1.addWindowListener(ev);
        
        EscuchadorDibujo ed = new EscuchadorDibujo(vp1);
        vp1.dibujo.addMouseListener(ed);
        
        vp1.getContentPane().add(mp1,BorderLayout.NORTH);
        
        vp1.setVisible(true);
    }
    
}
