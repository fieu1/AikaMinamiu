import java.util.Scanner;


public class Selection1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Enter your number: ");
        number = sc.nextInt();
        if (number%2==0)
            System.out.println("Even number");
        
        else 
            System.out.println("Odd number");
        
    }
    
}