import java.math.BigDecimal;

public class differnceAndequals {

	public static void main(String[] args) {
		Integer number1 = 10;
		Integer number2 = 10;
		String string1 = "Qdev";
		String string2 = "Technolab";
		BigDecimal bd1 =  new BigDecimal("0.45"); 
	    BigDecimal bd2 =  new BigDecimal("0.45"); 
	    
	    //integer
	    if(number1 == number2)
	    {
	    	System.out.println("numbers are equal according to ==");
	    }
	    else
	    {
	    	System.out.println("numbers are not equal according to ==");
	    }
	    
	    if(number1.equals(number2))
	    {
	    	System.out.println("numbers are equal according to .equals");
	    }
	    else
	    {
	    	System.out.println("numbers are not equal according to .equals");
	    }
	    
	  //string
	    if(string1 == string2)
	    {
	    	System.out.println("strings are equal according to ==");
	    }
	    else
	    {
	    	System.out.println("strings are not equal according to ==");
	    }
	    
	    if(string1.equals(string2))
	    {
	    	System.out.println("strings are equal according to .equals");
	    }
	    else
	    {
	    	System.out.println("strings are not equal according to .equals");
	    }
	    
	    
	  //Bigdecimal
	    if(bd1 == bd2)
	    {
	    	System.out.println("Bigdecimals are equal according to ==");
	    }
	    else
	    {
	    	System.out.println("Bigdecimals are not equal according to ==");
	    }
	    
	    if(bd1.equals(bd2))
	    {
	    	System.out.println("Bigdecimals are equal according to .equals");
	    }
	    else
	    {
	    	System.out.println("Bigdecimals are not equal according to .equals");
	    }

	}

}
