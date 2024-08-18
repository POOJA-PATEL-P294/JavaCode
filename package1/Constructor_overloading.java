package package1;
//--22)Write a program for Custructor Overloading--

public class Constructor_overloading
{
	Constructor_overloading(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of INT is "+c);
	}
	Constructor_overloading(int a,float b)
	{
		this(10,20);
		float c=a+b;
		System.out.println("Addition of FLOAT is "+c);
	}
	Constructor_overloading(int a,double b)
	{
		this(10,15.2f);
		double c=a+b;
		System.out.println("Addition of DOUBLE is "+c);
	}

	public static void main(String[] args)
	{
		Constructor_overloading C= new Constructor_overloading(10,20.85255697);
		
		
	}

}
