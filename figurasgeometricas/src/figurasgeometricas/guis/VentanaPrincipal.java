/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas.guis;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Ernesto
 */
public class VentanaPrincipal extends JFrame{
    public MenuPanel menu = new MenuPanel();
    public DibujoPanel dibujo = new DibujoPanel(menu);
    BorderLayout borde = new BorderLayout();
    public VentanaPrincipal(){
        super("Dibujo hecho por Ernesto Jaramillo");
        setLayout(new BorderLayout());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        setSize(800,600);
        setLocation((int)size.getWidth()/2-400,(int)size.getHeight()/2-300);
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
}
