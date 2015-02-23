/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccionesgraficas;

/**
 *
 * @author Ernesto
 */
public class Fraccion {
    int denominador,numerador;
    
    public Fraccion(){
       
    }
    
    public Fraccion(int yNum,int xDen) throws FraccionNoValidaException{
        if(xDen<yNum){
            throw new FraccionNoValidaException();
        }else{
            this.denominador = xDen;
            this.numerador = yNum;
        }
        if(yNum==0){
            throw new ArithmeticException();
        }
        

    }
    
    public Fraccion sumar(Fraccion x){
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador*x.denominador + this.denominador*x.numerador;
        aux.denominador = this.denominador*x.denominador;
        
        aux.simplificar();
        return aux;
    }
    
    public Fraccion simplificar(){
        for(int i=2;i<81;++i){
            if(this.numerador % i == 0 && this.denominador % i == 0){
                this.numerador/=i;
                this.denominador/=i;
            }
        }
        return this;
    }
    
    public int obtenerDenominador(){
        return this.denominador;
    }
    
    public int obtenerNumerador(){
        return this.numerador;
    }
}
