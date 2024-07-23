package hybrid_inheritance;
import java.util.Arrays;
import java.util.Scanner;
//39)try to do indexing for double & boolean data types using Scanner Class.

public class Bool_Double
{
	public static void main(String...args)
	{
		Scanner s=new Scanner(System.in);
		double d[]=new double[3];
		d[0]=s.nextDouble();
		d[1]=s.nextDouble();
		d[2]=s.nextDouble();
		for(int i=0;i<=2;i++)
			System.out.println("double value is "+d[i]);
		System.out.println(Array.toString(d));
		
		boolean b[]=new boolean[2];
		b[0]=b.nextBoolean();
		b[1]=b.nextBoolean();
		d[2]=s.nextDouble();
		for(int i=0;i<=2;i++)
			System.out.println(b[i]);
		
	}
}
