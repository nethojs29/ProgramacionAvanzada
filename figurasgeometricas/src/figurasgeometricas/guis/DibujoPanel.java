/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas.guis;

import figurasgeometricas.figuras.Figura;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Ernesto
 */
public class DibujoPanel extends JPanel{
    
    ArrayList l;
    MenuPanel menu;
    Figura figura;
    String clase = "class figurasgeometricas.figuras";
    
    public DibujoPanel(MenuPanel menu){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        TitledBorder title;
        title = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Dibujo");
        title.setTitleJustification(TitledBorder.CENTER);
        this.setBorder(title);
        
        this.menu = menu;
        l = new ArrayList();
        FlowLayout elementos = new FlowLayout();
    }
    
    public void paint(Graphics g){
        for(int i=0;i<l.size();++i){
            figura = (Figura)l.get(i);
            figura.paint(g);
        }
    }
    
    public void agregar(Figura f){
        l.add(f);
    }
    
}
