package Spring.SpringCore.Steorotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring/SpringCore/Steorotype/config.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}

}
