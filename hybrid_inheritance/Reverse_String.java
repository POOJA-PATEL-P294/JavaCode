package hybrid_inheritance;
/*42)Write a Program to reverse a string using iteration*/


public class Reverse_String 
{
	public static void main(String[] args)
	{
		String s="WELCOME";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);

	}

}
