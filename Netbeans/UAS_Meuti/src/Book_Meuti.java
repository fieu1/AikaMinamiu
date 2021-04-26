/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class Book_Meuti {

    Node sorted;

//    void sortedInsert(Node newnode, Node head) {
//        sorted = head;
//        if (sorted == null || sorted.title.charAt(0) >= newnode.title.charAt(0)) {
//            if (newnode.title.charAt(0) == sorted.title.charAt(0)) {
//                if (sorted.title.charAt(1) > newnode.title.charAt(1)) {
//                    newnode.next = sorted;
//                    sorted = newnode;
//                }
//            }
//            newnode.next = sorted;
//            sorted = newnode;
//        } else {
//            Node current = sorted;
//
//            while (current.next != null && current.next.title.charAt(0) < newnode.title.charAt(0)) {
//                current = current.next;
//            }
//            newnode.next = current.next;
//            current.next = newnode;
//        }
//    }
    
    void availability(Node newNode){
        if(newNode.stock == 0){
            System.out.println("Stock : " + newNode.stock );
            System.out.println("Stock unavailable");
        } else {
            System.out.println("Stock available");
        }
    }
}
