/**
 * This program demonstrates the use of static keyword
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
	
	/**
     * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		Student.change();
		Student std = new Student(11,"Sam");
		Student std1 = new Student(12,"Pen");
		Student std3 = new Student(91,"Mike");
		
		std.display();
		std1.display();
		std3.display();
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
     * @param num The name of the student
     */
	Student(int roll, String num){  
		rollno = roll;  
		name = num;  
	}  
	
	void display() {
		System.out.println("rollno: " + rollno + " name: " + name + " college: " + college);
	}
}