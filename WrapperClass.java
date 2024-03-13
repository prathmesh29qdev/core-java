public class WrapperClass {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		Integer num1 = num ;
		Integer num3 = num2 ;
		
		if (num1.equals(num3)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		
		int compareResult = Integer.compare(num, num2);
		if(compareResult > 0) {	
			System.out.println("First number is greater" + compareResult);
		} else if(compareResult < 0) {
			System.out.println("Second number is greater" + compareResult);
		} else {
			System.out.println("Values are equal " + compareResult);
		}
	}
}
