/**
 * <p>
 * This program demonstrates the concept of Wrapper class to compare the objects.
 * </p>
 * 
 * @author Prathmesh
 */
public class WrapperClass {

	public static void main(String[] args) {
		int number = 10;
		int number2 = 10;
		Integer number1 = number ;
		Integer number3 = number2 ;

		if (number1.equals(number3)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}

		/**
		 * values are stored in compareResult and returns if any one of them is 
		 * greater, smaller or equal
		 */
		int compareResult = Integer.compare(number, number2);
		if (compareResult > 0) {	
			System.out.println("First number is greater" + compareResult);
		} else if (compareResult < 0) {
			System.out.println("Second number is greater" + compareResult);
		} else {
			System.out.println("Values are equal " + compareResult);
		}
	}

}
