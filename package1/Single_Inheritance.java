package package1;

class Parent_Inherit
{
	static void house()
	{
		System.out.println("parent has house");
	}
	
}
public class Single_Inheritance extends Parent_Inherit
{
	static void show()
	{
	
		System.out.println("hello main method");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		house();
		show();
		
	}

}
