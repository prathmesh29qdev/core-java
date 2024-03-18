package java;

/**
 * <h3>For Loop implementation</h3>
 * <p>
 * This program demonstrates the use of For Loops.
 * </p>
 * 
 * @author Prathmesh
 */
public class Forloop {

	public static void main(String[] args) {
		//for loop
		for (int row = 0 ; row < 5 ; row++) {
			for (int column = 0; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}