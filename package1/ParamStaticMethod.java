package package1;

/* write a program with PARAMETERIZED STATIC METHOD using CHAR & BOOLEAN as parameter */

public class ParamStaticMethod 
{
	public static void staticMethod(char character, boolean isUppercase)
	{
		System.out.println("The character is " +character);
		
		if(isUppercase)
			System.out.println("The character is UpperCase "+character);
		else
			System.out.println("The character is LowerCase "+character);
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		staticMethod('A',true);
		staticMethod('z',false);

	}

}
