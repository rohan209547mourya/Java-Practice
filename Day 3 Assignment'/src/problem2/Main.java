package problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	
	
	static int calculateAge(LocalDate birthDate) {
		
		
		LocalDate currentDate = LocalDate.now();
		
		if(!birthDate.isBefore(currentDate)) {
			
			System.out.println("Date should not be in Future");
			
			return 0;
		}
		
		if ((birthDate != null) && (currentDate != null))
			
	        return Period.between(birthDate, currentDate).getYears();
		else
			
	        return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		try {
			
			LocalDate birthDate = LocalDate.parse(input);
			
			System.out.println(calculateAge(birthDate));
		}
		catch(DateTimeParseException ex){ 
			
			System.out.println("Please enter the date in correct format");
		}
		
		
	}
}
