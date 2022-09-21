package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		
		LinkedHashMap<String, Student> sortedMap = new LinkedHashMap<>();
	    ArrayList<Student> list = new ArrayList<>();
	    
	    
	    map.put("New Delhi", new Student(21, 432, "Ratan"));
	    map.put("Rajasthan", new Student(43, 923, "Krutika"));
	    map.put("Bihar", new Student(53, 235, "Anand"));
	    map.put("Utter Pardesh", new Student(11, 912, "Mohit"));
	    map.put("Maharashtra", new Student(73, 823, "Rohan"));
	    map.put("Goa", new Student(12, 372, "Nrupul"));

  
	    for (Map.Entry<String, Student> entry : map.entrySet()) {
	         list.add(entry.getValue());
	     }
	    
	    Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				
				return o1.getMarks() - o2.getMarks();
			}
	      });
	    
	      for (Student el : list) {
	         for (Entry<String, Student> entry : map.entrySet()) {
	            if (entry.getValue().equals(el)) {
	               sortedMap.put(entry.getKey(), el);
	            }
	         }
	      }
	      System.out.println(sortedMap);
	}
	      
}
