package oops;

/**
 * <h3>Abstract keyword</h3>
 * <p>
 * This program demonstrates the use of abstract keyword to access the methods
 * in the class. And this class has an abstract method and another method with
 * body.
 * </p>
 * 
 * @author Prathmesh
 */
abstract class App {

	abstract void login();

	void username() {
		System.out.println("Username is public");
	}

}

/**
 * This class implements the login() method of the parent class App.
 */
class Password extends App {

	void login() {
		System.out.println("Password is private");
	}

}

/**
 * This class calls the method using the object of the above classes.
 */
public class DataAbstraction {

	public static void main(String[] args) {
		Password password = new Password();
		password.username();
		password.login();
	}

}