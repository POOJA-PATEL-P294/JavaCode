package collectionJ;

public class Exam1 
{

	public static void main(String[] args)
	{
		String s="pooja 123 @#%";
		int c1=0, c2=0,c3=0;
		char c[]=s.toCharArray();
		
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
		System.out.println("no of alphabets "+c1);
		System.out.println("no of digit "+c2);
		System.out.println("no of space "+c3);
		
		int special=s.length()-(c1+c2+c3);
		System.out.println("no of Special characters "+special);
		

		
	

	}

}
