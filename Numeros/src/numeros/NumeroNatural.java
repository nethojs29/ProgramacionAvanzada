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
public class NumeroNatural {
    protected int valor;
    public int MAXIMO = Integer.MAX_VALUE;
    
    public NumeroNatural(){
        this.valor = (int)Math.random()*MAXIMO+1;
    }
    
    public NumeroNatural(int n){
            this();
            if(n<=MAXIMO)
                this.valor = n;        
    }
    public NumeroNatural(String n){
        this(Integer.parseInt(n));
    }
    
    public NumeroNatural(NumeroNatural n){
        this.valor = n.obtenerValor();
    }
    
    public int obtenerValor(){
        return this.valor;
    }
    
    public static NumeroNatural sumar(NumeroNatural x,NumeroNatural y){
        if(x.obtenerValor()+y.obtenerValor()>0 && x.obtenerValor()+y.obtenerValor()<=x.MAXIMO){
            NumeroNatural aux = new NumeroNatural(x.obtenerValor()+y.obtenerValor());
            return aux;
        }else{
            return null;
        }
    }
    public static NumeroNatural restar(NumeroNatural x,NumeroNatural y){
        if(x.obtenerValor()-y.obtenerValor()>=0 && x.obtenerValor()-y.obtenerValor()<=x.MAXIMO){
            NumeroNatural aux = new NumeroNatural(x.obtenerValor()-y.obtenerValor());
            return aux;
        }else{
            return null;
        }
    }
    public static NumeroNatural multiplicar(NumeroNatural x, NumeroNatural y){
        if(x.obtenerValor()>=y.obtenerValor())
            if(sumasSucesivas(x.obtenerValor(),y.obtenerValor())<x.MAXIMO){
                NumeroNatural aux = new NumeroNatural(sumasSucesivas(x.obtenerValor(),y.obtenerValor()));
                return aux;
            }else{
                return null;
            }
        else 
            if(sumasSucesivas(y.obtenerValor(),x.obtenerValor())<x.MAXIMO){
                NumeroNatural aux = new NumeroNatural(sumasSucesivas(y.obtenerValor(),x.obtenerValor()));
                return aux;
            }else{
                return null;
            }
    }
    public static NumeroNatural dividir(NumeroNatural x, NumeroNatural y){
        if(x.obtenerValor()/y.obtenerValor()>0 && x.obtenerValor()/y.obtenerValor()<=x.MAXIMO){
            NumeroNatural aux = new NumeroNatural((int)(x.obtenerValor()/y.obtenerValor()));
            return aux;
        }else{
            return null;
        }
    }
    
    public static int sumasSucesivas(int x, int y){
        
        if(x<0 && y<0){
            x*=-1;
            y*=-1;
        }
        
        int suma=0;
        for(int i=0;i<x;++i){
            suma+=y;
            if(suma<0){
                return Integer.MAX_VALUE;
            }
        }
        
        return suma;
    }
}
