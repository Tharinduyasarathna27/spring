package lk.tharindu.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.tharindu.sms.modal.Student;
import lk.tharindu.sms.repository.HibernateStudentRepository;
import lk.tharindu.sms.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService  {

	
	StudentRepository repository ;
	
	
	 
	public StudentServiceImpl() {
		System.out.println("Default constructor fired");
	}

	
	
	public StudentServiceImpl(StudentRepository repository) {
		
		this.repository = repository;
	}



	public StudentRepository getRepository() {
		return repository;
	}



	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}



	@Override
	public List<Student> fetchAllStudents(){
		return repository.fetchAllStudents();
	}
	
}
