

/**
 *
 * @author Aika
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass, usname;
        
        System.out.print("Enter username : ");
        usname = sc.nextLine();
        
        if (usname.equalsIgnoreCase("College Student")){
            System.out.print("Enter password : ");
            pass = sc.nextLine();
             if(pass.equals("SeCreT"))
                 System.out.println("You have successfully logged in");
             else
                 System.out.println("Sorry, wrong password");
        }
        else 
            System.out.println("Username not found");
    }
}
