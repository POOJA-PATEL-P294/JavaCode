package package1;
import java.util.Scanner;

/*Write a program to make a form where the user is able to input his information.The following information is required:
(First name, Email, Password, Gender, Present address, Permanent address, Pin code) */

public class ScannerClass 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		// TODO Auto-generated method stub
	
		System.out.println("enter the First Name:");
		String fistName=s.nextLine();
		
		System.out.println("enter the email address:");
		String email=s.nextLine();
		
		System.out.println("enter the password:");
		String password=s.nextLine();
		
		System.out.println("enter the Gender:");
		String gender=s.nextLine();
		
		System.out.println("enter your present address:");
		String preAddress=s.nextLine();
		
		System.out.println("enter the permanent address:");
		String perAddress=s.nextLine();
		
		System.out.println("enter the pincode:");
		int pincode=s.nextInt();
		

	}

}
