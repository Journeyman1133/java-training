package JavaTraining;

public class BreakAndSwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i < 3) {
			System.out.println("Hi!");
			i++;
			break; // Breaks the While Loop
		}
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == 30) {
				break; // This breaks only when reached 30
			}
			System.out.println(numbers[j]);
		}
		int k = 1;
		switch (k) {
		case 0:
			System.out.println("Zero!");
			break;
		case 1:
			System.out.println("The One!");
			break;
		default:
			System.out.println("Null!!??");
			break;
		}

		for (int m = 0; m < 5; m++) {
			for (int n = 0; n < 3; n++) {
				System.out.println(m + ", " + n); // Prints a total of 15 sets
													// like arrays
				break; // Prints only one set of 5; first set
			}
			// break; // Prints only one set of 5; second set
		}
	}

}
