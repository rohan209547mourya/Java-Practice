package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
	
	
	
	public static void main(String [] args) {
		
		
		Map<String, Student> hm = new HashMap<>();
		
		hm.put("US", new Student(83, 982, "Aichal", "adsjfkd@gka.com"));
		hm.put("India", new Student(12, 1011, "Bibhu", "Vibhu@gka.com"));
		hm.put("Uk", new Student(33, 239, "Cyan", "ryan@gka.com"));
		hm.put("Arab", new Student(29, 142, "Dakir", "zakir@gka.com"));
		hm.put("China", new Student(012, 338, "Eim", "kim@gka.com"));
	
		
		SortMap m1 = map -> {
			
			Map<String , Student> temp = new HashMap<>();
			List<Student> list = new ArrayList<>();
			
			
			for(Entry<String, Student> el : map.entrySet()) {
				
				list.add(el.getValue());
			}
			
			Collections.sort(list , (s1 , s2) -> s2.getName().compareTo(s1.getName()));
			
			for(Student el : list) {
				
				for(Entry<String , Student> entry: map.entrySet()) {
					
					if(entry.getValue().equals(el)){
						
						temp.put(entry.getKey() , el);
					}
				}
			}
			
			return temp;
		};
		
		Map<String , Student> sortedMap =  m1.sortMapUsingStudentName(hm);
		
		System.out.println(sortedMap);
	}
}
