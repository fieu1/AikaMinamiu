import java.util.Scanner;

 public class Quiz1_Meuti{
 	public static void main(String []args){
 	int deposite, balanceAll; 
 	int admFee = 6500;
 	int balance = 0;

	Scanner sc = new Scanner (System.in);
 	System.out.println("Your balance is : " + balance);
 	System.out.println("Input your deposit : ");
 	int depos = sc.nextInt();
 	depos = depos - admFee;
 	deposite = depos /1000;
 	balanceAll = balance + depos + deposite;
 	System.out.println("Balance's updated!");
 	System.out.println("Your balance now : " + balanceAll);	

 	}
 }