public class ExampleVariable{
	public static void main(String []args){
		String hobby = "Read novel";
		boolean smart = true;
		char gender = 'L';
		byte _age = 20;
		double ipk = 3.90, height = 1.55;
		System.out.println(hobby);
		System.out.println("Am I smart? " + smart);
		System.out.println("My gender is? " + gender);
		System.out.println("My age now : " + _age);
		System.out.println(String.format("My ipk is %s, with my height %s", ipk, height));
	}
}