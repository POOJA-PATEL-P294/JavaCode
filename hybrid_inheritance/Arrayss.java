package hybrid_inheritance;
import java.lang.reflect.Array;

/*Try Out for char  and boolean**/

public class Arrayss
{
	public static void main(String...args)
	{char c[]=new char[3];
		c[0]='m';
		c[1]='y';
		c[2]='b';
		for(int i=0;i<=2;i++)
			System.out.println(c[i]);
		//System.out.println(Array.toString(c));//in char we cant use this methos Array.tostring
		
		boolean q[]=new boolean[2];
		q[0]=true;
		q[1]=false;
		for(int i=0;i<=1;i++)
			System.out.println(q[i]);
		
		//System.out.println(Array.toString(q));
	}

}
