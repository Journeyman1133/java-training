package JavaTraining;

import java.util.Scanner;

public class InterestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner input = new Scanner(System.in)) {

			// Annual interest rate
			System.out.println("Enter annual interest rate, for example 0.5, no percent sign:");
			double annualInterestRate = input.nextDouble();

			// Monthly interest rate
			double monthlyInterestRate = annualInterestRate / 1200;

			// Number of years
			System.out.println("Enter number of years, for example 5:");
			int numberOfYears = input.nextInt();

			// Investment amount
			System.out.println("Enter investment amount, for example 145000.95:");
			double loanAmount = input.nextDouble();

			// Calculate payments
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;

			System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);

			System.out.println("Accumulated value is " + (int) (totalPayment * 100) / 100.0);

		}

	}

}
