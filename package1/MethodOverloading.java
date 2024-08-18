package package1;

public class MethodOverloading 
{


	void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of INT is "+c);
	}

	void add(int a, float b)
	{
		float c=a+b;
		System.out.println("Addition of FLOAT is "+c);
	}

	void add(int a, double b)
	{
		double c=a+b;
		System.out.println("Addition of DOUBLE is "+c);
	}
	public static void main(String[] args)
	{
		MethodOverloading m= new MethodOverloading();
		m.add(10, 30);
		m.add(40, 12.5f);
		m.add(10, 14.7);

	}

}
