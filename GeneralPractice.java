package JavaTraining;

import java.util.Scanner;

public class GeneralPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 5;
		if (number1 > 0) {
			System.out.println("The Number is Positive");
		} else if (number1 < 0) {
			System.out.println("The Number is Negative");
		} else {
			System.out.println("The Number is Zero");
		}

		double width, length, area;
		width = 5.2;
		length = 12.5;
		area = width * length;
		System.out.println("Area =" + " " + area);

		// Type Casting - widening
		short age = 23;
		double myDouble = age;
		System.out.println(age);
		System.out.println(myDouble);

		// Type Casting - Narrowing
		double k = 20.9;
		int t = (int) 20.9;
		System.out.println(k);
		System.out.println(t);

		Scanner value = new Scanner(System.in);

		System.out.println("Enter Number 5");
		int check = value.nextInt();

		if (check == 5) {
			System.out.println("Good");
		} else {
			System.out.println("Nope");
		}

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

		Scanner scanned = new Scanner(System.in);
		String sc = scanned.next();

		if (sc.equals("Hey") || sc.equals("hey")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println("Enter your Age");
		Scanner input = new Scanner(System.in);
		int ageCheck = input.nextInt();

		if (ageCheck >= 20) {
			System.out.println("Do you still wanna ride?");
			String askQ = input.next();
			if (askQ.equals("Yes")) {
				System.out.println("Ok");
			} else {
				System.out.println("No problem");
			}

		} else if (ageCheck >= 12) {
			System.out.println("You can ride");
		} else {
			System.out.println("Too short, cannot ride");
		}

	}
}