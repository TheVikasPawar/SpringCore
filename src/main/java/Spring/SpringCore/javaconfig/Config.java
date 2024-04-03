package Spring.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
	

}
