package JavaTraining;

import java.util.Objects;

import javax.net.ssl.SNIHostName;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array - single variable multiple values
		int k[] = new int[4]; // this is size
		k[0] = 10; // index - starts with 0
		k[1] = 20;
		k[2] = 30;
		k[3] = 40; // highest array index
		System.out.println(k[0]);
		/* System.out.println(k[4]); ArrayIndexOutOfBoundsException */

		// To get length array
		System.out.println(k.length);

		// To print out all array
		for (int m = 0; m < k.length; m++) {
			System.out.println(k[m]);
		}

		// Double Array
		double d[] = new double[2];
		d[0] = 10.25;
		d[1] = 12.34;

		double dob[] = { 31.12, 44.15 }; // different usage

		// String Array
		String s[] = new String[4];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "Javascript";
		s[3] = "Ruby";

		for (int p = 0; p < s.length; p++) {
			if (s[p].equals("Ruby")) {
				System.out.println("I am not good at " + s[p]);
			} else {
				System.out.println("I know " + s[p]);
			}
		}

		String studentName[] = new String[5];
		studentName[0] = "John";
		studentName[1] = "Dan";
		studentName[2] = "Mark";
		studentName[3] = "Henry";
		studentName[4] = "Ali";

		for (int sn = 0; sn < studentName.length; sn++) {
			// System.out.println(studentName[sn]);

			// Adding an if condition to array
			if (studentName[sn].equals("John")) {
				System.out.println(studentName[sn] + " is American.");
			} else if (studentName[sn].equals("Dan")) {
				System.out.println(studentName[sn] + " is Canadian.");
			} else if (studentName[sn].equals("Mark")) {
				System.out.println(studentName[sn] + " is German.");
			} else if (studentName[sn].equals("Henry")) {
				System.out.println(studentName[sn] + " is Mexican.");
			} else {
				System.out.println(studentName[sn] + " is Turkish.");
			}
		}

		// How to store different types of data in an array - int, double,
		// String, char, and etc.
		// Object Static Data
		Object empData[] = new Object[5];

		empData[0] = "Tom"; // String
		empData[1] = 25; // int
		empData[2] = 'm'; // char
		empData[3] = 10.15; // double
		empData[4] = true; // boolean

		for (int em = 0; em < empData.length; em++) {
			System.out.println(empData[em]);
		}
	}
}
