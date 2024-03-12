import java.util.Scanner;

public class ConstructorPractical {

	ConstructorPractical() {
		System.out.println("Constructor Initialixed");
	}
	
	int ConstructorPractical(int number1, int number2) {
		System.out.println("Inside parameterized Constructor");
		int number3;
		number3 = number1 * number2;
		return number3;	
	}
	public static void main(String[] args) {
	
		System.out.println("Enter two digits");
		Scanner myObj = new Scanner(System.in);
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		ConstructorPractical constructorPractical = new ConstructorPractical();
		int result = constructorPractical.ConstructorPractical(num1, num2);
		System.out.println("result is:" + result);
	}

}
