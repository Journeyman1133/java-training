package JavaTraining;

import java.util.Scanner;

public class DoWhileCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int operation, num1, num2, result;
	
	do {
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Divison");
		System.out.println("Choose Your Operation");
		operation = input.nextInt();
		
		if (operation>4) {
			System.out.println("You need to enter a number 1 thru 4");
			break;
		}
		
		System.out.println("Enter Two Integers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (operation == 1) {
			result = num1 + num2;
			System.out.println("The sum is = " + result);
		}
		else if	(operation == 2) {
				result = num1 - num2;
				System.out.println("The difference is = " + result);
		}
		else if	(operation == 3) {
				result = num1 * num2;
				System.out.println("The product is = " + result);
		}
		if (operation == 4) {
			result = num1 / num2;
			System.out.println("The quotient is = " + result);
		}
		
	} while (operation!=5);
		
	}

}
