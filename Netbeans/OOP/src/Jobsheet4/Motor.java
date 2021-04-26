/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4;

/**
 *
 * @author Aikacchii
 */
public class Motor {
    private int kecepatan = 90;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(kontakOn == true && kecepatan < 100){
            kecepatan += 5;
        } else if(kecepatan >= 100){
            System.out.println("Can't add speed");  
        } else {
            System.out.println("Can't add speed cause the machine is still off! \n");
        }
    }
    public void kurangKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        } else {
            System.out.println("Can't add speed cause the machine is still off! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
