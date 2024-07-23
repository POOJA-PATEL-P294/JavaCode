package hybrid_inheritance;
/*try hybrid level inheritance conceptWrite a program for hybrid level inheritance with 4
classes,method to any class,check whether it is acheviable or not?*/

public class Class2 extends Super_Class 
{
	void mul()
	{
		int a=45,c=a*a;
		System.out.println("multiplication is "+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Class2 c=new Class2();
		c.add();
		c.mul();

	}

}
