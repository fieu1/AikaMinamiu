
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number : ");
        number1 = sc.nextInt();
        System.out.println("Input second number : ");
        number2 = sc.nextInt();
        
        if(number1 > number2)
            System.out.println("The biggest number is " + number1);
        else 
            System.out.println("The biggest number is " + number2);
        
    }
    
}
