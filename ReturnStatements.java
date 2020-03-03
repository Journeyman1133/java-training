package JavaTraining;

public class ReturnStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAMessage();
		add(5, 4); // This does not work anymore
		int sum = add(5, 4); // We need return statements as shown below
		System.out.println(sum);
		String shouting = caps("Why are you reading my diary, mom?");
		System.out.println(shouting);
		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}

	public static void printAMessage() {
		System.out.println("This is our first method!");
	}

	public static int add(int a, int b) {
		return a + b;
		// System.out.println(a + b); // No need for this anymore
	}

	public static String caps(String s) {
		return s.toUpperCase();
	}

	public static int[] gimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}
