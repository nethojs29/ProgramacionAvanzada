/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas.guis;

import figurasgeometricas.figuras.Figura;
import figurasgeometricas.figuras.Linea;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Ernesto
 */
public class MenuPanel extends JPanel {
    
    Color color;
    int grosor;
    Point pInicial, pFinal;
    protected Figura figura;
    String[] opciones = {"Rojo","Azul","Verde","Amarillo","Morado","Rosa"};
    CheckboxGroup Radio = new CheckboxGroup();
    JComboBox lista = new JComboBox(opciones);
    SpinnerModel model1 = new SpinnerNumberModel();
    JSpinner spinner1 = new JSpinner(model1);
    JRadioButton linea = new JRadioButton("Linea");
    JRadioButton rect = new JRadioButton("Rectangulo");
    JRadioButton oval = new JRadioButton("Ovalo");
    
    public MenuPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        TitledBorder title;
        title = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Menu");
        title.setTitleJustification(TitledBorder.CENTER);
        this.setBorder(title);
        
        

        add(linea);
        add(rect);
        add(oval);

        
        this.add(lista);
        
        
        this.add("Grosor lineas", spinner1);    
    }
    
    public Figura crear(Point x,Point y){
        this.grosor = obtenerGrosor();
        this.color = this.obtenerColor();
        if("linea" == this.obtenerFigura()){
            figura = new Linea(color,x,y,grosor);
        }
        return figura;
    }
    
    public int obtenerGrosor(){
        return (int)spinner1.getValue();
    }
    
    public Color obtenerColor(){
        switch(lista.getSelectedIndex()){
            case 0:
               color = Color.BLUE;
            break;
            case 1:
                color = Color.RED;
            break;
            case 2:
                color = Color.GREEN;
            break;
            case 3:
                color = Color.YELLOW;
            break;
            case 4:
                color = Color.PINK;
            break;
            case 5:
                color = Color.GRAY;
            break;
        }
        return color;
    }
    
    public int obtenerIndiceColor(){
        return lista.getSelectedIndex();
    }
    
    public String obtenerFigura(){
        String figura="";
        if(rect.isSelected()){
            figura = "rectangulo";
        }else 
            if(oval.isSelected()){
            figura = "ovalo";
            }else{
                figura = "linea";
            }
        return figura;
    }
}
