package projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> duplicate = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> filtered = new ArrayList<Character>();
		System.out.println("Enter 10 characters in the list");
		
		for(int i=0;i<10;i++)
		{
			char value = sc.next().charAt(0);
			duplicate.add(value);
		}
	
		removeDuplicates(duplicate);
		
		for(char index : duplicate)
		{
			System.out.println(index);
		}
	}

	private static void removeDuplicates(List<Character> charList) {
		
		Set<Character> filteredSet = new HashSet<Character>();
		int index=0;
		
		while(index < charList.size())
		{
			char currentChar = charList.get(index);
			
			if(filteredSet.contains(currentChar))
			{
				charList.remove(index);
			}
			else
			{
				filteredSet.add(currentChar);
			}
			index++;
		}
	}

}
