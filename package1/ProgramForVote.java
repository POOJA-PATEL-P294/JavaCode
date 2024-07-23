package package1;

/*Write a Program to find the vote eligibility for a person whose age is 17.Then run the same
 * program for age=25 */
 
public class ProgramForVote 
{
	public static void main(String[] args)//main class
	{
		int age=18; // variable declaration and initialization
		
		if(age>=25) //checking if age able to vote or not
			System.out.println("Vote is not eligible for this person");
		else
			System.out.println("Vote is eligible for this person");
		
		}// end of IF block

}//end of program
