package projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		
		ArrayList<Character> duplicate = new ArrayList<Character>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 7 characters in the list");
			
			for(int i=0;i<7;i++)
			{
				char value = sc.next().charAt(0);
				duplicate.add(value);
			}
		}
		removeDuplicates(duplicate);
		
		for(char index : duplicate)
		{
			System.out.println(index);
		}
	}

	private static void removeDuplicates(List<Character> charList) {
		
		Set<Character> filteredSet = new HashSet<Character>();
		Iterator<Character> iterator = charList.iterator();
		
		while(iterator.hasNext())
		{
			char currentChar = iterator.next();
			if(filteredSet.contains(currentChar))
			{
				iterator.remove();
			}
			else
			{
				filteredSet.add(currentChar);
			}
		}
		
//		while(index < charList.size())
//		{
//			char currentChar = charList.get(index);
//			System.out.println(currentChar + " " + index);
//			if(filteredSet.contains(currentChar))
//			{
//				charList.remove(index);
//			}
//			else
//			{
//				filteredSet.add(currentChar);
//			}
//			index++;
//		}
	}

}
