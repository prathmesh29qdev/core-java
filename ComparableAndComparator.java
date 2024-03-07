package projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
	public int compareTo(Student that) {
//		if(this.age > that.age)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		return this.age>that.age?1:0;
	}	
}

public class ComparableAndComparator {

	public static void main(String[] args) {
	
		//normal comparator function
//		Comparator<Student> com = new Comparator<Student>() {
//			
//			public int compare(Student i, Student j) {
////				if(i.age > j.age)
////				{
////					return 1;
////				}
////				else
////				{
////					return -1;
////				}
//				return i.age>j.age?1:0;
//			}
//		};
		
		//Lambda Expression for comparator
		Comparator<Student> com = (Student i, Student j) -> i.age > j.age?1:-1;
		
 		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(21, "Ramesh"));
		list.add(new Student(12, "John"));
		list.add(new Student(30, "Arbaaz"));
		list.add(new Student(20, "Sohail"));
		list.add(new Student(14, "Joshi"));
		
		Collections.sort(list,com); //comparator compares list with comparator
//		Collections.sort(list); // comparable
		
		for(Student s: list)
		{
			System.out.println(s);
		}
		
	}

}