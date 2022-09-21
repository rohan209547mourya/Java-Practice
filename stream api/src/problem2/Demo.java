package problem2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				
				new Student("S1",345),
				new Student("S2",453),
				new Student("S3",238),
				new Student("S4",457),
				new Student("S5",292),
				new Student("S6",234)				
				);
			
		Optional res = list.stream()
						.max((s1 , s2) -> s1.getMarks() - s2.getMarks()); 

		 System.out.println(res.get());

	}
}
