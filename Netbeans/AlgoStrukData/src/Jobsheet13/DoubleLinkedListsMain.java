/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet13;     
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class DoubleLinkedListsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int choose = 0;
        do {
            Menu();
            System.out.print(">> ");
            choose = sc.nextInt();
            System.out.println("======================================");
            switch (choose) { //choose condition
                case 1: //if 1
                    System.out.print("Input name : ");
                    String addNmF = sc.next();
                    System.out.print("Input grade : ");
                    int addGF = sc.nextInt(); //input first data
                    dll.addFirst(addNmF,addGF); //call method
                    break; //break
                case 2: //if 2
                    System.out.print("Input name : ");
                    String addN = sc.next();
                    System.out.print("Input grade : ");
                    int addL = sc.nextInt(); //input last data
                    dll.addLast(addN, addL); //call method
                    break; //break
                case 3: //if 3
                    System.out.print("Input name : ");
                    String addM = sc.next(); //input data to add
                    System.out.print("Input grade : ");
                    int addg = sc.nextInt();
                    System.out.println("Input index position of data : ");
                    int idx = sc.nextInt(); //input index
                    try { //try catch
                        dll.add(addM, addg, idx); //call method
                    } catch (Exception e) { //if error
                        e.getMessage(); //show message
                    }
                    break; //break
                case 4: //if 4
                    try { //try catch
                    dll.removeFirst(); //call method
                } catch (Exception e) { //if error
                    e.getMessage(); //show message
                }
                break; //break
                case 5: //if 5
                    try { //try catch
                    dll.removeLast(); //call method
                } catch (Exception e) { //if error
                    e.getMessage(); //show message
                }
                break; //break
                case 6: //if 6
                    System.out.print("Input index of data to remove : ");
                    int remIdx = sc.nextInt(); //input index
                    try { //try catch
                        dll.remove(remIdx); //call method
                    } catch (Exception e) { // if error
                        e.getMessage();  //show message
                    }
                    break; //break
                case 7: //if 7
                    dll.print(); //call method
                    break; //break
                case 8: //if 8
                    System.out.print("Input name to search : ");
                    String src = sc.next(); //input search data
                    try { //try catch
                        dll.searchByKey(src); //call method
                    } catch (Exception e) { //if error
                        e.getMessage(); //show message
                    }
                    break; //break
                case 9: //if 9
                    dll.insertionSort(); //call method
                break; //break
                case 10: //if 10
                    System.out.println("THANKYOU");
                    System.out.println("======================================");
                    break; //break
            }
        } while (choose == 1 || choose == 2 || choose == 3 || choose == 4 || choose == 5 || choose == 6 || choose == 7 || choose == 8 || choose == 9);
        //if choose 1 - 9
    }
    public static void Menu() {
        System.out.println("DOUBLE LINK LIST WITH MENU");
        System.out.println("======================================");
        System.out.println("Select menu : ");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Add With Certain Index");
        System.out.println("4. Delete First");
        System.out.println("5. Delete Last");
        System.out.println("6. Delete With Certain Index");
        System.out.println("7. Print");
        System.out.println("8. Search");
        System.out.println("9. Sort");
        System.out.println("10. Exit");
        System.out.println("======================================");
    }
}
