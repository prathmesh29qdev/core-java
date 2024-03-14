package coreJava;

import java.util.Scanner;

/**
 * <h3>EMI calculator</h3>
 * <p>
 * This program demonstrates EMI Calculator using class, object, variables, operators, and datatypes.
 * </p>
 * 
 * @author Prathmesh
 */
public class EmiCalculator {

	public float emiCalculate(float principal, float rateOfInterest, float time) {
		rateOfInterest = rateOfInterest / (12 * 100); // one month interest
		time = time * 12; // one month period
		float emi = (principal * rateOfInterest * (float)Math.pow(1 + rateOfInterest, time)) 
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
		emi = emiCalculator.emiCalculate(principalAmount, rate, time);
		System.out.println("The EMI for 12 months is:" + emi);
	}

}