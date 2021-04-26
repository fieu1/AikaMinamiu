/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class employee {
    String name, address;
    member mb = new member();
    
    public void inputEmployee(String nm, String adrs) {
        name = nm;
        address = adrs;
    }

    public void borrowed(int amount) {
        mb.borrowed(amount);
        System.out.println(mb.name);
    }

    public void returned(int amount) {
        mb.returned(amount);
        System.out.println(mb.name);
    }

    public void showStatus() {
        System.out.println("Receipt ");
        System.out.println("Employee");
        System.out.println("Name : " + name);        
    }
}
