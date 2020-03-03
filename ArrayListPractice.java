package JavaTraining;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Grapes";
		System.out.println(fruits[1]);

		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Grapes");
		fruitList.add("Kiwi"); // You can add a new fruit to the array list
		fruitList.remove("Grapes"); // Removes the Grapes from the list
		// fruitList.removeAll(fruitList); // Removes all
		// fruitList.clear(); // Clears the list
		System.out.println(fruitList);
		System.out.println(fruitList.contains("Raspberry"));

	}

}
