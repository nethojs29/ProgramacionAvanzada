/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccionesgraficas;


import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author Ernesto
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws fraccionesgraficas.FraccionNoValidaException
     */
    public static void main(String[] args) throws FraccionNoValidaException {
        int den1,num1,den2,num2;
        boolean sePudo=true;
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        do{
            sePudo = true;
            try{
                den1=(int)(Math.random()*(9)+1);
                num1=(int)(Math.random()*(9)+1);
                den2=(int)(Math.random()*(9)+1);
                num2=(int)(Math.random()*(9)+1);

                f1 = new Fraccion(num1,den1);
                f2 = new Fraccion(num2,den2);
            }catch(FraccionNoValidaException fnve){
                sePudo = false;
            }catch(ArithmeticException ae){
                sePudo = false;
            }catch(Exception e){
                sePudo = false;
            }
        }while(!sePudo);
        f1.simplificar();
        f2.simplificar();
        DibujaFraccion df;
        df = new DibujaFraccion(f1,f2);
        
        
        JFrame jf1 = new JFrame();
        jf1.getContentPane().add(df);
        jf1.setVisible(true);
        jf1.setSize(1000,600);
        jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
