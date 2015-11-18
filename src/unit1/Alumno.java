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
public class Alumno extends Persona {

    protected final Asignatura array[];
    private int nOC;

    public Alumno(String name, String surName, String maidenName, int age) throws EdadException {
        super(name, surName, maidenName, age);
        array = new Asignatura[60];
        nOC = -1;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        boolean repited = false;
        if (asignatura != null) {

            for (int i = 0; i <= nOC; i++) {
                if (array[i].getName().equals(asignatura.getName())) {
                    repited = true;
                    break;
                }
            }
            
            if (!repited) {
                nOC++;
                array[nOC] = asignatura;
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        int avg = 0;
        for (int i = 0; i <= nOC; i++) {
            str += array[i].toString() + "\n" + array[i].getResultado();
            avg += array[i].getNote();
            if(i <= nOC){
                str +="\n";
            }
        }
        avg = avg/(nOC+1);
        return "Student: " + name +" "+surName +" "+maidenName
                + "\nAge: " + age + "\nClasses: \n\n" + str+"\nAverage: "+avg+"\n\n";
    }
}
