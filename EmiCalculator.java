import java.util.Scanner;

public class EmiCalculator {
	public float emiCalc(float principal, float rateOfInterest, float time) {
		float emi;
		rateOfInterest = rateOfInterest / (12 * 100); // one month interest
        time = time * 12; // one month period
        emi = (principal * rateOfInterest * (float)Math.pow(1 + rateOfInterest, time)) 
        		/ (float)(Math.pow(1 + rateOfInterest, time) - 1);
		return emi;
	}
	public static void main(String[] args) {
		float emi, rate, time;
		System.out.println("Enter amount of the product");
		Scanner myObj = new Scanner(System.in);
		float principalAmount = myObj.nextFloat();
		rate = 9;
		time = 12;
		EmiCalculator emiCalculator = new EmiCalculator();
		emi = emiCalculator.emiCalc(principalAmount, rate, time);
	    System.out.println("The EMI for 12 months is:" + emi);
	}

}
