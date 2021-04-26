/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum3;

/**
 *
 * @author Aikacchii
 */
public class Passenger {
    private String ktp;
    private String name;

    public Passenger(String ktp, String name) {
        this.ktp = ktp;
        this.name = name;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKtp() {
        return ktp;
    }

    public String getName() {
        return name;
    }
    
    public String info(){
        String info= "";
        info += "Civilian ID : " + ktp + "\n";
        info += "Name\t: " + name + "\n";
        return info;
    }
    
}
