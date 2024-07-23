package hybrid_inheritance;
/* 	1.write a program for remaining methods of string(isempty,lastindexof,replace,replaceall,) 
 	2.write a program for matched string function for 4 questions given in class 22
	i.e 1.check given string ends with i for string manish kumar tiwari
	2.check given string starts with m 
	3.check if letter k is present or not
 	4.check if given string tom,has 3 characters or not(as per class 22)*/

public class String_Class 
{
	public static void main(String[] args) 
	{
		String a="School is Vidya1234";
		
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf('c'));
		System.out.println(a.replace('s','D'));
		System.out.println(a.replaceAll("[A-Z]","")); 
	
		String s="Manish Kumar Tiwari";
		System.out.println(s.matches("(.*)i"));//string s has i init
		System.out.println(s.matches("M(.*)"));//string s starts with 'm' or not
		System.out.println(s.matches("(.*)K(.*)"));//check if letter k is present or not
		
		String q="tom";
		System.out.println(q.matches("..."));//check if given string tom,has 3 characters or not
		
		
		
		
		
		
		
		
	}

}
