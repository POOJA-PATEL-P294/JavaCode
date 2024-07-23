package hybrid_inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program -send the value 2 from Scanner class try to get exception called as inputmismatchException 
 * and try to handle it.(class 29)*/

public class Exception_E 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the values of a & b");
			int a=s.nextInt(); int b=s.nextInt();
			int result=a/b;
			System.out.println("The result is "+result);
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Your not given correct input");
			
		}
	}

}
