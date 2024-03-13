package projects;

import java.util.Scanner;

/**
 * This program demonstrates the use of arrays.
 */
public class ArrayPractical {
	public static void main(String[] args) {
		int[] values = new int[10];
		System.out.println("Enter 10 values to store in an array");
		Scanner sc  = new Scanner(System.in);
		for (int i = 0 ; i < 10 ; i++) {
			 values[i] = sc.nextInt();
		}
		
		System.out.println("The array elements are");
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(values[i] + " ");
		}
		
		System.out.println();
		System.out.println("Enter the element you want to search the index of in the array");
		int element = sc.nextInt();
		
		/**
		 * This loop is used to find the index position of the array element entered by user
		 */
		for (int i = 0 ; i < 10 ; i++) {
			if(values[i] == element) {
				System.out.println("Position: " + i);
			}
		}
	}
}
