/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet14;
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class BinaryTreeMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int choice;
        do{
            Menu();
            System.out.print("> " );
            choice = sc.nextInt(); //choosing menu
            if(choice == 1){ //if choosing add menu
                System.out.print("Input data to add : ");
                int add = sc.nextInt(); //input value
                bt.add(add); //call method
            } else if(choice == 2){ //if choosing delete menu
                System.out.print("Input data to delete : ");  
                int delete = sc.nextInt(); //input value
                bt.delete(delete); //call method
            } else if(choice == 3){ //if choosing find menu
                System.out.println("Input data to search : ");
                int search = sc.nextInt(); //input value
                bt.find(search); //call method
                System.out.println("Find " + search + " " + bt.find(search));
                //display
            } else if(choice == 4){ //traverse inorder menu
                bt.traverseInOrder(bt.root); //call method with node parameter
            } else if(choice == 5){ //traverse preorder menu
                bt.traversePreOrder(bt.root); //call method with node parameter
            } else if(choice == 6){ //traverse postorder meneu
                bt.traversePostOrder(bt.root); //call method with node parameter
            } else { //exit
                System.out.println("Thankyou"); //display
            }
        } while(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6);
        //range to iteration
    }
     
     public static void Menu() {
        System.out.println("TREE WITH MENU");
        System.out.println("======================================");
        System.out.println("Select menu : ");
        System.out.println("1. Add ");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Traverse preOrder");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Exit");
        System.out.println("======================================");
    }
}
