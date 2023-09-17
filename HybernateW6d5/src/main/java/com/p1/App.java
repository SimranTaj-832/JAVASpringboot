package com.p1;

import java.util.List;

public class App {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao();
		Student student=new	Student("Aman","Mahi","mahiaman.com");
		studentDao.saveStudent(student);
		List<Student>students=studentDao.getStudents();
		students.forEach(s->System.out.println("Name: "+s.getFirstName()+" "+s.getLastName()+" Email: "+s.getEmail()));
	}
	
}
