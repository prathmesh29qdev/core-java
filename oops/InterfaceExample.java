package oops;

/**
 * <h3>Interface implementation</h3>
 * <p>
 * This program demonstrates the concept of interface and shows how a class override its uninitialized methods.
 * </p>
 * 
 * @author Prathmesh
 */
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

/**
 * This class implements both the interfaces and also execute the method body.
 */
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
		System.out.println("Fun method");
	}

	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceExample();
		interfaceExample.display();
		interfaceExample.show();
		interfaceExample.print();
		interfaceExample.fun();
	}

}