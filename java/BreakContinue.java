package java;

/**
 * <h3>Break Continue statements</h3>
 * <p>
 * This program demonstrates the usage of the break and continue statements
 * using for loop.
 * </p>
 * 
 * @author Prathmesh
 */
public class BreakContinue {

	public static void main(String[] args) {
		// Loop through numbers from 1 to 10
		for (int number = 1; number <= 10; number++) {
			// If number is greater than 7, exit the loop
			if (number > 7) {
				break;
			}
			// If number is equal to 5, skip the current iteration
			if (number == 5) {
				continue;
			}
			System.out.print(" " + number);
		}
	}

}
