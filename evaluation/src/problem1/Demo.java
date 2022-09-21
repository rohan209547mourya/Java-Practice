package problem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> map){
		
		List<Employee> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list , new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getSalary() - o2.getSalary();
			}
		});
		
		
		Map<Employee , String> newMap = new HashMap<>();
		
		for(Employee el : list) {
			
			for(Map.Entry<Employee, String> entry : map.entrySet()) {
				
				if(entry.getKey().equals(el)) {
					
					newMap.put(el, entry.getValue());
				}
			}
			
		}
		
		return newMap;
	}
	
	
	public static void main(String[] args) {
		
		Map<Employee , String> map = new HashMap<>();
		
		map.put(new Employee(14, "Nrupul", 100000), "Banglore");
		map.put(new Employee(342, "Yogesh",200000), "Mumbai");
		map.put(new Employee(243, "Ratan", 45000), "New Delhi");
		map.put(new Employee(131, "Rohan", 293234), "New Delhi");
		map.put(new Employee(392, "Arjun", 341324), "Utter Pardesh");
		
		
		Demo d1 = new Demo();
		
		Map<Employee , String> sortedMap = d1.sortMapUsingEmployeeSalary(map);
		
		
		for(Map.Entry<Employee, String> el : sortedMap.entrySet()) {
			
			System.out.println(el.getKey() + "===========" + el.getValue());
		}
	}
}
