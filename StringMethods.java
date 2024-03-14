import java.util.Scanner;

/**
 * This program demonstrates the use of different string methods.
 * <p>
 * 
 * @author Prathmesh
 */
public class StringMethods {

	public static void main(String[] args) {
		System.out.println("Enter the string you wnat to perform operations on");
		Scanner scanner = new Scanner(System.in);
		String string1  = scanner.nextLine();
		String string2 = new String("Apple");

		System.out.println("Enter element position you want to extract starting from 1");
		int index  = scanner.nextInt();

		/**
		 * Condition for checking if the character is present in the string
		 */
		if (index > (string1.length() + 1)) {
			System.out.println("Does not exist");
		} else {
			char element =  string1.charAt(index-1);
			System.out.println("The character at this position is: " + element );
		}

		System.out.println("String 2 is : " + string2);
		System.out.println("Concatenated string is  " + string1.concat(string2));
		boolean ifEqual  = string1.equals(string2);

		if (ifEqual == true)
			System.out.println("Strings are equal");
		else 
			System.out.println("Strings are not equal");

		System.out.println("Converted to uppercase: " + string1.toUpperCase());
		System.out.println("Contains() function in String to check if string contains io: " +(string1.contains("io")));

		//Replace function
		System.out.println("Replace function in String: " +(string1.replace ('a', 'e'))); 

		//ReplaceAll function
		System.out.println("ReplaceAll function in String: " +(string1.replaceAll("ing", "e"))); 

		//substring function
		System.out.println("Substring in String: " +(string1.substring(3, 6)));

		//trim function
		String str = "  Qdev   Technolab!   ";
		System.out.println("Without Trim function in String: " +str);
		System.out.println("Trim function in String: " +(str.trim()));
	}

}