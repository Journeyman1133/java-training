package JavaTraining;

import java.util.Arrays;

public class MoreArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Our Zombie Killer Program");
		String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
		String zombies[] = { "Close-Range Zombie", "Mid-Range Zombie", "Long-Range Zombie" };
		int numbersZombie[] = { 1, 2, 3, 4, 5 };

		System.out.println("Our Backpack Items");
		System.out.println(Arrays.toString(backpack)); // Prints all indexes
		System.out.println("Our Zombies");
		System.out.println(Arrays.toString(zombies));
		System.out.println("These are our numbers");
		// System.out.println("These are our Numbers".substring(3, 8)); //
		// Prints the chars from3 to 8 in the string
		System.out.println(Arrays.toString(numbersZombie));

		// System.out.println(backpack[2]); // Prints the specific index - [2]

	}

}
