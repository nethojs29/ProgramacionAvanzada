/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plandeestudios.persona;

import java.util.Objects;

/**
 *
 * @author Alumno-L202
 */
public class Profesor {
    private String nombre;
    private int numeroEmpleado;
    private String departamento;
    private String categoria;
    private String curp;

    //Constructor de default.
    public Profesor() {
        this.curp = "";
        this.nombre = "";
        this.numeroEmpleado = 0;
        this.departamento = "";
        this.categoria = "";
    }

    //por convenciÃ³n inicializa el objeto con el curp.
    public Profesor(String curp) {
        this.curp = curp;
        this.nombre = "";
        this.numeroEmpleado = 0;
        this.departamento = "";
        this.categoria = "";
    }

    //por convencion inicializa el objeto pidiendo todos los atributos.
    public Profesor(String nombre, int numeroEmpleado, String departamento, String categoria, String curp) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.categoria = categoria;
        this.curp = curp;
    }

    //Metodos de acceso.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    //Metodo para distruinguir entre objetos de esta clase.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.curp);
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
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.curp, other.curp)) {
            return false;
        }
        return true;
    }

    //Representacion de este objeto en cadena
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", numeroEmpleado=" + numeroEmpleado + ", departamento=" + departamento + ", categoria=" + categoria + ", curp=" + curp + '}';
    }   
}
