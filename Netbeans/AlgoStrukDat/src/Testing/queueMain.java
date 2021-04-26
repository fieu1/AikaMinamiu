/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;
import java.util.Scanner;
public class queueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        System.out.print("Input length queue = ");
        int length=sc2.nextInt();
        queue Q = new queue(length);
        customer data = new customer();
        int indicator=0;
        do{
            menu();
            System.out.print("Input menu : ");
            int menu=sc2.nextInt();
            if(menu==1){
                System.out.println("Input Account Number : ");
                data.accountNum=sc.nextLine();
                System.out.println("Input Customer name : ");
                data.name=sc.nextLine();
                Q.Enqueue(data);
            }else if(menu==2){
                System.out.println("Retrivied customer : ");
                data=Q.Dequeue();
                data.print();
            }else if(menu==3){
                Q.print();
            }else if(menu==4){
                Q.peek();
            }else if(menu==5){
                Q.peekRear();
            }else if(menu==6){
                System.out.print("Input account number you want to find : ");
                data.accountNum=sc.nextLine();
                System.out.print("Input name you want to find : ");
                data.name=sc.nextLine();
            }else if(menu==7){
                System.out.print("Input position data you want to find : ");
                int position=sc2.nextInt();
                Q.peekCustomer(position);
            }else{
                System.out.println("Your inputation invalid");
            }
        }while(indicator==0);
        System.out.println("Thank You for using our program");
    }
    
    public static void menu(){
        System.out.println("Option menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek Customer");
        System.out.println("----------------");
    }
}
