/**
 * <p>
 * This program demonstrates the use of static keyword
 * </p>
 * 
 * @author Prathmesh
 */
public class StaticKeyword {

	static int count;
	/**
	 * initializes the object
	 */
	public StaticKeyword(){  
	count++; 
	System.out.println(count); 
	}

	public static void main(String[] args) {
		Student.change();
		Student studentObject = new Student(11,"Sam");
		Student studentObject1 = new Student(12,"Pen");
		Student studentObject3 = new Student(91,"Mike");

		studentObject.display();
		studentObject1.display();
		studentObject3.display();
	}

}

/**
 * This class represents the student details like roll number, name and college name
 */
class Student {

	int rollno;
	String name;
	static String college = "BITS"; //this is the default college for all students that's why declared static
	
	static void change(){  
		college = "BITS Varnama";  //changing the college name for all students
	}

	/**
	 * Initializes a student with roll number and name.
	 * 
	 * @param roll The roll number of the student
	 * @param nameOfStudent is the name of the student
	 */
	Student(int roll, String nameOfStudent){
		rollno = roll;
		name = nameOfStudent;
	}

	void display() {
		System.out.println("rollno: " + rollno + " name: " + name + " college: " + college);
	}

}