/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aika
 */
public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        int salary, netSalary;
        double tax = 0;
        System.out.println("Enter category : ");
        category = sc.nextLine();
        System.out.println("Enter the salary amount : ");
        salary = sc.nextInt();
        
        if (category.equalsIgnoreCase("Workers")) {
            if (salary <= 2000000)
                tax = 0.1;
            else if (salary <= 3000000)
                tax = 0.15;
            else if (salary <= 0)
                System.out.println("Income that you're entered is incorrect");
            else
                tax = 0.2;
            netSalary = (int) (salary - (salary * tax));
            System.out.println("Net salary that you receive : " + netSalary);
        } else if (category.equals("Bussiness People")){
            if (salary <= 2500000)
                tax = 0.15;
            else if(salary <= 3500000)
                tax = 0.2;
            else if (salary <= 0)
                System.out.println("Income that you're entered is incorrect");
            else
                tax = 0.25;
            
            netSalary = (int) (salary - salary * tax);
            System.out.println("Net salary you receive : " + netSalary);
        }   else 
            System.out.println("The category you entered is incorrect");
    }
}
