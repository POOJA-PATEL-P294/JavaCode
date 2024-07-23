package package1;
import java.util.Scanner;
//Utilise All methods of scanner class  

public class UtilScanner
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=s.nextLine();
		
		System.out.println("enter your age");
		byte age=s.nextByte();
		
		System.out.println("enter your salary");
		short w=s.nextShort();
		
		System.out.println("enter your phone number");
		long p_number=s.nextLong();
		
		System.out.println("enter your pincode");
		int pincode=s.nextInt();
		
		System.out.println("enter weight");
		float weightt=s.nextFloat();
		
		System.out.println("your entered information TRUE OR FALSE");
		boolean b=s.nextBoolean();

	}

}
