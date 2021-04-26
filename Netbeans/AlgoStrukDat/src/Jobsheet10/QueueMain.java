/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of queues : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        int select;
        
        do{
            menu();
            select = sc.nextInt();
            switch(select){
                case 1 :
                    System.out.println("Enter new data : ");
                    int dataEnter = sc.nextInt();
                    Q.Enqueue(dataEnter);
                    break;
                case 2 :
                    int dataRetrieve = Q.Dequeue();
                    if(dataRetrieve != 0){
                        System.out.println("Data retrieved : " + dataRetrieve);
                        break;
                    }
                case 3 :
                    Q.print();
                    break;
                case 4 :
                    Q.peek();
                    break;
                case 5 :
                    Q.peekRear();
                    break;
                case 6 : //if want to peek position of searched data
                    System.out.print("Input data to search : "); //display
                    int search = sc.nextInt(); //input variable
                    Q.peekPosition(search); //calling method
                    break; //break
                case 7 : //if want to peek data at the position that inputted
                    System.out.print("Input position : "); //display
                    int pos = sc.nextInt(); //input variable 
                    Q.peekAt(pos); //calling method
                    break; //break
        }
        } while (select==1 || select== 2 || select== 3 || select== 4 || select== 5 || select== 6 || select== 7); 
        //if select is bigger than 0 and less or same with 7
    }
    
    public static void menu(){
        System.out.println("");
        System.out.println("Options Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("--------------------------");
    }
}
