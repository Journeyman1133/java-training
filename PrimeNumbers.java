package JavaTraining;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to see if it is prime or not");
		int num = scanner.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

		System.out.println("Enter a different number");
		int num2 = scanner.nextInt(), i = 2;
		boolean flag2 = false;
		while (i <= num2 / 2) {
			// condition for nonprime number
			if (num2 % i == 0) {
				flag2 = true;
				break;
			}
			++i;
		}
		if (!flag2)
			System.out.println(num2 + " is a prime number.");
		else
			System.out.println(num2 + " is not a prime number.");

		int low = 10, high = 55;
		while (low < high) {
			boolean flag3 = false;
			for (int l = 2; l <= low / 2; ++l) {
				// condition for nonprime number
				if (low % l == 0) {
					flag3 = true;
					break;
				}
			}
			if (!flag3)
				System.out.print(low + " ");
			++low;
		}

	}

}
