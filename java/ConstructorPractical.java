package java;

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
		System.out.println("Constructor Initialized");
	}

	/**
	 * This is a parameterized constructor.
	 */
	ConstructorPractical(int number1, int number2) {
		System.out.println("Inside parameterized Constructor");
		System.out.println("Result is " + number1 * number2);
	}

	public static void main(String[] args) {
		System.out.println("Enter two digits");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		ConstructorPractical constructorPractical = new ConstructorPractical();
		ConstructorPractical constructorPractical1 = new ConstructorPractical(number1, number2);
	}

}
