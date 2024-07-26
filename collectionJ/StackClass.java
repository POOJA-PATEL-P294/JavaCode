package collectionJ;
import java.util.Stack;

/*54)Utilizing Stack methods as:push(),pop(),peek()*/

public class StackClass 
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("Hampi");
		s.push("Yellora");
		s.push("Ajanta");
		s.push(257);
		s.push(8.96);
		System.out.println(s);
		System.out.println("\nit looking for last element "+s.peek());
		System.out.println("\nit popped last element "+s.pop());
		System.out.println("\nit popped last element "+s.pop());
	}

}
