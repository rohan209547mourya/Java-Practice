package problem2;

import java.util.Comparator;

public class sortByMarks implements Comparator<Student>{
	
	public int compare(Student a , Student b) {
		
		return a.getMarks() - b.getMarks();
	}
}
