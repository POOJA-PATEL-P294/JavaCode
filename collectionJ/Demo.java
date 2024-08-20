package collectionJ;
import java.util.Arrays;
import java.util.Scanner;
/*"In a array of 4 size store four values in it from human input and consider those 4 values are the 4 length of the rectangle.
Please a logic to find out the area for the same[write the program in eclipse and copy paste the program here]"*/
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
