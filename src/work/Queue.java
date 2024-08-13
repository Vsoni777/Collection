package work;

import java.util.PriorityQueue;

public class Queue {
   public static void main(String[] args) {
	   PriorityQueue<String> al=new PriorityQueue<String>();
	   al.add("Ankush");
	   al.add("Bablu");
	   al.add("caty");
	   al.add("Dharm");
	   System.out.println("value of Queue"+al);
	   System.out.println("head of Queue"+ al.element());
	   System.out.println("head of Queue remove "+ al.remove());
	   System.out.println("Queue return queue class "+ al.getClass());
	   System.out.println("polling Queue "+ al.poll());
	   System.out.println("value of Queue"+al);
	   
   }
}
