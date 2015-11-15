/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;

/**
 *
 * @author carlos
 */
public class Alumno extends Persona{
    private final Asignatura array[];
    private int nOC;
    
    public Alumno(String name, String surName, String maidenName, int age) throws EdadException{
        super(name, surName, maidenName, age);
        array = new Asignatura[60];
        nOC = -1;
    }
    
    public void agregarAsignatura(Asignatura asignatura){
        if(asignatura != null){
            nOC++;
            array[nOC] = asignatura;
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int i=0; i<=nOC ;i++){
            str += array[i].toString()+"\n"+array[i].getResultado()+"\n\n";
        }
        return "Student name: "+name+"\nSur Name: "+surName+"\nMaiden Name: "+
                "Age: "+age+"\nClasses: \n"+str;
    }
}
