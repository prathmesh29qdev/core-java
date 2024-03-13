/**
 * This program demonstrates the use of 'this' and 'super' keyword.
 * And this class sets the value of the Car details like age,name,model and price.
 */
class Car {
	String model = "XUV";
	double price = 77.88;

	int age = 0;
	String name = "";
	/**
     * Get the age of the car.
     * @return The age of the car
     */
	public int getAge() {
		return age;
	}
	
	 /**
     * Set the age of the car.
     */
	public void setAge(int age) {
		System.out.println(age);
		age = this.age;
		System.out.println(age);
	}
	
	/**
	 * getting the name of car
	 * @return is to return the name variable
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set the name of car
	 * @param name is the parameter that stores the car name
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
		name = this.name;
		System.out.println(name);
	}
}

/**
 * This class demonstrates inheritance and extends Car to use the super keyword to access the parent's properties.
 */
public class ThisSuper extends Car {
	/**
	 * This function sets the value of model and price using super keyword.
	 */
	void func() {
		super.model = "SUV";
		super.price = 100;
		System.out.println("The model and price of BMW car is : " + model + "and " + price);
	}

	public static void main(String[] args) {
		new ThisSuper().func();
		Car car = new Car();
		car.setAge(5);
		car.setName("Honda");
	}
}