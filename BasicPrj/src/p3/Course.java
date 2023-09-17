package p3;

import java.util.Arrays;

public class Course {
	String CourseName[]=new String[3];
	int duration[] =new int[3];
	public String[] getCourseName() {
		return CourseName;
	}
	public void setCourseName(String[] courseName) {
		CourseName = courseName;
	}
	public int[] getDuration() {
		return duration;
	}
	public void setDuration(int[] duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course Name=" + Arrays.toString(CourseName) + ", duration=" + Arrays.toString(duration) + "";
	}
		
}
