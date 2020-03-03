package JavaTraining;

public class LotteryTicket2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] lotteryCard = { { 20, 15, 7 }, { 8, 7, 19 }, { 7, 13, 47 } };
		// Easier way to make 2D Array

		int[][] lotterCard2 = new int[3][3]; // Harder way to make 2D Array
		lotterCard2[0][0] = 20;
		lotterCard2[0][1] = 15;
		lotterCard2[0][2] = 7;
		lotterCard2[1][0] = 8;
		lotterCard2[1][1] = 7;
		lotterCard2[1][2] = 19;
		lotterCard2[2][0] = 7;
		lotterCard2[2][1] = 13;
		lotterCard2[2][2] = 47;

		System.out.println(lotteryCard[2][1]);

		System.out.println("");

		for (int i = 0; i < 3; i++) {
			System.out.println(lotteryCard[i][i]); // This will print diagonally
		}

		System.out.println("");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(lotteryCard[i][j]);
			}
		}
	}

}
