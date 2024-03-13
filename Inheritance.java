package projects;

/**
 * This program demonstrates the concept of inheritance using these classes which shows different types of inheritance.
 */
class Vehicle {
	void vehicleClass() {
		System.out.println("Vehicle class consists all the cars and bikes");
	}
}

/**
 * The Bike class represents a specific type of vehicle, a bike.
 * It extends the Vehicle class, demonstrating single-level inheritance.
 */
class Bike extends Vehicle {
	void bikeClass() {
		System.out.println("Bike is a type of vehicle and this class shows single level inheritance");
	}
}

/**
 * The Car class represents a specific type of vehicle, a car.
 * It extends the Vehicle class, demonstrating hierarchical inheritance.
 */
class Car extends Vehicle {
	void carClass() {
		System.out.println("Bike is a type of vehicle and car and bike shows hierarchical inheritance");
	}
}

/**
 * The RoyalEnfield class represents a specific type of bike, a Royal Enfield.
 * It extends the Bike class, demonstrating multi-level inheritance.
 */
class RoyalEnfield extends Bike {
	void royalEnfieldClass() {
	System.out.println("RoyalEnfield makes bike and this is multi-level inheritance");
	}
}

/**
 * The SuperMeteor class represents a specific type of Royal Enfield bike, a Super Meteor.
 * It extends the RoyalEnfield class, demonstrating hybrid inheritance.
 */
class SuperMeteor extends RoyalEnfield {
	void superMeteorClass() {
		System.out.println("SuperMeteor is a RoyalEnfield bike which here combines several tyoe of inheritance and is an example of hybrid inheritance");
	}
}

/**
 * The Interceptor class represents a specific type of Royal Enfield bike, an Interceptor.
 * It extends the RoyalEnfield class, demonstrating hierarchical inheritance.
 */
class Interceptor extends RoyalEnfield {
	void interceptorClass() {
		System.out.println("Interceptor is also a bike.");
	}
}

public class Inheritance {
	/**
     * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		Interceptor interceptor = new Interceptor();
		interceptor.vehicleClass();
		interceptor.bikeClass();
		interceptor.royalEnfieldClass();

		Car car = new Car();
		car.carClass();
		car.vehicleClass();
	}
}
