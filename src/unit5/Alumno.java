/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

/**
 *
 * @author carlos
 */
public class Alumno implements Comparable{
    private String nombre;
    private int semestre;
    private double promedio;
    protected static int cantAlumnos;
    
    public Alumno(String nombre, int semestre){
        this.nombre = nombre;
        this.semestre = semestre;
        cantAlumnos++;
    }
    
    public Alumno(String nombre, int semestre, double promedio){
        this.nombre = nombre;
        this.semestre = semestre;
        this.promedio = promedio;
        cantAlumnos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob != null){
            if(ob instanceof Alumno){
                Alumno other = (Alumno)ob;
                if(nombre.equals(other.nombre) && semestre == other.semestre){
                    return true;
                }
            }
        }
        return false;
        
    }
    
    @Override
    public int compareTo(Object ob){
        if(ob != null){
            if(ob instanceof Alumno){
                Alumno other = (Alumno)ob;
                if(semestre < other.semestre){
                    return -1;
                } else if(semestre > other.semestre){
                    return 1;
                } else{
                    return 0;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    
}
