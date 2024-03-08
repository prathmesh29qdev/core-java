class Student
{
	int rollno;
	String name;
	static String college = "BITS";
	
	 static void change(){  
	     college = "BITS Varnama";  
	     }  
	 
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    
    void display()
    {
    	System.out.println("rollno: " + rollno + " name: " + name + " college: " + college);
    }
}

public class StaticKeyword {

	static int count;
	public StaticKeyword(){  
	count++; 
	System.out.println(count); 
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.change();
		Student std = new Student(11,"Sam");
		Student std1 = new Student(12,"Pen");
		Student std3 = new Student(91,"Mike");
		
		std.display();
		std1.display();
		std3.display();
		
	}
}
