/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory12.Exercise2;

/**
 *
 * @author Aikacchii
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        String model;
        int volt;
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: "
                    + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase televisi : "
                    + ((TelevisiJadul) perangkat).getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi jadul dengan input: "
                    + ((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase televisi : "
                    + ((TelevisiModern) perangkat).getVoltase());
        }
    }
}
