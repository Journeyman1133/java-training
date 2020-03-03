package JavaTraining;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "104";
		System.out.println(s + 3); // Adds a 3 to s string
		int n = Integer.parseInt(s); // Changes a string into int
		System.out.println(n + 5);
		System.out.println(Integer.parseInt(s) + 3); // Different way to change

		int m = 8;
		System.out.println(m + 5);
		System.out.println(Integer.toString(m) + 5); // Changes int to String

		String mixedChars = "Approx. Age: 47";
		System.out.println(mixedChars);
		mixedChars = mixedChars.replaceAll("\\D+", ""); // Removes everything but digits
		int t = Integer.parseInt(mixedChars);
		System.out.println(t + 2); // t is an int; it was a 47 as String
	}

}
