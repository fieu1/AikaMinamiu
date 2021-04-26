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
public class Chair {
    private String number;
    private Passenger pass;

    public Chair(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPass(Passenger pass) {
        this.pass = pass;
    }

    public String getNumber() {
        return number;
    }

    public Passenger getPass() {
        return pass;
    }
    
    public String info(){
        String info= "";
        info += "Civilian ID : " + number + "\n";
        if(this.pass != null) info += "Passenger : " + pass.info() + "\n";
        return info;
    }

}
