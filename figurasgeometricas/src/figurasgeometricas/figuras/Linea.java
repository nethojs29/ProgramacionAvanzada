/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas.figuras;

import figurasgeometricas.guis.MenuPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author Ernesto
 */
public class Linea extends Figura{
    MenuPanel menu;
     Color color;
     Point p0,pf;
     int grosor;

    public Linea(Color color, Point p0, Point pf, int grosor) {
        this.color = color;
        this.p0 = p0;
        this.pf = pf;
        this.grosor = grosor;
    }
     
     
    @Override
     public void paint(Graphics g){
         Graphics2D gg = (Graphics2D)g;
         gg.setStroke(new BasicStroke(grosor));
         g.setColor(color);
         g.drawLine(p0.x, p0.y, pf.x, pf.y);
     }
}
