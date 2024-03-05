package projects;

class Vehicle
{
	void vehicleClass()
	{
		System.out.println("Vehicle class consists all the cars and bikes");
	}
}

class Bike extends Vehicle 
{
	void bikeClass()
	{
		System.out.println("Bike is a type of vehicle and this class shows single level inheritance");
	}
}

class Car extends Vehicle
{
	void carClass()
	{
		System.out.println("Bike is a type of vehicle and car and bike shows hierarchical inheritance");
	}
}

class RoyalEnfield extends Bike
{
	void royalEnfieldClass()
	{
	System.out.println("RoyalEnfield makes bike and this is multi-level inheritance");
	}
}

class SuperMeteor extends RoyalEnfield
{
	void superMeteorClass()
	{
		System.out.println("SuperMeteor is a RoyalEnfield bike which here combines several tyoe of inheritance and is an example of hybrid inheritance");
	}
}

class Interceptor extends RoyalEnfield
{
	void interceptorClass()
	{
		System.out.println("Interceptor is also a bike.");
	}
}

public class Inheritance {

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
