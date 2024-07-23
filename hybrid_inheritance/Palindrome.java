package hybrid_inheritance;
import java.util.Scanner;

/*40)Write a program to verify if the given String is a Palindrome (Eg: Madam, Radar, Mom, Wow, Dad)*/

public class Palindrome
{
	public static void main(String...args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string for palidrome");
		String z=s.next();
		String a="";
	
		for(int i=z.length()-1;i>=0;i--)
		{
			char c=z.charAt(i);
			a=a+c;
		}
		
		if(z.equals(a))
			System.out.println("String is palidrome ");
		else
			System.out.println("string is not palindrome ");
		
		System.out.println(a);
		s.close();
	}

}
