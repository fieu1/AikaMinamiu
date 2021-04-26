/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class MainLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList data = new LinkedList();
        int menuCh;
        int repeat = 0;

        do {
            Menu();
            menuCh = sc.nextInt();
            switch (menuCh) {

                case 1:
                    SubMenuAdd();
                    int subA = sc.nextInt();
                    if (subA == 1) {
                        System.out.print("Input data to add first : ");
                        int addfirst = sc.nextInt();
                        data.addFirst(addfirst);
                    } else if (subA == 2) {
                        System.out.print("Input data to add : ");
                        int add = sc.nextInt();
                        System.out.print("Input index of data : ");
                        int index = sc.nextInt();
                        data.addByValue(add, index);
                    } else if (subA == 3) {
                        System.out.print("Input data to add in last index : ");
                        int addlast = sc.nextInt();
                        data.addLast(addlast);
                    }
                    break;
                case 2:
                    SubMenuDelete();
                    int subB = sc.nextInt();
                    if (subB == 1) {
                        System.out.print("Input index of data  : ");
                        int delIdx = sc.nextInt();
                        try {
                            data.remove(delIdx);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (subB == 2) {
                        System.out.print("Input data to remove : ");
                        int remove = sc.nextInt();
                        data.removeByValue(remove);
                    } else if (subB == 3) {
                        data.clear();
                    }
                    break;
                case 3:
                    SubMenuSearch();
                    int subC = sc.nextInt();
                    if (subC == 1) {
                        System.out.print("Input index of data  : ");
                        int srcIdx = sc.nextInt();
                        try {
                            int keyIdx = data.searchByIndex(srcIdx);
                            System.out.println("The key at the index is " + keyIdx);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (subC == 2) {
                        System.out.print("Input data to search : ");
                        int key = sc.nextInt();
                        try {
                            int idxKey = data.searchByKey(key);
                            System.out.println("The key located in " + idxKey);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    data.print();
                    break;
                case 5:
                    System.out.println("Thankyou!");
                    break;
            }
        } while (menuCh == 1 || menuCh == 2 || menuCh == 3 || menuCh == 4);

    }

    public static void Menu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        System.out.println("---------------------------");
    }

    public static void SubMenuAdd() {
        System.out.println("1. First");
        System.out.println("2. Index");
        System.out.println("3. Last");
        System.out.println("---------------------------");
    }

    public static void SubMenuDelete() {
        System.out.println("1. Index");
        System.out.println("2. Key");
        System.out.println("3. Clear");
        System.out.println("---------------------------");
    }

    public static void SubMenuSearch() {
        System.out.println("1. Index");
        System.out.println("2. Key");
        System.out.println("---------------------------");
    }
}
