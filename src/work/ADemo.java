package work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ADemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter List element:");
		for(int i=0;i<5;i++) {
			System.out.println(i+".Enter number: "+al.add(sc.nextInt()));
		}
		System.out.println("Enter List element:");
		ArrayList<Integer> al1=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println(i+".Enter number: "+al1.add(sc.nextInt()));
		}
		System.out.println(al.addAll(al1));
		System.out.println(al1.addAll(1, al)); //not working because it return boolean value but we have object value
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
