package lecture.p02core;

public class App {
	public static void main(String[] args) {
		
		// 우리가 control
		Servlet1 servlet1 = new Servlet1();
		servlet1.setProductDao(new ProductDao()); // set 필드(의존성- dependency) dependency injection DI // IOC 
		servlet1.doGet();
		
		System.out.println("프로그램 계속진행...");
	}
}