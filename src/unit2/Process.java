/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author carlos
 */
public class Process {
    private int duration, sTime, rTime, fTime;
    private String name;
    
    public Process(int duration, int sTime, String name){
        this.duration = duration;
        this.sTime = sTime;
        this.name = name;
        rTime = duration;
        fTime = 0;
    }

    public int getDuration() {
        return duration;
    }

    public int getsTime() {
        return sTime;
    }

    public int getrTime() {
        return rTime;
    }

    public void setrTime(int rTime) {
        this.rTime = rTime;
    }

    public String getName() {
        return name;
    }

    public int getfTime() {
        return fTime;
    }

    public void setfTime(int fTime) {
        this.fTime = fTime;
    }

    @Override
    public String toString() {
        return "Process{" + "duration=" + duration + ", sTime=" + sTime + ", rTime=" + rTime + ", fTime=" + fTime + ", name=" + name + '}';
    }
    
    
    
}
