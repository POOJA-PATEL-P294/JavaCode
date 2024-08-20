package package1;
import hybrid_inheritance.AccessSpefic;

/*29)Write a program for what happens outside package by becoming subclass (as per class 17) */

public class OutsidePackage extends AccessSpefic
{
	
	public static void main(String[] args)
	{
		AccessSpefic.add();
		AccessSpefic.sub();
		//AccessSpefic.mul();
		//AccessSpefic.div();

	}

}
