package JavaTraining;

public class NestedLoops2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("It's so cold outside!");
		}

		System.out.println("-------------");

		String[] colors = { "Red", "Blue", "Green" };

		for (int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		System.out.println("-------------");

		String[][] fancyColors = { { "Red", "Blue", "Green" }, { "Cyan", "Magenta", "Turquoise" } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(fancyColors[i][j]);
			}
		}
	}
}
