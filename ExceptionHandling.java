package projects;

import java.util.Scanner;

class Division
{
	//throws Arithmetic Exceotion
	void divide(float num1, float num2) throws ArithmeticException
	{
		float a,b;
		a = num1;
		b = num2;
		if(b<=0)
		{
			throw new ArithmeticException("The divisor cannot be zero");
		}
		else
		{
			float num3 = a/b;
			System.out.println("answer is : " + num3);
		}
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
	
	//throws Arithmetic Exception
	static void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied below 18 years");
		}
		else
		{
			System.out.println("You're authorized");
		}
	
	}
	
	public static void main(String[] args) {
		System.out.println("enter two numbers to perform division");
		Scanner sc = new Scanner(System.in);
		float number1 = sc.nextInt();
		float number2 = sc.nextInt();

		Division division = new Division();
		
		try
		{
			division.divide(number1, number2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisor should be greater than zero");
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is the finally block");
		}
		
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
		checkAge(2);
	}
}
