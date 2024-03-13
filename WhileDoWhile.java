/**
 * This program demonstrates the use of while and do..while statements and prints 1 to 10 numbers.
 */
public class WhileDoWhile {
	
	public static void main(String[] args) {
		//while to show 1 to 10
		System.out.println("while:");
		int num = 1;
		while (num > 0 && num <= 10) {
			System.out.print(num);
			num++;
		}
		System.out.println();
		System.out.println();
				
		//do..while to show 1 to 10
		System.out.println("for do while:");
		int num1 = 1;
		do {	
		System.out.print(num1);
		num1++;
		} while (num1 > 0 && num1 <= 10);	
	}
	
}
