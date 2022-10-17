package lecture.p11core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String loc = "lecture/p11core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		System.out.println(s);
		
		System.out.println(d);
		System.out.println(s.getDao());
		
		System.out.println("프로그램 실행 계속");
		
		Controller c = context.getBean(Controller.class);
		Service ser = context.getBean(Service.class);
		
		System.out.println(c);
		System.out.println(ser);
		System.out.println(c.getService());
		System.out.println("계속 실행");
		
		Example1 e1 = context.getBean(Example1.class);
		Example2 e2 = context.getBean(Example2.class);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getEx2());
		System.out.println("~");
		
	}
}
