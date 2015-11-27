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
public class Subject implements Comparable{
    private String name;
    private int hour;
    private int studentsAmount;
    
    public Subject(String name, int hour){
        this.name= name;
        this.hour = hour;
    }
    
    public Subject(String name, int hour, int studentsAmount){
        this.name = name;
        this.hour = hour;
        this.studentsAmount = studentsAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", hour=" + hour + ", studentsAmount=" + studentsAmount + '}';
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob != null){
            if(ob instanceof Subject){
                Subject other = (Subject)ob;
                if(name.equals(other.name) && hour == other.hour){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Orders the subjects by hour
     * @param o 
     * @return a positive value if the object that calls the class
     */
    @Override
    public int compareTo(Object o) {
        if(o != null){
            if(o instanceof Subject){
                Subject other = (Subject)o;
                
                if(hour>other.hour){
                    return 1;
                } else if(hour<other.hour){
                    return -1;
                } else{
                    return 0;
                }
                
            }
        }
        throw new IllegalArgumentException();
    }
}
