import java.util.Scanner;

public class IfElsePractical {
	public static void main(String[] args) {
		System.out.println("if..else output:");
		System.out.println("Enter a number for age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age <= 25){
			System.out.println("young");
		} else if (age > 25 && age <= 60) {
			System.out.println("Middle aged");
		} else {
			System.out.println("Old");
		}
	}
}
