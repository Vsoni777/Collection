package work;

import java.util.Vector;

public class VectorListDemo {
	public static void main(String[] args) {
		Vector <Integer>al=new Vector<Integer>(5);
		al.addElement(23);
		al.addElement(29);
		al.addElement(34);
		al.addElement(12);
		al.addElement(11);
		System.out.println(al);
		/*al.remove(23);
		al.remove(1);//remove index value affect
		System.out.println(al);*/
		al.removeElementAt(3);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.elementAt(i)+" ");
		}
		System.out.println();
		System.out.println("For each demo");
		for(int x:al) {
			System.out.print(x+" ");
		}
		
	}
}
