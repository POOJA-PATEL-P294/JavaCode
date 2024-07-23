package package1;

/* write a program  to calculate the AREA and CIRCUMFERENCE OF CIRCLE in a different methods and then
 * call them in the main method */

public class AreaAndCircumference 
{
	public static float pi=3.14f;
	public static int r=15;
	
	public static void Area()
	{ 
		float area = r * pi * r;
		System.out.println("Area of circle = " +area);
	}

	public static void Circumference()
	{ 
		float circum = 2 * pi * r;
		System.out.println("circuference of circle = " +circum);	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area();
		Circumference();
	}
}
