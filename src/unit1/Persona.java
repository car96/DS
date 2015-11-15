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
public class Persona {

    protected String name, surName, maidenName;
    protected int age;

    public Persona(String name, String surName, String maidenName, int age) throws EdadException{
        this.name = name;
        this.surName = surName;
        this.maidenName = maidenName;
        if (age >= 1 && age <= 100) {
            this.age = age;
        }
        else{
            throw new EdadException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name: "+name+"\nSur Name: "+surName+"\nMaiden Name: "+maidenName+"\nAge: "+age;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob instanceof Persona){
            if(((Persona) ob).name.equals(name)){
                if(((Persona) ob).maidenName.equals(maidenName)){
                    if(((Persona) ob).surName.equals(surName)){
                        if(((Persona) ob).age == age){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
