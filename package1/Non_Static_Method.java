package package1;
//call multiple non static method

public class Non_Static_Method 
{
	void add()
	{
		System.out.println("Non-Static method-1");
	}
	void sub()
	{
		System.out.println("Non-Static method-2");
	}
	void mul()
	{
		System.out.println("Non-Static method-3");
	}
	void div()
	{
		System.out.println("Non-Static method-4");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Non_Static_Method nsm= new Non_Static_Method();
		nsm.add();
		nsm.sub();
		nsm.mul();
		nsm.div();
	}

}
