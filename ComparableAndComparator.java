package projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * This program demonstrate the use of Comparable and Comparator and compares the values.
 */
class Student implements Comparable<Student> {
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	/**
	 * This function compares the value of the object
	 */
	public int compareTo(Student otherStudent) {
		if (this.age > otherStudent.age) {
			return 1;
		} else {
			return -1;
		}
	}	
}

public class ComparableAndComparator {
	public static void main(String[] args) {
		//comparator function
		Comparator<Student> com = new Comparator<Student>() {
			
			public int compare(Student student1, Student student2) {
				if (student1.age > student2.age) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(21, "Ramesh"));
		list.add(new Student(12, "John"));
		list.add(new Student(30, "Arbaaz"));
		list.add(new Student(20, "Sohail"));
		list.add(new Student(14, "Joshi"));
		
		Collections.sort(list,com); //comparator - this compares list with comparator
		Collections.sort(list); // comparable (while executing this code, make one of these statement comment
		
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
