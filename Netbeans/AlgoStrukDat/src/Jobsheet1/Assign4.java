/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;
import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class Assign4 {

    //scanner for interger
    static Scanner sc = new Scanner(System.in);
    //scanner for string
    static Scanner scs = new Scanner(System.in);
    static double area;

    public static void main(String[] args) {
        //welcome message
        System.out.println("WELCOME TO CALCULATING PROGRAM");
        Menu(); //call menu function
    }

    static void Menu() {
        System.out.println("1. Triangle");
        System.out.println("2. Quadrilateral");
        System.out.println("3. Circle");
        System.out.print("Choose what did you want to calculate :");
        int choose = sc.nextInt();
        //selection to choose menu base on "choose" interger input
        switch (choose) {
            case 1: //condition when user input "1"
                Triangle(); //call triangle function to calculate area of triangle
                break; //end the program
            case 2: //condition when user input "2"
                Quadrilateral(); //call quadrilateral function to calculate area of rectangle, etc.
                break; //end the program
            case 3: //condition when user input "3"
                Circle(); //call circle function to calculate area of circle
                break; //end the program
            //used when user inputing incorrectly
            default:
                System.out.println("Your input is wrong, try again");
                Menu(); //loop to menu function
        }
    }

    static void Triangle() {
        System.out.print("Input heigth of triangle : ");
        int heigth = sc.nextInt(); //triangle's heigth
        System.out.print("Input pedestal of triangle : ");
        int base = sc.nextInt(); //triangle's pedestal
        area = heigth * base * 0.5; // formula for triangle area
        System.out.println("The area of triangle is " + area); //output
        System.out.println("");
        Repeat(); //if user want to calculate again
        
    }

    static void Quadrilateral() {

        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Rhombus");
        System.out.println("4. Kite");
        System.out.println("5. Pararellogram");
        System.out.println("6. Trapezoidal");
        System.out.println("--Choose 7 if you want to back to menu--");
        System.out.print("Choose quadrilateral : ");
        int choose2 = sc.nextInt();

        switch (choose2) { //function from choose2 input  
            case 1: //when user inputting "1"
                System.out.print("Input square side : ");
                int side = sc.nextInt(); //side of square
                area = side * side; //square formula
                System.out.println("The area of square is " + area); //output
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 2:
                System.out.print("Input rectangle length : "); 
                int length = sc.nextInt(); //length of rectangle
                System.out.print("Input rectangle width : ");
                int width = sc.nextInt(); //width of rectangle
                area = length * width; //rectangle formula 
                System.out.println("The area of rectangle is " + area); //output
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 3:
                System.out.print("Input diagonal 1 : ");
                int dia1 = sc.nextInt(); //diagonal of rhombus
                System.out.print("Input diagonal 2 : ");
                int dia2 = sc.nextInt(); //diagonal of rhombus
                area = dia1 * dia2 * 0.5; //rhombus formula
                System.out.println("The area of rhombus is " + area); //output
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 4:
                System.out.print("Input diagonal 1 : ");
                dia1 = sc.nextInt(); //diagonal of kite
                System.out.print("Input diagonal 2 : ");
                dia2 = sc.nextInt(); //diagonal of kite
                area = dia1 * dia2 * 0.5; //kite formula
                System.out.println("The area of kite is " + area); //output
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 5:
                System.out.print("Input pedestal : ");
                int pedestal = sc.nextInt(); //parallelogram diagonal
                System.out.print("Input heigth : ");
                int heigth = sc.nextInt(); //parallelogram diagonal
                area = pedestal * heigth; //parallelogram formula
                System.out.println("The area of parallelogram is " + area); //output
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 6:
                System.out.print("Input top side : ");
                int top = sc.nextInt(); //top side of trapezoidal
                System.out.print("Input bottom side : ");
                int bottom = sc.nextInt(); //bottom side of trapezoidal
                System.out.print("Input heigth : ");
                heigth = sc.nextInt(); // heigth of trapezoidal
                area = (top + bottom) * heigth;
                System.out.println("The area of trapezoidal is " + area);
                System.out.println("");
                Repeat(); //if user want to calculate again
                break; //end the program
            case 7:
                Menu(); //if user give the false input, they can back to menu
                break; //end the program
            default: //when user have false input 
                System.out.println("Your input is false, try again");
                Quadrilateral(); //return to quadrilateral function
                break; //end the program
        }
    }

    static void Circle() {
        System.out.print("Input radius of circle : ");
        int radius = sc.nextInt(); //circle radius
        int phi = 22 / 7; //phi for calculate circle
        area = phi * radius * radius; //circle formula
        System.out.println("Area of circle is " + area); //output
        System.out.println("");
        Repeat();//if user want to calculate again
    }

    static void Repeat() {
        //used to calculating in many times
        System.out.println("Did you want to calculate again? (y/n)");
        String choose3 = scs.nextLine();
        if (choose3.equalsIgnoreCase("y")) { //when user input "y" or "Y"
            Menu(); //repeat to menu function
            
        } else if (choose3.equalsIgnoreCase("n")) { //when user input "n" or "N"
            System.out.println("Thank you for using this program ^^"); //closing message

        }
    }

}
