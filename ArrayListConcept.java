package JavaTraining;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList arrayList = new ArrayList();
		
		// Adding Values
		arrayList.add(100); // int - 0 index
		arrayList.add(200); // int - 1st index
		
		System.out.println(arrayList.size());
		
		arrayList.add(13.25); // double
		arrayList.add(12.35); //double
		
		System.out.println(arrayList.size());
		
		arrayList.add("Java"); // String
		arrayList.add("Selenium"); // String
		
		System.out.println(arrayList.size());
		
		// Removing Values
		arrayList.remove(2);
		System.out.println(arrayList.get(2));
		
		// Get Specific Array Value
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(3));
		
		// System.out.println(arrayList.get(5)); // IndexOutOfBoundsException
		
		// Print all Array Values
			for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			System.out.println(arrayList.get(3));} // Prints the 3rd index, Java, in a loop
		}

}
