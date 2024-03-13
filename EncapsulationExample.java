class EncapsulatedClass {
	int age;
	String name;
	String hobby;
	String address;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
 //variables and methods are encapsulated in the class and can only be accessed by its object using methods.
public class EncapsulationExample {
	public static void main(String[] args) {
		EncapsulatedClass encapsulatedClass =  new EncapsulatedClass();
		encapsulatedClass.setAge(23);
		encapsulatedClass.setName("Himesh");
		encapsulatedClass.setHobby("Singing");
		System.out.println(encapsulatedClass.getName() + " " + encapsulatedClass.getAge() + " " + encapsulatedClass.getHobby());
	}
}