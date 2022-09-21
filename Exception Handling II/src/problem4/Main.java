package problem4;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				
				"New Delhi",
				"Chandigarh",
				"Pune",
				"Mumbai",
				"Ahamdabad"
				);
		
		PrintList p1 = k -> {
			
			for(String el : k) {
				
				System.out.println(el);
			}
			
		};
		
		
		p1.display(list);
		
		
	}
}
