package lecture.p10core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String loc = "lecture/p10core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Service s = context.getBean(Service.class);
		Controller c = context.getBean(Controller.class);
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(c.getService());
		
		System.out.println("실행실행");
		
	}
}
