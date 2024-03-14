package projects;

/**
 * This program demonstrates the concept of Compile time and runtime polymorphism by showing 
 * the execution of concept method overloading and method overriding.
 */
class Bikes {

	int cc;
	String brand;
	String bike;
	//Compile time Polymorphism 
	String buyBike(int cc, String brand) {
		bike = "Bullet";
		return bike;
	}
	
	String buyBike(int cc) {
		bike = "honda";
		return bike;
	}

}

//Runtime Polymorphism
/**
 * This class implements a method paint().
 */
class Colors {

	void paint() {
		System.out.println("All colors will be used in the painting");
	}

}

/**
 * This class extends colors and shows single level inheritance.
 */
class Blue extends Colors {

	void paint() {
		System.out.println("BLUE color will be used in the painting");
	}

}

/**
 * This class extends colors and shows single level inheritance.
 */
class Black extends Colors {

	void paint() {
		System.out.println("BLACK color will be used in the painting");
	}

}

/**
 * This class shows the concept of polymorphism by calling the methods of the above classes that implement
 * method overloading and overriding.
 */
public class Polymorphism {

	public static void main(String[] args) {
		//Compiletime Polymorphism
		Bikes bikes = new Bikes();
		String commuterBike = bikes.buyBike(100);
		String highEndBike = bikes.buyBike(350, "RoyalEnfield");
		
		System.out.println("High end bike is " + highEndBike);
		System.out.println("Normal bike is " + commuterBike);
		
		//Runtime Polymorphism
		Colors color = new Black();
		color.paint();
		
		Colors color1 = new Blue();
		color1.paint();
	}

}
