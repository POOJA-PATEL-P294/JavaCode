package collectionJ;
/*WAP to show try catch handling inside 1 try block*/
public class InsideTryCatch {

	public static void main(String[] args)
	{
		try
		{
			int result=10/0;
			System.out.println("The result is "+result);
			try
			{
				int r=10/0;
				System.out.println("The result is "+r);
				
			}
			catch(Exception e) 
			{
				System.out.println("Divided by zero");
				
			}
		}
		catch(Exception e) 
		{
			System.out.println("Divided by zero");
			
		}

	}

}
