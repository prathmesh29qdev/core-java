import java.util.Scanner;

/**
 * This program demonstrates EMI Calculator using class, object, variables, operators, and datatypes.
 * <p>
 * 
 * @author Prathmesh
 */
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
		Scanner scanner = new Scanner(System.in);
		float principalAmount = scanner.nextFloat();
		rate = 9; //rate of interest
		time = 12; // time in months (loan tenure)
		EmiCalculator emiCalculator = new EmiCalculator();
		emi = emiCalculator.emiCalc(principalAmount, rate, time);
		System.out.println("The EMI for 12 months is:" + emi);
	}

}