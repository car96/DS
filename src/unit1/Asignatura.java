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
public class Asignatura {

    private String name;
    private int note;

    public Asignatura(String name, int note) throws NumberFormatException{
        this.name = name;
        if (note >= 0 && note <= 100) {
            this.note = note;
        }
        else{
            throw new NumberFormatException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Name of the class: " + name + "\nNote: " + note;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob instanceof Asignatura) {
            if (((Asignatura) ob).name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String getResultado() {
        if (note >= 70) {
            return "Approved";
        }
        return "Failed";
    }

}
