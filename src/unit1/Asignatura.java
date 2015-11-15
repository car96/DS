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
    
    public Asignatura(String name, int note){
        this.name = name;
        this.note = note;
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
    public String toString(){
        return "Name of the class: "+name+"\nNote: "+note;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob instanceof Asignatura){
            if(((Asignatura) ob).name.equals(name)){
                if(((Asignatura) ob).note == note){
                    return true;
                }
            }
        }
        return false;
    }
    
    public String getResultado(){
        if(note>=70){
            return "Approved";
        }
        return "Failed";
    }
    
}