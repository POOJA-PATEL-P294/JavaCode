package hybrid_inheritance;
import java.util.Arrays;
/*41)Write a Program to copy one array in to another array using iteration*/
public class Copy_String
{
	public static void main(String[] args)
	{
		int i[]=new int[3]; i[0]=89;i[1]=11;i[2]=56;
		int out[]=new int[3];
		
		for(int q=0;q<=2;q++)
		{
			out[q]=i[q];
		}
		System.out.println("old Arrays are "+Arrays.toString(i)+"\n");
		System.out.println("new Arrays are "+Arrays.toString(out)+"\n");
	}

}
