package collectionJ;
import java.util.*;
/*49)Write a -all method programm for ArrayList,LinkedList,Vector,Priority Queue,HashSet,treeSet,LinkedHashSet and check wheather it 
is accepting Index,Null,Duplicate,Sort,Order of index,Dynamic, Hetrogenius values(As per class30)*/
public class ArrayL
{
	public static void main(String...args) 
	{
		ArrayList a=new ArrayList();
		a.add("Lanka");
		a.add("Nalanda");
		a.add("Taktasheela");
		a.add(null);
		a.add("Nalanda");
		a.add("Taktasheela");
		a.add(869.78965412369);
		System.out.println(a);
		
		LinkedList l=new LinkedList();
		l.add("chikmagalur");
		l.add(null);
		l.add(null);
		l.add('H');
		l.add(8.33982);
		l.add(25);
		System.out.println(l);
		
		PriorityQueue p=new PriorityQueue();
		p.add("hamsa");
		p.add("mali");
		System.out.println(p);
		
		HashSet h=new HashSet();
		h.add(89.3695);
		System.out.println(h);
	}

}
