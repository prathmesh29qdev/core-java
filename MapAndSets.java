package projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAndSets {
	public static void main(String[] args) {
		HashMap<String, Integer> students  = new HashMap<>();
		//map
		//insertion
		students.put("Manan", 34);
		students.put("Chaman", 67);
		students.put("Mahesh", 33);
		students.put("Mahima", 90);
		students.put("Ramesh", 22);
		
		System.out.println(students.keySet());
		
		for (String key : students.keySet()) {
			System.out.println(students.get(key));
		}
		
		if (students.containsKey("Gagan")) {
			System.out.print("Yes it is there");
		} else {
			System.out.println("Key dosesn't exist");
		}
		
		System.out.println(students.get("Chaman"));
		System.out.println(students.get("Gagan"));
				
		for (Map.Entry<String, Integer> e : students.entrySet()) {
			System.out.print(e.getKey()+ " ");
			System.out.println(e.getValue());
		}
		
		Set<String> keys = students.keySet();
		for (String key : keys) {
			System.out.println(key + " " + students.get(key));
		}
		students.remove("Chaman");
		System.out.println(students);
	}
}
