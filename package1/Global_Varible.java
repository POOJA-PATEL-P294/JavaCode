package package1;
//24)Write a program for global Variable---LocalVarible
public class Global_Varible
{
	int global_value;


public static void main(String[] args)
{
	Global_Varible l=new Global_Varible();
	System.out.println("before "+l.global_value);
	l.global_value=100;
	System.out.println("after "+l.global_value);

}
}
