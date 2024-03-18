package oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * <h3>File handling</h3>
 * <p>
 * This program shows the file handling methods to read, write, delete and
 * create a file.
 * </p>
 * 
 * @author Prathmesh
 */
public class FileHandling {

	public static void main(String[] args) {
		File myFile = new File("myTestFile.txt");
		// creating a file
		try {
			myFile.createNewFile();
			System.out.println("File creacted");
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}

		// writing in file
		try {
			FileWriter fileWriter = new FileWriter("myTestFile.txt");
			fileWriter.write("This is the first line written through java code\nAnd this is second line..Bye.");
			fileWriter.close();
			System.out.println("File has been written.");
		} catch (IOException e) {
			System.out.println("Not able to write in file");
			e.printStackTrace();
		}

		// read the file
		try {
			Scanner scanner = new Scanner(myFile);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File can't be read");
			e.printStackTrace();
		}

		// file deleting
		if (myFile.delete()) {
			System.out.println("File has been deleted: " + myFile.getName());
		} else {
			System.out.println("Problem while deleting the file");
		}
	}

}
