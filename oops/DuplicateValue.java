package oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * <h3>Remove duplicate values</h3>
 * <p>
 * This programs removes the duplicate values from the list.
 * </p>
 * 
 * @author Prathmesh
 */
public class DuplicateValue {

	public static void main(String[] args) {
		ArrayList<Character> duplicate = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 7 characters in the list");

		/**
		 * taking input in the list
		 */
		for (int i = 0 ; i < 7 ; i++) {
			char value = scanner.next().charAt(0);
			duplicate.add(value);
		}

		removeDuplicatesValues(duplicate);

		for (char index : duplicate) {
			System.out.println(index);
		}
	}

	/**
	 * This method takes a list as input and removes the duplicate values from it.
	 * @param charList
	 */
	private static void removeDuplicatesValues(List<Character> charList) {
		Set<Character> filteredSet = new HashSet<Character>();
		Iterator<Character> iterator = charList.iterator();

		while (iterator.hasNext()) {
			char currentChar = iterator.next();
			if (filteredSet.contains(currentChar)) {
				iterator.remove();
			} else {
				filteredSet.add(currentChar);
			}
		}
	}

}
