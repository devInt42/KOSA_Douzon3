package ex02.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("person.xml");
		StudentViewImpl student = (StudentViewImpl) ctx.getBean("student");
		student.print();
		EmployeeViewImpl employee = (EmployeeViewImpl) ctx.getBean("employee");
		employee.print();
	}
}
