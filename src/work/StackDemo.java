package work;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
 public static void main(String[] args) {
	 Stack<String> al=new Stack<String>();
	 al.push("shambhu");
	 al.push("Mahadev");
	 al.push("Sidheshwar");
	 al.push("Mahakal");
	 al.push("shambhu");
	// Collections.reverse(al);
	 System.out.println(al);
	 System.out.println(al.pop());
	 System.out.print(al.capacity());
	 System.out.println(al.peek());

 }
}
