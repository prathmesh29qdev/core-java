
public class HelloWorld {

	public static void main(String[] args) {
		
		//hello world
		System.out.println("Hello World");
		
		//if...else
		System.out.println("if..else output:");
		int age = 23;
		
		if(age <=25)
		{
			System.out.println("young");
		}
		else if(age>25 && age<=60)
		{
			System.out.println("Middle aged");
		}
		else
		{
			System.out.println("Old");
		}
		
		//switch
		System.out.println("switch case output:");
		int month = 9;
		switch(month) {
			case 1:
				System.out.println("January"); 
				break;
			case 2:
	            System.out.println("Feb"); 
	            break;
			case 3:
	            System.out.println("Mar"); 
	            break;
			case 4:
	            System.out.println("Apr"); 
	            break;
			case 5:
	            System.out.println("May"); 
	            break;
			case 6:
	            System.out.println("Jun"); 
	            break;
			case 7:
	            System.out.println("July"); 
	            break;
			case 8:
	            System.out.println("Aug"); 
	            break;
			case 9:
	            System.out.println("Sept"); 
	            break;
			case 10:
	            System.out.println("Oct"); 
	            break;
			case 11:
	            System.out.println("Nov"); 
	            break;
			default:
	            System.out.println("Dec"); 
	            break;
		}
		
		//while
		System.out.println("while:");
		int num = 1;
		while(num>0 && num<=10)
		{
			System.out.print(num);
			num++;
		}
		
		System.out.println();
		
		//do..while
		System.out.println("for do while:");
		int num1 = 1;
		do
		{
			System.out.print(num1);
			num1++;
		}
		while(num1>0 && num1<=10);	
	}

}
