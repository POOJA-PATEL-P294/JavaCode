package hybrid_inheritance;

/*26)Write as program for this() calling statement.*/

public class ThisStatement
{
	ThisStatement(int a)
	{
		System.out.println("age is "+a);
	}
	ThisStatement(double w)
	{
		this(23);
		System.out.println("weight is "+w);
	}
	ThisStatement(String name)
	{
		this(50.1);
		System.out.println("Name is "+name);
	}
	{
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new ThisStatement("Payal");

		

	}

}
