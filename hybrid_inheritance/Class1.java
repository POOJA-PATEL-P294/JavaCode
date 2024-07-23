package hybrid_inheritance;
/*try hybrid level inheritance conceptWrite a program for hybrid level inheritance with 4
classes,method to any class,check whether it is acheviable or not?*/

class Super_Class
{
	void add()
	{
		int a=10, b=50,c=a+b;
		System.out.println("Addition is "+c);
	}
}
class Sub_Class extends Super_Class
{
	void sub()
	{
		int a=70, b=45,c=a-b;
		System.out.println("Subtraction is "+c);		
	}
}

public class Class1 extends Sub_Class
{
	public static void main(String...args)
	{
		Class1 c=new Class1();
		c.add();
		c.sub();
	}

}
