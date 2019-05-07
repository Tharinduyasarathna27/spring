package lk.tharindu.sms.repository;

import java.util.ArrayList;
import java.util.List;

import lk.tharindu.sms.modal.Student;

public class HibernateStudentRepository implements StudentRepository {
	
	@Override
	public List<Student> fetchAllStudents(){
		
		List<Student> students = new ArrayList<>();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Tharindu");
		students.add(student);
		return students;
	}

}
