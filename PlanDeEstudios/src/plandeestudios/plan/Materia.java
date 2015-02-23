/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plandeestudios.plan;

import java.util.Objects;

/**
 *
 * @author Ernesto
 */
public class Materia {
    String nombre;
    String ejeFormativo;
    String creditos;

    public Materia() {
        this.nombre = "";
        this.ejeFormativo = "";
        this.creditos = "";
    }

    public Materia(String nombre, String ejeFormativo,String creditos) {
        this.nombre = nombre;
        this.ejeFormativo = ejeFormativo;
        this.creditos = creditos;
    }

    public String getCreditos(){
        return creditos;
    }
    
    public void setCreditos(String creditos){
        this.creditos = creditos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEjeFormativo() {
        return ejeFormativo;
    }

    public void setEjeFormativo(String descripcion) {
        this.ejeFormativo = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    //interpretacion escrita del objeto
    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", eje formativo=" + ejeFormativo + '}';
    }
    
    
    
    public String obtenerDatos(){
        
        
        return null;
    }
}
