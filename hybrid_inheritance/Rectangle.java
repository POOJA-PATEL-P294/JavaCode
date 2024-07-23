package hybrid_inheritance;
import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {

	public static void main(String...args) 
	{

		Scanner s=new Scanner(System.in);
		int d[]=new int[4];
		
		System.out.println("Enter the length of the Rectangle:");
		for(int i=0;i<4;i++)
		{
			d[i]=s.nextInt();
			d[i]=d[i]+i;
		}
		
	
		System.out.println(d);
	}
	/*	public static int find(int[] d)
		{
			int l=d[0];
			int w=d[1];
			
			if(d[2] == l && d[3] == w)
				return l;
			else if(d[2] == w && d[3]==l)
				return l;
			else
				return -1;
		}*/
	

}
