package work;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(5);
		al.add("vivek");
		al.add("Soni");
		al.add("Vicky");
		al.add("Aayush");
		al.add("Atul");
		
		System.out.println(al.get(0));
		System.out.println("Size of ArrayList:"+al.size());
		al.set(4, "jivan");
		System.out.println(al);
		System.out.println("Size of ArrayList:"+al.size());
		al.remove(2);
		System.out.println(al);
		System.out.println("Size of ArrayList:"+al.size());
		/*al.set(2, "Soni");
		System.out.println(al);
		System.out.println("Size of ArrayList:"+al.size());
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("for each");
		for(String x:al) {
			
			System.out.print(x+" ");
		}*/
	}

}
