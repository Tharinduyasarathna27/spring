package lk.tharindu.sms.repository;

import java.util.List;

import lk.tharindu.sms.modal.Student;

public interface StudentRepository {

	List<Student> fetchAllStudents();

}