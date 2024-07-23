package hybrid_inheritance;
/*43)Write a program to find out alphabets in a given string (Eg: Name123, 50cents)*/
import java.util.Arrays;

public class Alphabets 
{
	public static void main(String[] args) 
	{
		int count=0;
		String s="50cents";
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			if(b==true) 
			{
				count++;
			}
		}
		System.out.println("The Given String alphabets count is "+count);
	}

}
