package work;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> al=new HashMap<Integer,String>();
		al.put(1, "Ankush");
		al.put(2, "bablu");
		al.put(3,"caty");
		al.put(4, null);
		al.put(5,"Ankush");
		al.put(2, "bablu");
		System.out.println(al);
		al.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
}
