package hybrid_inheritance;
/*/*Write a program using with abstract class-Abstract class
 *  (2 abstract methods,2 concrete methods) 
 * and class have 2 concrete methods(As per class 20 )
*/

abstract class Parent
{
	abstract void add();
	abstract void sub();
	
	void mul()
	{
		System.out.println("\nHello Parent mul");
	}
	void div()
	{
		System.out.println("\nHello Parent div");
	}
	
}
public class Override_C extends Parent
{

	void add() 
	{
		System.out.println("\nHello Child");
	}
	void sub() 
	{
		System.out.println("\nHello Child");
	}
	public static void main(String[] args)
	{
		Override_C c=new Override_C();
		c.add();
		c.sub();
		c.div();
		c.mul();
	}

}
