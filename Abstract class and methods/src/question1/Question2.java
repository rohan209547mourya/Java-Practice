package question1;

import java.util.Scanner;

public class Question2 {
	
	double calulateAverageAge(int[] age) {
		
		int total = 0;
		
		for(int i : age) {
			
			total += i;
		}
		
		double res = total / age.length;
		
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of employee: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		if(n < 2) {
			
			System.out.println("Please enter a vaild employee count!");
			
		}
		else {
			
			int i = 0;
			
			System.out.println("Enter the for " + n + " Employee: ");
			
			int[] arr = new int[n];
			
			while(i < n) {
				
				int age = sc.nextInt();
				
				arr[i] = age;
				
				i++;
			}
			
			Question2 cal = new Question2();
			
			double averageAge = cal.calulateAverageAge(arr);
			
			System.out.println("The average age is " + averageAge);
		}
		
		
	}
}
