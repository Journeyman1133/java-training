package JavaTraining;

public class MethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		multiply(5, 10); // Does the same thing as below
		multiply(2, 3); // No need to use a or b
		multiply(6, 8); // This method works for any integers
		divide(20, 5);

		System.out.println();

		int a = 5;
		int b = 10;
		System.out.println(a * b);

		int c = 2;
		int d = 3;
		System.out.println(c * d);

		int e = 6;
		int f = 8;
		System.out.println(e * f);

	}

	public static void welcome() {
		System.out.println("Welcome to Our Calculator!");
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void divide(int a, int b) {
		System.out.println(a / b);
	}

}
