package package1;
/*"Using Scanner Class please execute below problems:
*(Area of circle, Circumferance of circle, Area of square, Area of reactangle, Area of trinagle, Area of
trepezium, Circumferance of square, Circumferance of reactangle, Circumferance of trinagle, Circumferance of
 trepezium)"*/

import java.util.Scanner;
public class Area
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double pi=Math.PI;
		Scanner s=new Scanner(System.in);
		double r=0, w=0,k=0;
	
		System.out.println("enter the area of circle values\n");
		r=s.nextDouble();
		double area = pi * r * r;
		System.out.println("Area of cicle is " +area);

		System.out.println("\nenter the circumference of circle values");
		r=s.nextDouble();
		area = pi * 2 * r;
		System.out.println("Area of cicle is " +area);
		
		System.out.println("\nenter the Area of square");
		r=s.nextDouble();
		area = r * r;
		System.out.println("Area of Square is " +area);
		
		System.out.println("\nenter the Area of reactangle lenth and width");
		r=s.nextDouble();w=s.nextDouble();
		area = r * w ;
		System.out.println("Area of reactangle " +area);
		
		System.out.println("\nenter the Area of Triangle");
		r=s.nextDouble();
		w=s.nextDouble();
		area = (0.5)*r * w;
		System.out.println("Area of triangle is " +area);
		
		System.out.println("\nenter the Area of trepezium values");
		r=s.nextDouble();w=s.nextDouble();double h=s.nextDouble();
		area = 0.5*(r+w)*h;
		System.out.println("Area of trepezium is " +area);
		
		System.out.println("\nenter the Circumferance of square");
		r=s.nextDouble();
		area = 4 * r;
		System.out.println("Circumferance of square " +area);
		
		System.out.println("\nenter the Circumferance of reactangle");
		r=s.nextDouble(); w=s.nextDouble();
		area = 2*r +2*w;
		System.out.println("Circumferance of reactangle " +area);
		
		
		System.out.println("\nenter the Circumferance of trinagle");
		r=s.nextDouble(); w=s.nextDouble();k=s.nextDouble();
		area = r +w+k;
		System.out.println("Circumferance of trinagle " +area);
		
		System.out.println("\nenter the Circumferance of trepezium");
		r=s.nextDouble(); w=s.nextDouble();k=s.nextDouble();double d=s.nextDouble();
		area = r +w+k+d;
		System.out.println("Circumferance of trepezium " +area);
		
		
	}

}
