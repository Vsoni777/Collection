package work;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	sunday,monday,tuesday,wednesday,THURSDAY, FRIDAY, SATURDAY  
}
public class EnumDemo {
	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.FRIDAY, days.SATURDAY);
		Iterator<days> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println("iterate "+itr.next());
		}
		System.out.println(set);
		Set<days> set1=EnumSet.allOf(days.class);
		  System.out.println("Week Days:"+set1);  
	      Set<days> set2 = EnumSet.noneOf(days.class);  
	      System.out.println("Week Days:"+set2); 
	}
}
