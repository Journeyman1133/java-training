package JavaTraining;

import java.util.Scanner;
import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		String str = "Great";
		str = str.concat(" Ammar");// Adds "Ammar" after the "Great"
		System.out.println("Str: " + str);

		System.out.println(10 + 20 + "Javatpoint"); // Treats like an integer
		System.out.println("Javatpoint" + (10 + 20) + 40 + "asd"); // Integer if in the parentheses, otherwise adds as a string
		System.out.println(10 + 20 + "Javatpoint" + 13 + 13);
		System.out.println("Javatpoint" + 10 + 20 + "Javatpoint");*/

/*		System.out.println("Backslash lets you print anything within quotes \"like this\".");
		System.out.println("These are double quotes: \"\"");
		System.out.println("This is a backslash: \\");*/
		
//		System.out.println((int) Math.pow(5, 4));  // Printing Exponents
		
		String sentence = "This is my sentence that I would like to use";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while (scan.hasNext()) {
			words.add(scan.next());
			
		}
		System.out.println(words);
		
		
		
		
	}

}
