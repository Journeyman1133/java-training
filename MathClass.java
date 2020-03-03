package JavaTraining;

import java.util.Random;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Math.min(10, 20); // finds the min value
		System.out.println(min);

		int max = Math.max(10, 20); // finds the max value
		System.out.println(max);

		float roundD = Math.round(23.45); // rounds float value down
		System.out.println(roundD);

		float roundU = Math.round(23.54); // rounds float value up
		System.out.println(roundU);

		int a = 230;
		byte b = (byte) a;
		System.out.println(a);
		System.out.println(b); // subtracts the value from 256

		double random = Math.random() * 10D;
		System.out.println(random); // prints a random decimal number less than
									// 10

		Random rand = new Random();
		int rand1 = rand.nextInt(100);
		System.out.println(rand1); // Prints random numbers less than 100

		double rand2 = rand.nextDouble();
		System.out.println(rand2); // Prints random decimal less than 1

		double floor = Math.floor(7.991);
		System.out.println(floor); // Rounds down the number regardless

		int x = 10;
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240

		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // Numerical
															// Expressions

		int a1 = 10;
		int b1 = 5;
		int c1 = 20;
		System.out.println(a1 < b1 && a < c1);// false && true = false
		System.out.println(a1 < b1 & a < c1);// false & true = false

		System.out.println(a1 > b1 || a1 > c1);// true || false = true
		System.out.println(a1 > b1 | a1 < c1);// true | true = true

		// Program of Odd or Even Numbers
		int number = 13;
		// Check if the number is divisible by 2 or not
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}

		// Grading System
		int grade = -5;

		if (grade < 65 && grade >= 0) {
			System.out.println("F");
		} else if (grade >= 65 && grade < 70) {
			System.out.println("D");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 90 && grade < 95) {
			System.out.println("A");
		} else if (grade >= 95 && grade < 100) {
			System.out.println("A+");
		} else {
			System.out.println("Invalid!");
		}

		// Creating two variables for age and weight
		int age = 11;
		int weight = 51;
		// Applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}

		int number1 = -10;
		if (number1 > 0) {
			System.out.println("The Number is Positive");
		} else if (number1 < 0) {
			System.out.println("The Number is Negative");
		} else {
			System.out.println("The Number is Zero");
		}

	}
}
