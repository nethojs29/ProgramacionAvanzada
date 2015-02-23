/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secante;

/**
 *
 * @author Ernesto
 */
public class Secante {
    
   public static double evaluar(double x){ 
      double a = Math.asin(x)-Math.exp(-2*x); 
      return a; 
   } 
   
   public static double secante(double x1, double x2, double error){
      double x3, fx1, fx2, fx3;
 
      //string que contendra lal tabla de valores
      String line = "";
 
      if ( Math.abs( evaluar( x1 ) ) < Math.abs( evaluar ( x2 ) ) ){
         double aux = x1;
         x1 = x2;
         x2 = aux;
      } 
 
      fx1 = evaluar( x1 ); 
      fx2 = evaluar( x2 ); 
 
      do{ 
         x3 = x2 - ( fx2 * ( x1 - x2 ) ) / ( fx1 - fx2 );
         fx3 = evaluar( x3 );
         line += x1 + " " + x2 + " " + x3 + " " + fx1 + " " + fx2 + " " + fx3 + "\n";
         x1 = x2;
         x2 = x3;
         fx1 = evaluar( x1 );
         fx2 = evaluar( x2 );
         fx3 = evaluar( x3 );
      } while ( Math.abs( fx3 ) > error );
      System.out.println( line ); 
      return x3; 
   }
    
    public static void main(String[] args) {
        double raiz = secante(0,1,0.00001);
        System.out.println("La raiz es: "+raiz);
    }
    
}
