package projects;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * This program show the use of file handling methods based on user input to select from the tasks
 * like to read, write or delete a file.
 */
public class FIleHandling2 {
	public static void main(String[] args) {
		String fileName = "myTestFile3";
		File myFile = new File(fileName);
		
		//creating a file
		try {
			myFile.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			System.out.println("file not created");
			e.printStackTrace();
		}
		
		if (myFile.canExecute()) {
			System.out.println("File is executable");
		} else {
	        System.out.println("File is not executable");
		}
		
		Scanner sc = new Scanner(System.in);
		boolean shouldContinue = true;
		
		/**
		 * checks if shouldContinue to execute the code and asks for user input.
		 */
		while (shouldContinue) {
			System.out.println("Enter number according to the option you want to chose");
			System.out.println("1 for entering string in the file.");
			System.out.println("2 for reading the file.");
			System.out.println("3 for deleting the file.");
			System.out.println("4 to stop.");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			/**
			 * if this case is executed then will let user write in the file.
			 */
			case 1:
				//writing in file
				if(myFile.exists()) {
					System.out.println("Enter a string you want to write in the file.");
					String write = sc.nextLine();
					try {
						FileWriter fileWriter = new FileWriter(fileName);
						fileWriter.write(write);
						fileWriter.close();
						System.out.println(myFile.getName() + " File has been written.");
					} catch (IOException e) {
						System.out.println("not able to write in file");
						e.printStackTrace();
					}
				} else {
					System.out.println("File not present");
					shouldContinue = false;
				}
				break;
			/**
			 * if this case is executed then will display the contents of the file.
			 */
			case 2:
				//read the file
				if(myFile.exists()) {
					try {
						Scanner read = new Scanner(myFile);
					
						while(read.hasNextLine()) {
							String line = read.nextLine();
							System.out.println(line);
						}
						read.close();
					} 
					catch (FileNotFoundException e) {
						System.out.println("file can't be read");
						e.printStackTrace();
					}
				} else {
					System.out.println("File not present");
					shouldContinue = false;
				}
				break;
			/**
			 * if this case gets executed then will delete the file if it exists	
			 */
			case 3:
				//file deleting
				if(myFile.exists()) {
					System.out.println(myFile.getName());
					boolean deleted = myFile.delete();
					if(deleted) {
						System.out.println("File has been deleted: " + myFile.getName());
					} else {
						System.out.println("Problem while deleting the file");
					}
				} else {
					System.out.println("File doesn't exist");
				}
				break;
			case 4:
				shouldContinue = false;
				System.out.println("Stopping the execution");
				break;
			default:
				System.out.println("you have chosen invalid options, please select from the mentioned.");
				break;
			}
		}
		sc.close();
	}
}
