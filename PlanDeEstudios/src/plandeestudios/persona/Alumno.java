/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plandeestudios.persona;

/**
 *
 * @author Jesús Ernesto Jaramillo Salazar
 */
public class Alumno {
    private int edad;
    private String nombre;
    private String semestre;
    private int expediente;
    
    //Constructor por default
    public Alumno(){
        this.edad=0;
        this.nombre="";
        this.semestre="";
        this.expediente=0;
    }
    
    //por convenciÃ³n inicializa el objeto con el expediente.
    public Alumno(int expediente){
        this.expediente= expediente;
        this.edad=0;
        this.nombre="";
        this.semestre="";
    }
    
    //Por convenciÃ³n inicializa el objeto pidiendo todos los atributos.
    public Alumno(int edad, String nombre, String semestre, int expediente){
        this.edad=edad;
        this.nombre=nombre;
        this.semestre=semestre;
        this.expediente=expediente;
    }
    
    //MÃ©todos de acceso.
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }
    
    //MÃ©todo para distruinguir entre objetos de esta clase.
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.expediente;
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
        final Alumno other = (Alumno) obj;
        if (this.expediente != other.expediente) {
            return false;
        }
        return true;
    }
    
    //RepresentaciÃ³n de este objeto en cadena.
    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", nombre=" + nombre + ", semestre=" + semestre + ", expediente=" + expediente + '}';
    }
}
