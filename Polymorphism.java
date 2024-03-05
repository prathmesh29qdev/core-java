package projects;


//Compile time polymorphism
class Bikes
{
	int cc;
	String brand;
	String bike;
	String buyBike(int cc, String brand)
	{
		bike = "Bullet";
		return bike;
		
	}
	
	String buyBike(int cc)
	{
		bike = "honda";
		return bike;
	}
	
}

//Runtime Polymorphism
class Colors
{
	void paint()
	{
		System.out.println("all colors will be used in the painting");
	}
}

class Blue extends Colors
{
	void paint()
	{
		System.out.println("BLUE color will be used in the painting");
	}
}

class Black extends Colors
{
	void paint()
	{
		System.out.println("BLACK color will be used in the painting");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		//Compiletime Polymorphism
		Bikes bikes = new Bikes();
		String commuterBike = bikes.buyBike(100);
		String highEndBike = bikes.buyBike(350, "RoyalEnfield");
		
		System.out.println("High end bike is " + highEndBike);
		System.out.println("Normal bike is " + commuterBike);
		
		//Runtime Polymorphism'
		Colors color = new Black();
		color.paint();
		
		Colors color1 = new Blue();
		color1.paint();
	}

}
