package collectionJ;

import java.util.Arrays;
import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		double area =0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 4 length of the rectangle- ");
        double a[] = new double [4];
        
        for (int i =0; i<4 ;i++)
        {
                a[i] = s.nextDouble();                        
        }
        area = a[0] * a[1];
        System.out.println(area);
        System.out.println(Arrays.toString(a));

	}

}
