package package1;
//Author POOJA PATEL P
/*Write a program to find the area of circle using a FOR-LOOP where RADIUS is come from (MATH.RANDOM))
 * and PI is come from (MATH.PI). The loop has to execute 10 times
 */
//Author POOJA PATEL P

public class MathClass
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double pi=Math.PI;
		for(int i=1;i<=10;i++)
		{
			double area = pi * Math.random()* Math.random();
			System.out.println("area of circle is " +area);
		}
		
	}

}
