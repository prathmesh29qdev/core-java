package projects;

import java.util.HashSet;
import java.util.Iterator;

public class SetsPractical {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
	
		set.add(82);
		set.add(21);
		set.add(45);
		set.add(32);
		set.add(82);
		
		if(set.contains(82))
		{
			System.out.println("Set has this value");
		}
		if(!set.contains(2))
		{
			System.out.println("Set doesn't have this value");		
		}
		System.out.println(set + " and " + set.size());
		
		//iterator concept using hasNext
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
	}
}
