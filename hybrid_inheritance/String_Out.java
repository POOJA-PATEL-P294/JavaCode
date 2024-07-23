package hybrid_inheritance;
import java.util.Arrays;
/*44)Write a program to find out whitespaces, numeric values 
 * and special characters in a given  string (Eg: Name123, 50cents) */

public class String_Out 
{
	public static void main(String[] args)
	{
		int c1=0,c2=0,c3=0;
		String s="17 octomber 2024 ^@$~9*&";
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b1=Character.isAlphabetic(c[i]);
			boolean b2=Character.isDigit(c[i]);
			boolean b3=Character.isWhitespace(c[i]);
			if(b1==true)
				c1++;
			if(b2==true)
				c2++;
			if(b3==true)
				c3++;
		}
		System.out.println("Total number of alphabets "+c1);
		System.out.println("Total number of numberic "+c2);
		System.out.println("Total number of space "+c3);
		
		int special=s.length()-(c1+c2+c3);
		System.out.println("Total number of Special characters "+special);
		
	}

}
