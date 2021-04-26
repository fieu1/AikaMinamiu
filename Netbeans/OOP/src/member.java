/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class member {

    String name, address;
    int memberID;
    book bk;

    public void inputMember(String nm, String adrs, int mID) {
        name = nm;
        address = adrs;
        memberID = mID;
    }

    public void borrowed(int amount) {
        bk = new book();
        bk.borrowed(amount);
        System.out.println("Borrowed " + bk.title);
    }

    public void returned(int amount) {
        bk.returned(amount);
    }

    public void showStatus() {
        System.out.println("Member ID : " + memberID);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}
