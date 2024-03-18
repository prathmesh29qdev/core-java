package java;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * <h3>Equals implementation</h3>
 * <p>
 * This program demonstrates the use of == and .equals() for comparing integers,
 * strings and bigDecimal values
 * </p>
 * 
 * @author Prathmesh
 */
public class DifferenceAndEquals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();

		Integer number1 = firstNumber;
		Integer number2 = secondNumber;

		scanner.nextLine();

		System.out.println("Enter two strings");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();

		System.out.println("Enter two bigdecimal. example: 0.45");
		BigDecimal bigDecimal = scanner.nextBigDecimal();
		BigDecimal bigDecimal2 = scanner.nextBigDecimal();

		// integer
		if (number1 == number2) {
			System.out.println("Numbers are equal according to ==");
		} else {
			System.out.println("Numbers are not equal according to ==");
		}

		if (number1.equals(number2)) {
			System.out.println("Numbers are equal according to .equals");
		} else {
			System.out.println("Numbers are not equal according to .equals");
		}

		// string
		if (string1 == string2) {
			System.out.println("Strings are equal according to ==");
		} else {
			System.out.println("Strings are not equal according to ==");
		}

		if (string1.equals(string2)) {
			System.out.println("Strings are equal according to .equals");
		} else {
			System.out.println("Strings are not equal according to .equals");
		}

		// Bigdecimal
		if (bigDecimal == bigDecimal2) {
			System.out.println("Bigdecimals are equal according to ==");
		} else {
			System.out.println("Bigdecimals are not equal according to ==");
		}

		if (bigDecimal.equals(bigDecimal2)) {
			System.out.println("Bigdecimals are equal according to .equals");
		} else {
			System.out.println("Bigdecimals are not equal according to .equals");
		}
	}

}