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
		a.add(869.78965412369);
		System.out.println(a.contains("Lanka"));
		System.out.println("the size of array "+a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.remove(869.78965412369));
		System.out.println(a);
		System.out.println(a.removeAll(a));
		System.out.println(a);
		
		ArrayList q=new ArrayList();
		q.add("Nalanda");
		q.add("Taktasheela");
		q.addAll(a);
		System.out.println(q);
		
		LinkedList l=new LinkedList();
		l.add("chikmagalur");
		l.add("Nalanda");
		l.add("Taktasheela");
		//l.add(null);
		//l.add(null);
		//l.add('H');
		//l.add(8.33982);
		//l.add(25);
		//System.out.println(Collections.sort(l));
		System.out.println(l.contains("Lanka"));
		System.out.println("the size of array "+l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.remove(8.33982));
		System.out.println(l);
		System.out.println(l.contains("Lanka"));
		System.out.println(l.removeAll(l));
		System.out.println(l);
		
		PriorityQueue p=new PriorityQueue();
		p.add("hamsa");
		p.add("mali");
		p.add("kalki");
		p.add("kalki");
		System.out.println(p.contains("Lanka"));
		System.out.println("the size of array "+p.size());
		System.out.println(p.isEmpty());
		System.out.println(p.remove(8.33982));
		System.out.println(p);
		System.out.println(p.contains("Lanka"));
		System.out.println(p.removeAll(p));
		System.out.println(p);
		
		HashSet h=new HashSet();
		h.add("hamsa");
		h.add("mali");
		h.add("kalki");
		h.add("kalki");
		h.add(789);
		h.add(45.36);
		h.add(null);
		h.add(null);
		System.out.println(h.contains("Lanka"));
		System.out.println("the size of array "+h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.remove(8.33982));
		System.out.println(h);
		System.out.println(h.contains("Lanka"));
		System.out.println(h.removeAll(h));
		System.out.println(h);
		System.out.println(h); 
		
		TreeSet t=new TreeSet();
		t.add("hamsa");
		t.add("mali");
		t.add("kalki");
		t.add("kalki");
		System.out.println(t.contains("Lanka"));
		System.out.println("the size of array "+t.size());
		System.out.println(t.isEmpty());
		System.out.println(t);
		System.out.println(t.contains("Lanka"));
		System.out.println(t.removeAll(t));
		System.out.println(t);
		System.out.println(t);
		
		LinkedHashSet z=new LinkedHashSet();
		z.add("hamsa");
		z.add("mali");
		z.add("kalki");
		z.add("kalki");
		z.add(null);
		z.add(789);
		z.add(45.36);
		z.add(null);
		z.add(null);
		System.out.println(z.contains("Lanka"));
		System.out.println("the size of array "+z.size());
		System.out.println(z.isEmpty());
		System.out.println(z.remove(8.33982));
		System.out.println(z);
		System.out.println(z.contains("Lanka"));
		System.out.println(z.removeAll(z));
		System.out.println(z);
		System.out.println(z);
		
		
	}

}
