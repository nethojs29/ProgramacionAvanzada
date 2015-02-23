/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios2;

import java.io.Serializable;

/**
 *
 * @author Ernesto
 */
class Caballo implements Serializable{
    String nombre;
    int altura,peso;
    boolean deRaza;
    
    public Caballo(String nombre, int altura, int peso, boolean deRaza){
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.deRaza = deRaza;
    }
}

