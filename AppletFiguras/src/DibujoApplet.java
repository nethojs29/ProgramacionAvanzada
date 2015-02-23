
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesús Ernesto Jaramillo Salazar
 */
public class DibujoApplet extends Applet{
    
    String opcion="";
    int numeroDeLineas=0;
    int grados=0;
    String[] opciones = {"Crear figura con n lineas","Crear figura personal basada en el poligono"};
    int ancho=0, alto=0;
    Color[] colores = {new Color(255,0,0),new Color(255,0,255), new Color(255,255,0),new Color(0,255,0),new Color(0,255,255),new Color(0,0,255)};
    
    
    @Override
    public void init(){
        opcion = (String) JOptionPane.showInputDialog(null, "¿Que opcion desea?", "", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        ancho = 600;//(int)(Math.random()*6+1)*100;
        alto = ancho;        
    }
    
    @Override
    public void start(){
        if(opcion.equals(opciones[0])){
            numeroDeLineas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas lineas formaran la figura? - Cuadrado de "+ancho+"x"+alto));
            numeroDeLineas/=2;
        }else{
            grados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos grados quiere rotar la figura - Cuadrado de "+ancho+"x"+alto));
        }
    }
    
    public void paint(Graphics g){
        g.drawString(""+numeroDeLineas*2+"",50,140);
        g.drawRect(100, 100, ancho, alto);
        
        if(opcion.equals(opciones[0])){
            //for(int i=2;i<=numeroDeLineas;++i){
                dibujarConLineas(g);
            //}
        }else{
            dibujarFiguraPersonal(g);
        }
    }
    
    public void dibujarConLineas(Graphics g){
        for(int j=1;j<=numeroDeLineas;++j){
            g.setColor(colores[j%colores.length]);
            g.drawLine(100, 100+alto, 100+j*ancho/numeroDeLineas, 100);
                }
        for(int k=1;k<numeroDeLineas;++k){
            g.setColor(colores[k%colores.length]);
            g.drawLine(100,100+alto,100+ancho,100+k*alto/numeroDeLineas);
        }
    }
    
    public void dibujarFiguraPersonal(Graphics g){
        //Figura sin rotar
        g.setColor(colores[(int)Math.random()*6+1]);
        int x = ancho/10;
        g.drawLine(100+6*x,100+1*x,100+5*x,100+2*x);
        g.drawLine(100+5*x,100+2*x,100+6*x,100+3*x);
        g.drawLine(100+6*x,100+3*x,100+4*x,100+4*x);
        g.drawLine(100+4*x,100+4*x,100+2*x,100+3*x);
        g.drawLine(100+2*x,100+3*x,100+3*x,100+1*x);
        g.drawLine(100+6*x,100+1*x,100+3*x,100+1*x);
        
        int y=((int)(x*Math.cos((grados)*Math.PI/180)))-((int)(x* Math.sin((grados)*Math.PI/180)));
        int z=((int)(x*Math.sin((grados)*Math.PI/180)))+((int)(x* Math.cos((grados)*Math.PI/180)));
        g.setColor(Color.BLACK);
        g.drawLine(100+6*x-z,100+6*x,100+5*x-y,100+7*z);
        g.drawLine(100+5*x-z,100+7*x,100+6*x-y,100+8*z);
        g.drawLine(100+6*x-z,100+9*x,100+4*x-y,100+9*z);
        g.drawLine(100+4*x-z,100+9*x,100+2*x-y,100+8*z);
        g.drawLine(100+2*x-z,100+8*x,100+3*x-y,100+6*z);
        g.drawLine(100+6*x-z,100+6*x,100+3*x-y,100+6*z);
        
        
    }
    
    
}
