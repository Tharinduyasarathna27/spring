package lk.tharindu.sms;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lk.tharindu.sms.modal.Student;
import lk.tharindu.sms.service.StudentService;

public class Application {
 
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//StudentService service = new StudentServiceImpl();
		StudentService service = context.getBean("studentService",StudentService.class);
		List<Student> students = service.fetchAllStudents();
			
		for (Student student : students) {
			System.out.println(student.getName());
		}
		
	}
}
