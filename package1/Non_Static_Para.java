package package1;
//19)Write a program with parameterized non-static method using  parameters and try to call in main method ---- 

public class Non_Static_Para 
{
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	public static void main(String[] args)
	{
		Non_Static_Para n= new Non_Static_Para();
		n.add(20, 40);
	}

}
