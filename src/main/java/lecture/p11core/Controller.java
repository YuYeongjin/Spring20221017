package lecture.p11core;

import org.springframework.stereotype.Component;

@Component
public class Controller {
	private Service service;

	
	public Controller(Service service) {
		this.service=service;
	}
	
	public Service getService() {
		return service;
	}
}
