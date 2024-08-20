package collectionJ;

public class Pali 
{

	public static void main(String[] args) 
	{
		String s="rotator";
		String z="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			z=z+c;
		}
		
		if(s.equals(z))
			System.out.println(z+" is palindrome");
		else
			System.out.println(z+" is not palindrome");
	}
}
			
		