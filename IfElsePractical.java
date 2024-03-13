import java.util.Scanner;

/**
 * This program demonstrates the use of if..else conditional statements
 */
public class IfElsePractical {
	/**
     * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		System.out.println("If..else output:");
		System.out.println("Enter a number for age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age <= 25){
			System.out.println("Young");
		} else if (age > 25 && age <= 60) {
			System.out.println("Middle aged");
		} else {
			System.out.println("Old");
		}
	}
}