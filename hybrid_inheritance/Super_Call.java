package hybrid_inheritance;
/*25)Write a program for super() calling staement for parameterized and non parameterized.*/
class Test
{
	int x,y;
	Test()
	{
		x=100;
		y=200;
	}
	Test(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Super_Call extends Test
{
	int a,b;
	
	Super_Call()
	{
		this(9,99);
	}
	Super_Call(int a,int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Super_Call s=new Super_Call();
	
		s.display();
	}

}
