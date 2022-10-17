package lecture.p14core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lecture.p14core")
public class Config {
	@Bean
	public Controller controller() {
		return new Controller(dao());
	}
	@Bean
	public Servlet servlet() {
		Servlet s = new Servlet();
		s.setDao(dao());
		return new Servlet();
	}
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
