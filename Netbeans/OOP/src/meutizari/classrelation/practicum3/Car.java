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
public class Car {
    private String code;
    private Chair[] arrChair;

    public void setCode(String code) {
        this.code = code;
    }

    public void setPass(Passenger passenger, int number) {
        if(arrChair[number] != null){
            System.out.println("You can't occupy");
        }
        this.arrChair[number - 1].setPass(passenger);
    }

    public String getCode() {
        return code;
    }

    public Chair[] getArrChair() {
        return arrChair;
    }

    private void initChair(){
        for(int i=0;i<arrChair.length; i++){
            this.arrChair[i] = new Chair(String.valueOf(i+1));
        }
    }
    
    public Car(String code, int amount) {
        this.code = code;
        this.arrChair = new Chair[amount];
        this.initChair();
    }
    
    public String info(){
        String info= "";
        info += "Code : " + code + "\n";
        for(Chair chair : arrChair){
            info += chair.info();
        }
        return info;
    }
}
