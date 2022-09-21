package problem4;

import java.util.Comparator;

public class sortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student a , Student b) {
		
		return a.getMarks() - b.getMarks();
	}
	
	
}
