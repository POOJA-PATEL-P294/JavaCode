package collectionJ;
import java.util.*;
/*Write a addAll method(index int,collection c) program in Arraylist(As per class 31)*/

public class ArrayAll
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Lanka");
		a.add("Nalanda");
		a.add("Taktasheela");
		System.out.println(a);
		
		ArrayList z=new ArrayList();
		z.add("Chikmagaluru");
		z.add("Mantrala");
		System.out.println("before add All "+z);
		System.out.println(z.addAll(1,a));
		System.out.println(z);
		
		
	}

}
