/**
 * This program demonstrates the usage of the break and continue statements using for loop.
 */
public class BreakContinue {
	
	 /**
     * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		int number;
		
		// Loop through numbers from 1 to 10
		for (number = 1 ; number <= 10 ; number++) {
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
