package StudentData;

import java.util.Comparator;

public class SortbyMarks implements Comparator<Student>{
		public int compare(Student a,Student b) {
			return a.Marks-b.Marks;
		}

}
