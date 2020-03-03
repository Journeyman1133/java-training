package JavaTraining;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Fibonacci Numbers would you like to see?");
		int n = scanner.nextInt(), t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");
		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

		System.out.println("\n");

		// List the Fibonacci Numbers up to a certain number
		int n2 = 55, t3 = 0, t4 = 1;
		System.out.print("Fibonacci Numbers up to " + n2 + ": ");

		while (t3 <= n2) {
			System.out.print(t3 + " ");
			int sum2 = t3 + t4;
			t3 = t4;
			t4 = sum2;
		}
	}
}