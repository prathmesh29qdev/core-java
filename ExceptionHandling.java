package projects;

import java.util.Scanner;

class Division
{
	void divide(float num1, float num2)
	{
		float a,b;
		a = num1;
		b = num2;
		float num3 = a/b;
		System.out.println("answer is : " + num3);
	}
}

public class ExceptionHandling {

	static void help()
	{
		try
		{
			throw new NullPointerException("error thrown");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in help()");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("enter two numbers to perform division");
		Scanner sc = new Scanner(System.in);
		float number1 = sc.nextInt();
		float number2 = sc.nextInt();
		
		Division division = new Division();
		division.divide(number1, number2);
	
		try 
		{
            help();
        }
        catch (NullPointerException e) 
		{
            System.out.println(
                "Caught in main error name given below:");
            System.out.println(e);
        }

	}
}
