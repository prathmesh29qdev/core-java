package coreJava;

import java.util.Scanner;

/**
 * <h3>Switch Case implementation</h3>
 * <p>
 * This program demonstrate the use of switch case statement and outputs the name of month based 
 * on the number of month.
 * </p>
 * 
 * @author Prathmesh
 */
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Switch case output:");
		System.out.println("Enter number of month:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
			case 1:
				System.out.println("January"); 
				break;
			case 2:
				System.out.println("Feb"); 
				break;
			case 3:
				System.out.println("Mar"); 
				break;
			case 4:
				System.out.println("Apr"); 
				break;
			case 5:
				System.out.println("May"); 
				break;
			case 6:
				System.out.println("Jun"); 
				break;
			case 7:
				System.out.println("July"); 
				break;
			case 8:
				System.out.println("Aug"); 
				break;
			case 9:
				System.out.println("Sept"); 
				break;
			case 10:
				System.out.println("Oct"); 
				break;
			case 11:
				System.out.println("Nov"); 
				break;
			case 12:
				System.out.println("Dec"); 
				break;    
			default:
				System.out.println("Not a valid month"); 
				break;
		}
		System.out.println();
	}

}
