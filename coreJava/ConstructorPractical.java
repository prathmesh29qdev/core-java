package coreJava;

import java.util.Scanner;

/**
 * <h3>Constructor practical</h3>
 * <p>
 * This program demonstrates the concept of Constructors.
 * </p>
 * 
 * @author Prathmesh
 */
public class ConstructorPractical {

	/**
	 * This is a default constructor.
	 */
	ConstructorPractical() {
		System.out.println("Constructor Initialixed");
	}

	/**
	 * This is a parameterized constructor.
	 */
	int ConstructorPractical(int number1, int number2) {
		System.out.println("Inside parameterized Constructor");
		int number3;
		number3 = number1 * number2;
		return number3;	
	}

	/**
	 * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		System.out.println("Enter two digits");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		ConstructorPractical constructorPractical = new ConstructorPractical();
		int result = constructorPractical.ConstructorPractical(number1, number2);
		System.out.println("result is:" + result);
	}

}
