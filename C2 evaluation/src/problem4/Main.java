package problem4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				
				"Rohan","Ratan","Aditya","Chavi","Mohit","Pankaj" , "Bobby" , "Sandeep","Bhawana"
				,"Rashmi"
				
				);
		 
		List<String> newList = names.stream()
			 .filter(s -> s.length() % 2 == 0)
			 .map(s -> s.toUpperCase())
			 .collect(Collectors.toList());
		
		
		names.forEach(s -> System.out.println(s));
		System.out.println("========================");
		newList.forEach(s -> System.out.println(s));
	}
}
