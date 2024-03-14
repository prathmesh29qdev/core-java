/**
 * This program demonstrates the use of For Loops.
 * <p>
 * 
 * @author Prathmesh
 */
public class Forloop {

	public static void main(String[] args) {
		//for loop
		int row = 0, column = 0;
		for (row = 0 ; row < 5 ; row++) {
			for (column = 0 ; column <= row ; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}