
class Car
	{
		String model = "XUV";
		double price = 77.88;
		
		int age = 0;
		String name = "";
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			
//			this.age = age;
			 System.out.println(age);
			 age = this.age;
			
			System.out.println(age);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			name = name;
			System.out.println(name);
			name = this.name;
			System.out.println(name);
		}
		
	}

public class ThisSuper extends Car {
	
//	class BMW extends Car
		void func()
		{
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
