package Jobsheet2;
import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class HypoMain {
     public static void main(String[] args) {
       Hypo[] arrpar = new Hypo[5]; //instantiation as many of 5
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i<arrpar.length ; i++){ //looping for input
           System.out.print("Input heigth : "); //input label
           int heigth = sc.nextInt(); //input heigth
           System.out.print("Input base : ");//input label
           int base = sc.nextInt();//input base
           System.out.print("Input hypo : "); //input label
           int hypo = sc.nextInt(); //input hypotenuse
           arrpar[i] = new Hypo(heigth, base, hypo); //constructor parameter 
       }
       for(int i = 0; i<5; i++){ //loop for output 
           System.out.println("Perimeter of parallelogram #" + i + " is " + arrpar[i].calculatedPerimeter()); //output
           System.out.println("Area of Parallelogram #" +i + " is " + arrpar[i].calculatedArea()); //output
       }
    }
}

