/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class AirsoftRentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("            Aika Airsoft Rent");
        System.out.println("==========================================");
        System.out.println("\t\tLogin");
        System.out.print("Input your name : ");
        String empName = sc.next();
        System.out.print("Input your ID : ");
        int empID = sc.nextInt();
        
        System.out.println("------------------------------------------");
        System.out.println("\t\tCUSTOMER INFO'S");
        System.out.print("Input cust name : ");
        String rentName = sc.next();
        System.out.println();
        System.out.print("Input cust ID : ");
        int rentID = sc.nextInt();
        Renter rent = new Renter(rentName, rentID);
        System.out.println("------------------------------------------");
        System.out.println("\t\tUNIT RENT INFO'S");
        System.out.print("Input unit type : ");
        String unitType = sc.next();
        System.out.print("Input unit colour : ");
        String unitColour = sc.next();
        System.out.print("Input amount : ");
        int unitAmt = sc.nextInt();
        Unit unit = new Unit(unitType, unitColour, unitAmt);
        System.out.println("FPS of unit : " + unit.getFps());
        Employee employ = new Employee(empName, empID, rent, unit);
        System.out.println("------------------------------------------");
        System.out.println("\t\tRENT INFO'S");
        System.out.println("Choose menu : ");
        System.out.println("1. Return ");
        System.out.println("2. Rent ");
        System.out.print("> ");
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.println("Amount of return : ");
            int returned = sc.nextInt();
            employ.returning(unitAmt);
        } else if(choose == 2){
            System.out.println("Amount of rent : ");
            int renting = sc.nextInt();
            employ.renting(unitAmt);
        }
        System.out.println("THANKYOU!");
    }
}
