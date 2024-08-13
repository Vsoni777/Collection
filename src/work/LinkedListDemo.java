package work;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
		al.add("shiva");
		al.add("Mahadev");
		al.add("shambhu");
		al.add("Mahakal");
		al.add("shiva");
		System.out.println("linked list size:"+al.size());
		System.out.println("linkedlist content"+al.remove(4));
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
