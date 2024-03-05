
abstract class App
{

	abstract void login();
	void username()
	{
		System.out.println("Username is public");
	}
}

class Password extends App
{
	void login() 
	{
		System.out.println("Password is private");
	}
	
}


public class DataAbstraction {

	public static void main(String[] args) {
		
		Password password = new Password();
		password.username();
		password.login();
	}

}
