package question1;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Delhi");
		arr.add("Mumbai");
		arr.add("Channai");
		arr.add("Banglaure");
		arr.add("Pune");
		
		
		// Using For Loop
		for(int i = 0; i < arr.size(); i++) {
			
			System.out.println("Using for loop: " + arr.get(i));
		}
		
		// Using enhanced for loop
		for(String el : arr) {
			
			System.out.println("Using enhanced for loop: " + el);
		}
		
		
		// Using Iterator 
		
		Iterator<String> it = arr.iterator();
		
		
		while(it.hasNext()) {
			
			System.out.println("Using Iterator: " + it.next());
		}
	}
}
