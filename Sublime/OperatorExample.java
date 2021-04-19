public class OperatorExample{
	public static void main(String []args){
		int x;
		x = 10 + 12;
		System.out.println("x++ = "+ x++);

		System.out.println("After evaluation, x = " + x );
		x = 10 + 12;
		System.out.println("++x = " + ++x);
		System.out.println("After evaluation, x = " + x);
		int y = 12;
		System.out.println(x > y || y == x && y <= x);
		int z = x^y;
		System.out.println("Hasil x ^ y adalah " + z);
		z %= 2;
		System.out.println("Hasil akhir " + z);
	}
}
