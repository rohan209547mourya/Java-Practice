package problem1;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary() - o2.getSalary();
	}
}
