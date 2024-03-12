package projects;

interface API {
	default void display() {
		System.out.println("Default display method");
	}
}

interface Interface1 extends API {
	void show();
	void fun();
}

interface Interface2 extends API {
	void print();
	void fun();
}

public class InterfaceExample implements Interface1,Interface2 {

	@Override
	public void print() {
		System.out.println("Display from Interface2");
		
	}

	@Override
	public void show() {
		System.out.println("Display from Interface1");
		
	}
	
	@Override
	public void fun() {
		System.out.println("fun method");
		
	}
	
	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceExample();
		interfaceExample.display();
		interfaceExample.show();
		interfaceExample.print();
		interfaceExample.fun();
	}
}
