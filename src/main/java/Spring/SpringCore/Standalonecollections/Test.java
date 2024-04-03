package Spring.SpringCore.Standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring/SpringCore/Standalonecollections/config.xml");
		
		Person person1 =context.getBean("person1", Person.class);
		
		System.out.println(person1);
	}

}
