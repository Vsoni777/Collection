package Mapwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> al=new HashMap<Integer,String>();
		Map<Integer,String> aa=new HashMap<>();
		//String str="";
		System.out.println("Map 1");
		al.put(10, "Demo1");
		al.put(11,"Demo2");
		al.put(12, "Demo3");
		System.out.println("Enter key value");
		int key=sc.nextInt();
		System.out.println(al.containsKey(key));//it reurn true;
		System.out.println("Enter String");
		String str=sc.next();
		boolean iscontain=al.containsKey(key);
		if(iscontain!=false) {
			al.put(key,str );
		}
		
		System.out.println(al);
		System.out.println("now if want to delete");
		System.out.println("Enter key");
		key=sc.nextInt();
		iscontain=al.containsKey(key);
		if(iscontain!=false) {
			al.remove(key);
			System.out.println(al);
		}else {
			System.out.println("Enter innvalid key");
		}
//		System.out.println("Map 2");
//		for(int i=5;i<10;i++) {
//			System.out.println("Enter String value");
//			str=sc.next();
//			aa.put(i, str);
//		}
		//System.out.println("Map2 "+aa);
		//al.putAll(aa);
		
		//System.out.println(al);
	}
}
