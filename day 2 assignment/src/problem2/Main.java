package problem2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Student, String> details = new TreeMap<>(new sortByMarks());
		
		details.put(new Student(1, 849, "Nrupul"), "New Delhi");
		details.put(new Student(5, 348, "Arjun"), "Mumbai");
		details.put(new Student(2, 900, "Ankush"), "Pune");
		details.put(new Student(8, 334, "Yogesh"), "Banglore");
		details.put(new Student(3, 932, "Ratan"), "Jammu & Kashmir");
		
		
		for(Map.Entry<Student, String> el : details.entrySet()) {
			
			System.out.println("Student => " + el.getKey() + ", State => " + el.getValue());
		}
	}
}
