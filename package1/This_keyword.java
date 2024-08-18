package package1;
//--49)WAP to showcase the this keyword---

public class This_keyword
{
	private int a;
	private int b;
	void show(int a, int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		This_keyword t=new This_keyword();
		t.show(10, 20);

	}

}
