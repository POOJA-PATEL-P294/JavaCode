package hybrid_inheritance;



public class AccessSpefic
{
	public static void add()
	{
		System.out.println("1");
	}
	protected static void sub()
	{
		System.out.println("2");
	}
	private static void mul()
	{
		System.out.println("3");
	}
	static void div()
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		add();
		//sub();
		mul();
		div();
	}

}
