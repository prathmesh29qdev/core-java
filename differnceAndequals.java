import java.math.BigDecimal;
import java.util.Scanner;

public class DiffernceAndEquals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		Integer number1 = num1;
		Integer number2 = num2;
		
		sc.nextLine();
		
		System.out.println("Enter two strings");
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		
		System.out.println("Enter two bigdecimal. example: 0.45");
		BigDecimal bd1 = sc.nextBigDecimal();
		BigDecimal bd2 = sc.nextBigDecimal();
	    
	    //integer
	    if(number1 == number2) {
	    	System.out.println("numbers are equal according to ==");
	    }
	    else {
	    	System.out.println("numbers are not equal according to ==");
	    }
	    
	    if(number1.equals(number2)) {
	    	System.out.println("numbers are equal according to .equals");
	    }
	    else {
	    	System.out.println("numbers are not equal according to .equals");
	    }
	    
	  //string
	    if(string1 == string2) {
	    	System.out.println("strings are equal according to ==");
	    }
	    else {
	    	System.out.println("strings are not equal according to ==");
	    }
	    
	    if(string1.equals(string2)) {
	    	System.out.println("strings are equal according to .equals");
	    }
	    else {
	    	System.out.println("strings are not equal according to .equals");
	    }
	    
	  //Bigdecimal
	    if(bd1 == bd2) {
	    	System.out.println("Bigdecimals are equal according to ==");
	    }
	    else {
	    	System.out.println("Bigdecimals are not equal according to ==");
	    }
	  
	    if(bd1.equals(bd2)) {
	    	System.out.println("Bigdecimals are equal according to .equals");
	    }
	    else {
	    	System.out.println("Bigdecimals are not equal according to .equals");
	    }
	}
}
