package collectionJ;

public class aaaa {

	public static void main(String...args)
	{
		String s="rotator";
		String z="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			z=z+c;
			
		}
		System.out.println(z);
		boolean result=s.equals(z);
		
		if(result==true)
			System.out.println(" It is palindrome");
		else
			System.out.println("it  is not palindrome");
	}

}
