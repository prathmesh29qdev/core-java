package oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * <h3>Comparable and Comparator</h3>
 * <p>
 * This program demonstrate the use of Comparable and Comparator and compares the values.
 * </p>
 * 
 * @author Prathmesh
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

/**
 * This class implements comparator and also calls the sort function using both the 
 * Comparator and Comparable.
 */
public class ComparableAndComparator {

	public static void main(String[] args) {
		//comparator function
		Comparator<Student> comparator = new Comparator<Student>() {
			public int compare(Student student1, Student student2) {
				if (student1.age > student2.age) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(21, "Ramesh"));
		studentList.add(new Student(12, "John"));
		studentList.add(new Student(30, "Arbaaz"));
		studentList.add(new Student(20, "Sohail"));
		studentList.add(new Student(14, "Joshi"));

		Collections.sort(studentList, comparator); //comparator - this compares list with comparator
		Collections.sort(studentList); // comparable (while executing this code, make one of these statement comment

		for (Student students : studentList) {
			System.out.println(students);
		}
	}

}
