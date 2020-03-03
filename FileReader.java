package JavaTraining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Prints the txt file from your computer
		File file = new File("C:/Users/Ammar/Desktop/captmidn.txt");
		Scanner scanner = new Scanner(file);

		String fileContent = "";
		while (scanner.hasNextLine()) {
			// System.out.println(scanner.nextLine());
			fileContent = fileContent.concat(scanner.nextLine() + "\n");
		}
		// Creates a new txt file to your computer using the above txt file's
		// text
		FileWriter writer = new FileWriter("C:/Users/Ammar/Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}

}
