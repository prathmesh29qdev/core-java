package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>List implementation</h3>
 * <p>
 * This program implements the concept of List and takes values from user and displays the content.
 * </p>
 * 
 * @author Prathmesh
 */
public class ListPractical {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> values = new ArrayList<String>(); 
		Scanner scanner = new Scanner(System.in);

		//taking input
		System.out.println("Enter the number of strings you want to add");
		int numbers = scanner.nextInt();

		if (numbers >= 1) {
			scanner.nextLine();
		}

		System.out.println("Enter the values now");

		//taking values
		for (int iterate = 0 ; iterate < numbers ; iterate++) {
			values.add(scanner.nextLine());
		}

		//displaying values
		for (int iterate = 0 ; iterate < values.size() ; iterate++) {
			System.out.println("Value at index " + iterate + " is " + values.get(iterate));
		}
	}

}