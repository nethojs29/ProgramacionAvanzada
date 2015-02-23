/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author Jesús Ernesto Jaramillo Salazar
 */
public class NumeroEntero extends NumeroNatural{
    public int MINIMO = Integer.MIN_VALUE;
    
    public NumeroEntero(){
        this.valor = (int)Math.random()*(MAXIMO-MINIMO+1)+MINIMO;
    }
    public NumeroEntero(int n){
        this();
        if(n>=MINIMO && n<=MAXIMO){
            this.valor = n;
        }
    }
    public NumeroEntero(String n){
        this(Integer.parseInt(n));
    }
    public NumeroEntero(NumeroEntero n){
        this(n.obtenerValor());
    }
    public NumeroEntero(NumeroNatural n){
        this(n.obtenerValor());
    }
    public static NumeroEntero sumar(NumeroEntero x,NumeroEntero y){
        if(x.obtenerValor()/2+y.obtenerValor()/2>=x.MINIMO/2 && x.obtenerValor()/2+y.obtenerValor()/2<=x.MAXIMO/2){
            NumeroEntero aux = new NumeroEntero(x.obtenerValor()+y.obtenerValor());
            return aux;
        }else{
            return null;
        }
    }
     public static NumeroEntero restar(NumeroEntero x,NumeroEntero y){
        if(x.obtenerValor()/2-y.obtenerValor()/2>=x.MINIMO/2 && x.obtenerValor()/2-y.obtenerValor()/2<=x.MAXIMO/2){
            NumeroEntero aux = new NumeroEntero(x.obtenerValor()-y.obtenerValor());
            return aux;
        }else{
            return null;
        }
    }
    public static NumeroEntero multiplicar(NumeroEntero x, NumeroEntero y){
        if(sumasSucesivas(x.obtenerValor(),y.obtenerValor())>=x.MINIMO&& sumasSucesivas(x.obtenerValor(),y.obtenerValor())<x.MAXIMO){
            NumeroEntero aux = new NumeroEntero(sumasSucesivas(x.obtenerValor(),y.obtenerValor()));
            return aux;
        }else{
            return null;
        }
    }
    public static NumeroEntero dividir(NumeroEntero x, NumeroEntero y){
        if(x.obtenerValor()/y.obtenerValor()>=x.MINIMO && x.obtenerValor()/y.obtenerValor()<=x.MAXIMO){
            NumeroEntero aux = new NumeroEntero((int)(x.obtenerValor()/y.obtenerValor()));
            return aux;
        }else{
            return null;
        }
    }
}
