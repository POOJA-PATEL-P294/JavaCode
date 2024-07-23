package hybrid_inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;
//Write a program try and catch similar Nested ifelse using Scanner (Class 29)

public class ExceptionScanner
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		try
		{
			try
			{
				try
				{
					System.out.println("Enter your salary ");
					int salary=s.nextInt();
					System.out.println("The salary is "+salary);
					
				}
				catch(InputMismatchException i)
				{
					System.out.println("Input Mismatch Exception");
					
				}
				System.out.println("Enter your salary ");
				int salary=s.nextInt();
				System.out.println("The salary is "+salary);
				
			}
			catch(InputMismatchException i)
			{
				System.out.println("Input Mismatch Exception");
				
			}
			System.out.println("Enter your salary ");
			int salary=s.nextInt();
			System.out.println("The salary is "+salary);
			
			
		}
		catch(InputMismatchException i)
		{
			System.out.println("Input Mismatch Exception");
			
		}
	}

}
