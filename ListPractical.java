package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractical {

	public static void main(String[] args) {
		
		//iterator
		int i=0;
		
		//Arraylist
		ArrayList<String> values = new ArrayList<String>(); 
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number of strings you want to add");
		int numbers = sc.nextInt();
		
		if(numbers >=1)
		{
			sc.nextLine();			
		}
		
		System.out.println("Enter the values now");
		
		//taking values
		for(i=0;i<numbers;i++)
		{
				values.add(sc.nextLine());
//				System.out.println("index : " + i);
//				System.out.println("value : " + values.get(i) + " index: " + i);
		}
		
		//displaying values
		for(i=0;i<values.size();i++)
		{
			System.out.println("Value at index " + i + " is " + values.get(i));
		}
	}

}