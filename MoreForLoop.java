package JavaTraining;

public class MoreForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			System.out.println("I love Java");
		}

		for (int i = 0; i < 4; i++) { // Let's you see how many times it was
										// repeated
		}

		for (int i = 0; i < "Germany".length(); i++) { // Let's you see the
														// number of chars in a
														// string
			System.out.println(i);
		}

		int testArray[] = { 31, 41, 53, 12, 34 }; // Prints the items in the
													// array in a for loop
		for (int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i]);
		}
	}
}
