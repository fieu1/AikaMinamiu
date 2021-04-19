import java.util.Scanner;
public class Temperature{
	public static void main(String []args) throws Exception{
		Scanner temps = new Scanner (System.in);
		System.out.print("Enter the temperature: ");
		float suhu = temps.nextFloat();

		float reamur = suhu * 4 / 5 ;
		float farenheit = (suhu * 9 / 5) + 32;
		float kelvin = (suhu + 273);
		System.out.printf("Reamur: %.2f\n " , reamur);
		System.out.printf("Farenheit: %.2f\n " , farenheit);
		System.out.printf("Kelvin: %.2f\n " , kelvin);
	
	}
}
