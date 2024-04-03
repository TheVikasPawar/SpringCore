package Spring.SpringCore.Steorotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{656+52}")
	private int name;
	@Value("Pune")
	private String city;
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
