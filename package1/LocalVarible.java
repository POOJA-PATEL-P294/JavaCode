package package1;
//-24)Write a program for local Variable---

public class LocalVarible 
{
	void show()
	{
		int local_value;
		//System.out.println("before"+local_value);
		local_value=100;
		System.out.println("afetr "+local_value);	
	}

	
	public static void main(String[] args)
	{
		LocalVarible c=new LocalVarible();
		c.show();

	}

}
