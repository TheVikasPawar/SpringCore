package Spring.SpringCore.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testwired {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring/SpringCore/Autowired/configg.xml");
		
		A a=context.getBean("a", A.class);
		System.out.println(a);
	}

}
