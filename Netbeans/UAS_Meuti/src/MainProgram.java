
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Aikacchii
 */
public class MainProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int choose = 0;
        System.out.println("======================================");
        System.out.println("    Welcome to Meuti's Library");
        System.out.println("======================================");
        do {
            Menu();
            System.out.print(">> ");
            choose = sc.nextInt();
            System.out.println("======================================");
            switch (choose) {
                case 1:
                    System.out.print("Input title : ");
                    String ttlsrc = sc.next();
                    dll.available(ttlsrc);
                    break;
                case 2:
                    System.out.print("Input title : ");
                    String ttl = sc.next();
                    System.out.print("Input publisher : ");
                    String pb = sc.next();
                    System.out.print("Input code : ");
                    int cd = sc.nextInt();
                    System.out.print("Input stock : ");
                    int st = sc.nextInt();
                    try {
                        dll.add(ttl, cd, pb, st);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 3:
                    System.out.println("Input index position of book : ");
                    int indx = sc.nextInt();
                    try {
                        dll.searchByKeyBorrow(indx);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 4:
                    System.out.println("Input amount of broken book : ");
                    int broke = sc.nextInt();
                    System.out.println("Input index of broken book : ");
                    int index = sc.nextInt();
                    try {
                        dll.addBroken(broke, index);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 5: 
                    try {
                    dll.print();
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
                case 6:
                    System.out.print("Input title of book : ");
                    String ttltosrc = sc.next();
                    try {
                        dll.searchBook(ttltosrc);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 7:
                    System.out.print("Input title of book : ");
                    String ttltosr = sc.next();
                    System.out.print("Input publisher of book : ");
                    String pbs = sc.next();
                    try {
                        dll.search(ttltosr, pbs);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 8:
                    dll.insertionSort();
                    break;
                case 9:
                    System.out.println("THANKYOU");
                    System.out.println("======================================");
                    break;
            }
        } while (choose == 1 || choose == 2 || choose == 3 || choose == 4 || choose == 5 || choose == 6 || choose == 7 || choose == 8);
    }

    public static void Menu() {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("MEUTI ZARI - 1H LIBRARY");
        System.out.println("======================================");
        System.out.println("Select menu : ");
        System.out.println("1. Book Availability");
        System.out.println("2. Book Entered");
        System.out.println("3. Book Out");
        System.out.println("4. Broken Book");
        System.out.println("5. Show All Data");
        System.out.println("6. Book Search by title");
        System.out.println("7. Book Search by title and publisher");
        System.out.println("8. Sort");
        System.out.println("9. Exit");
        System.out.println("======================================");
    }
}
