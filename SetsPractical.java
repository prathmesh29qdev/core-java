package projects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetsPractical {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		System.out.println("enter number of elements you want to add in set");
		Scanner sc = new Scanner(System.in);
		int numberOfElement = sc.nextInt();
		
		System.out.println("Enter " + " numbers to add in set");
		for(int i=0; i<numberOfElement;i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("Enter any number to check if is is in the Set");
		int number = sc.nextInt();
		
		if(set.contains(number)) {
			System.out.println("Set has this value");
		}
		if(!set.contains(number)) {
			System.out.println("Set doesn't have this value");		
		}
		System.out.println(set + " and " + set.size());
		
		//iterator concept using hasNext
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
