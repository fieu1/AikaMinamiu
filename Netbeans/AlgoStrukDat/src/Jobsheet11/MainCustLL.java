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
public class MainCustLL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CustLinkedList data = new CustLinkedList();
        int menuCh;
        int repeat = 0;
        String accNm = "", name = "";
        System.out.println("+-------------------------------------+");
        System.out.println("|          Customer Database          |");
        System.out.println("+-------------------------------------+");
        do {
            Menu(); //menu function
            menuCh = sc.nextInt(); //input choice
            switch (menuCh) { //selection
                case 1:
                    SubMenuAdd(); //sub menu
                    int subA = sc.nextInt(); //input choosed sub menu
                    if (subA == 1) { //condition
                        System.out.println("Input data to add first : ");
                        System.out.print("Account Number : ");
                        accNm = sc.next();
                        System.out.print("Name : ");
                        name = sc.next();
                        data.addFirst(name, accNm);
                        //make new node with inputted data
                    } else if (subA == 2) { //condition
                        System.out.print("Account Number : ");
                        accNm = sc.next();
                        System.out.print("Name : ");
                        name = sc.next();
                        System.out.print("Input index of data : ");
                        int index = sc.nextInt();
                        data.add(name, accNm, index);
                        //make new node with inputted data and
                        //located in inputted index
                    } else if (subA == 3) { //condition
                        System.out.print("Account Number : ");
                        accNm = sc.next();
                        System.out.print("Name : ");
                        name = sc.next();
                        data.addLast(name, accNm);
                        //make new node in last of linked list
                    }
                    break; //end of menu 1
                case 2:
                    SubMenuDelete(); //submenu 2
                    int subB = sc.nextInt(); //input sub menu choice
                    if (subB == 1) { //condition
                        data.removeFirst(); //method for remove first index
                    } else if (subB == 2) { //condition
                        System.out.print("Input index of data  : ");
                        int delIdx = sc.nextInt(); //input index
                        try {  //when index is in range
                            data.remove(delIdx); //remove the data in index
                        } catch (Exception e) { //when error
                            System.out.println(e.getMessage());//show message
                        }
                    } else if (subB == 3) { //condition
                        data.clear(); //clear data
                    }
                    break; //end of menu 2
                case 3:
                    SubMenuSearch();  //submenu 3
                    int subC = sc.nextInt(); //input choice
                    if (subC == 1) { //condition
                        System.out.print("Input index of data  : ");
                        int srcIdx = sc.nextInt(); //input index
                        try {
                            System.out.println("The student at the index is ");
                            data.searchByIndex(srcIdx);
                            //show data searched
                        } catch (Exception e) { //if index out of range
                            System.out.println(e.getMessage()); //show message
                        }

                    } else if (subC == 2) { //condition
                        System.out.print("Input account number to search : ");
                        String cstAcc = sc.next(); //input student ID
                        try {
                            int idxKey = data.searchByKey(cstAcc); //save index
                            System.out.println("The student located in " + idxKey);
                            //print
                        } catch (Exception e) {  //if error
                            System.out.println(e.getMessage()); //show message
                        }
                    }
                    break; //end of menu 3
                case 4:
                    data.print(); //call print method
                    break; //end of menu 4
                case 5:
                    System.out.println("+-------------------------------------+");
                    System.out.println("|              Thankyou!              |");
                    System.out.println("+-------------------------------------+"); //print
                    break; //end of program
            }
        } while (menuCh == 1 || menuCh == 2 || menuCh == 3 || menuCh == 4);
        //loop when condition is true
    }

    public static void Menu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        System.out.println("---------------------------------------");
    }

    public static void SubMenuAdd() {
        System.out.println("1. First");
        System.out.println("2. Index");
        System.out.println("3. Last");
        System.out.println("---------------------------------------");
    }

    public static void SubMenuDelete() {
        System.out.println("1. First");
        System.out.println("2. Index");
        System.out.println("3. Clear");
        System.out.println("---------------------------------------");
    }

    public static void SubMenuSearch() {
        System.out.println("1. Index");
        System.out.println("2. Account Number");
        System.out.println("---------------------------------------");
    }
}
