import java.util.Scanner;

public class Triangle{
	public static void main(String []args){
		float phi = 3.14F;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius: ");
		int radius = input.nextInt();
		System.out.println ("Enter height: ");
		int height = input.nextInt();

		float volume = phi * radius * radius * height;
		System.out.println ("Tube volume: " + volume);
	}
}
