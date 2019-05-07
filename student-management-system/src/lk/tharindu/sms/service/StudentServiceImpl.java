package lk.tharindu.sms.service;

import java.util.List;

import lk.tharindu.sms.modal.Student;
import lk.tharindu.sms.repository.HibernateStudentRepository;
import lk.tharindu.sms.repository.StudentRepository;

public class StudentServiceImpl implements StudentService  {

	StudentRepository repository ;
	
	
	 
	public StudentRepository getRepository() {
		return repository;
	}



	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}



	@Override
	public List<Student> fetchAllStudents(){
		return repository.fetchAllStudents();
	}
	
}
