/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class TicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner for input
        
        TicketList list = new TicketList(); //instantiation an object
        String planeList[] = {"BATIK AIRLINES", "SRIWIJAYA AIR", "GARUDA INDONESIA", "CITILINK", "LION AIR", "WINGS AIR"}; //name of plane array
        String time[] = {"07.00-10.30", "09.00-11.00","12.00-14.00","15.30-16.45","17.00-19.15","19.50-21.40"}; //time array
        int price[] = {1190000,1250000,890000,1100000,950000,750000}; //price array
        
        for(int i=0;i<planeList.length;i++){ //looping for input value of array
            Ticketing ticket = new Ticketing(planeList[i], time[i], price[i]); //instantiation new object and add the value
            list.add(ticket); //calling add method in object list
        }
        System.out.println("Ticketing list before sorting"); //label output
        list.print(); //calling print method in object list
        System.out.println("Ticket list after sorting descending with Bubble Sort ="); //label output
        list.bubbleSort(); //call bubble sort method for sort array
        list.print(); //calling print method in object list
        
        System.out.println("Ticket list after sorting ascending with Selection Sort ="); //label output
        list.selectionSort(); //call selection sort method for sort array
        list.print(); //calling print method in object list
    }
}
