package hybrid_inheritance;
import java.util.Arrays;

/*46)Write a Program to reverse Array using iteration*/
public class Reverse_Array
{
	public static void main(String[] args)
	{
		int array[]={89,11,56,52};//new int[3]; array[0]=89;array[1]=11;array[2]=56;
		int[]  r= new int[array.length];
		int z=0;
		
		System.out.println("before reverse array\n"+Arrays.toString(array)+"\n");
		
		for(int i=array.length-1;i>=0;i--)
		{
			r[z++]=array[i];
		}
		System.out.println("after reverse array\n"+Arrays.toString(r)+"\n");

	}	

}
