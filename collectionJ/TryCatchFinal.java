package collectionJ;
/*73)Write a program to Handle Exception using try, catch and finally block*/
public class TryCatchFinal {

	public static void main(String[] args) 
	{
		try
		{
			int result=10/0;
			System.out.println("The result is "+result);
		}
		catch(Exception e) 
		{
			System.out.println("Divided by zero");
			
		}
		finally
		{
			System.out.println("you have an exception");
		}

	}

}
