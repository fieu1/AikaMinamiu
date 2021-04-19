public class Task {
	public static void main(String[] args)throws Exception{
		String campus = "Polinema";
		int grade = 1;
		char _class = 'Z'; 
		int interger = 10;
		double fractionNumber = 3.33333;
		char character = 'C';
		System.out.println("I am a " + campus + "student, class "  + grade + _class);
		System.out.println("I'm learning to display values :");
		System.out.println("\tInterger " + interger);
		System.out.println(String.format("\tFraction %.2f" , fractionNumber));
		System.out.println("\tCharacter " + character);
	}
}