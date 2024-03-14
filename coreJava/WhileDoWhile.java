package coreJava;

/**
 * <h3>While, Do..While Loop implementation</h3>
 * <p>
 * This program demonstrates the use of while and do..while statements and prints 1 to 10 numbers.
 * </p>
 * 
 * @author Prathmesh
 */
public class WhileDoWhile {

	public static void main(String[] args) {
		//while to show 1 to 10
		System.out.println("While:");
		int number = 1;
		while (number > 0 && number <= 10) {
			System.out.print(number);
			number++;
		}
		System.out.println();
		System.out.println();

		//do..while to show 1 to 10
		System.out.println("For do while:");
		int number1 = 1;
		do {	
		System.out.print(number1);
		number1++;
		} while (number1 > 0 && number1 <= 10);	
	}

}
