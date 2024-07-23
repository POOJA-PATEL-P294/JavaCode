package package1;
//Multi level inheritance for Non-static method 


class First
{
	void sum()
	{
		System.out.println("class First");
	}
}

class Second extends First
{
	void add()
	{
		System.out.println("class Second");
	}
}
public class MultiLevel extends Second
{
	void mul()
	{
		System.out.println("class Multilevel");
	}
	public static void main(String[] args)
	{
		MultiLevel m=new MultiLevel();
		m.sum();
		m.add();
		m.mul();
		
	}

}
