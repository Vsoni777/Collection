package work;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeTraverse {
	public static void main(String[] arggs) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("vivek");al.add("sorabh");
		al.add("Ankush");al.add("Vivek");
		al.add("Ankush");
		System.out.println("Celling"+al.ceiling("Vivek"));
		System.out.println("Flooe"+""+al.floor("Aaksh"));
		System.out.println("before treeset"+al);
		Iterator itr=al.descendingIterator();
		System.out.println("After Reverse"+al);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
