package Spring.SpringCore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	
	public void study() {
		System.out.println("Student is reading book.");

	}
	

}
