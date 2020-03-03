package JavaTraining;

import java.util.Scanner;

public class TestGrading {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter your first test:");
		int firstTest = console.nextInt();

		System.out.println("Enter your second test:");
		int secondTest = console.nextInt();

		System.out.println("Enter your third test:");
		int thirdTest = console.nextInt();

		int averageGrade = ((firstTest + secondTest + thirdTest) / 3);
		System.out.println("Average grade is " + averageGrade);

		if (averageGrade < 65) {
			System.out.println("You have an F");
		} else if (averageGrade >= 65 && averageGrade < 70) {
			System.out.println("You have a D");
		} else if (averageGrade >= 70 && averageGrade < 80) {
			System.out.println("You have a C");
		} else if (averageGrade >= 80 && averageGrade < 90) {
			System.out.println("You have a B");
		} else {
			System.out.println("You have an A");
		}

	}
}
