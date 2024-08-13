package work;

import java.util.Comparator;
import java.util.TreeSet;
class Employee{
	private int empid;
	private String ename;
	private double sal;
	Employee(int id,String n,double sa){
		empid=id;
		ename=n;
		sal=sa;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	public String toString() {
		String e;
		e="\n Employee name="+ename+" salary"+sal;
		return e;
	}
}
class EmployeeCmp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee frist=(Employee)o1;
		Employee second=(Employee)o2;
		int diff=(int)(second.getSal()-frist.getSal());
		if(diff==0)
			 diff=(frist.getEname()).compareTo(second.getEname());
		
		return diff;
				
	
	}
	
}
public class TreesetDemo {
 public static void main(String[] args) {
	 EmployeeCmp cmp=new EmployeeCmp();
	 TreeSet hm=new TreeSet(cmp);
	 hm.add(new Employee(101,"vivek",50000));
	 hm.add(new Employee(102,"Ankush",35000));
	 hm.add(new Employee(103,"vicky",50000));
	 hm.add(new Employee(104,"Deewana",45000));
	 System.out.println("contents of employee:"+hm);
 	}
}