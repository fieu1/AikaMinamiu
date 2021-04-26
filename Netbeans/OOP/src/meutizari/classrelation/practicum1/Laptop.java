/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum1;

/**
 *
 * @author Aikacchii
 */
public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    
    public void setProc(Processor newProc){
        proc = newProc;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public Processor getProc(){
        return proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
