/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccionesgraficas;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Graphics;

/**
 *
 * @author Ernesto
 */
public class DibujaFraccion extends javax.swing.JComponent{
    
    Fraccion fr1, fr2;
    int x=0;
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); //no se para que es esto pero igual lo pongo     
	   //Le ponemos un borde y un color de fondo	       
                  g.setColor(BLACK);
                  int aux=150;
                  int aux1,aux2,aux3;
                  Fraccion suma = new Fraccion();
                  
                  //g.fillRect(50,50,200,140);
                  g.drawString(""+fr1.obtenerNumerador(),130,200);
                  g.drawString("/"+fr1.obtenerDenominador(),140,200);
                  
                  g.drawString(""+fr2.obtenerNumerador(),400,200);
                  g.drawString("/"+fr2.obtenerDenominador(),410,200);
                  
                  aux/=fr1.obtenerDenominador();
                  aux1=aux*fr1.obtenerDenominador();
                  
                  g.fillRect(50,50,aux1,140);
                  
                 
                  for(int i=1;i<=fr1.obtenerNumerador();++i){
                      g.setColor(Color.pink);
                       g.fillRect(50, 50, aux*i, 140);
                  }
                  for(int i=1;i<=fr1.obtenerDenominador();++i){
                      g.setColor(Color.red);
                      g.drawLine(50+aux*i,50,50+aux*i,190);                      
                  }
                  
                  aux=150;
                  aux/=fr2.obtenerDenominador();
                  aux2=aux*fr2.obtenerDenominador();
 
                  g.setColor(Color.black);
                  g.fillRect(300,50,aux2,140);
                  
                  for(int i=1;i<=fr2.obtenerNumerador();++i){
                      g.setColor(Color.yellow);
                       g.fillRect(300, 50, aux*i, 140);
                  }
                  for(int i=1;i<=fr2.obtenerDenominador();++i){
                      g.setColor(Color.red);
                      g.drawLine(300+aux*i,50,300+aux*i,190);                      
                  }
                  
                  suma = fr1.sumar(fr2);
                  g.drawString(""+suma.obtenerNumerador(),700,200);
                  g.drawString("/"+suma.obtenerDenominador(),720,200);
                  
                  if(suma.obtenerNumerador()/suma.obtenerDenominador()>=1){
                      g.setColor(Color.black);
                      g.fillRect(600,50,200,140);
                  }
                  int residuo = suma.obtenerNumerador() % suma.obtenerDenominador();
                  if(residuo != 0){
                        aux=150;
                        aux/=suma.obtenerDenominador();
                        aux3=aux*suma.obtenerDenominador();
                      g.setColor(Color.BLACK);
                      g.fillRect(800,50,aux3,140);
                      
                      for(int i=1;i<=suma.obtenerNumerador();++i){
                        g.setColor(Color.CYAN);
                       g.fillRect(600, 50, aux*i, 140);
                  }
                      
                      for(int i=1;i<=2*suma.obtenerDenominador();++i){
                      g.setColor(Color.red);
                      if(i==suma.obtenerDenominador()){
                          g.setColor(Color.green);
                      }
                      //Línea de otro color y más larga para denotar que se cambia de "unidad"
                      g.drawLine(600+aux*i,50,600+aux*i,190); 
                      if(i==suma.obtenerDenominador()){
                          g.drawLine(600+aux*i,40,600+aux*i,200); 
                      }
                      
                      
                      x=i;
                      }
                      
                  }
                  g.setColor(new Color(238,238,238));
                      g.fillRect(600+x*aux,50 ,1000, 140);
                  
                  
                  
                  
                  
		  
    }
    
    public DibujaFraccion(Fraccion f1, Fraccion f2){
        setSize(300,300);
        setVisible(true);
        this.fr1=f1;
        this.fr2=f2;
    }
    
    
}
