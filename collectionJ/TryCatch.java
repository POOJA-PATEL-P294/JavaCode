package collectionJ;
/*)WAP to show the try and catch block handling*/

import java.util.InputMismatchException;

public class TryCatch
{
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

	}

}
