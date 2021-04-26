/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Aikacchii
 */
public class MainRenter {
    public static void main(String[] args) {
        renter rt = new renter();
        rt.id = 101;
        rt.memberName = "Saif Sulthon";
        rt.gameName = "Dark Souls";
        rt.paying(7500, 10);
        rt.showData();
    }
}
