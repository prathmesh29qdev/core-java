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

public class Polymorphism {

	public static void main(String[] args) {

		Bikes bikes = new Bikes();
		String commuterBike = bikes.buyBike(100);
		String highEndBike = bikes.buyBike(350, "RoyalEnfield");
		
		System.out.println("High end bike is " + highEndBike);
		System.out.println("Normal bike is " + commuterBike);
	}

}
