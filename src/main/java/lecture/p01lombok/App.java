package lecture.p01lombok;

public class App {
	public static void main(String[] args) {
		System.out.println("메인 메소드");
		
		JavaBean1 j1 = new JavaBean1();
		j1.setName("jisung");
		j1.setAddress("seoule");
		j1.setAge(30);
		String name1 = j1.getName();
		
		
		JavaBean2 j2 = new JavaBean2();
		j2.setCompany("tesla");
				
				;
		String company2 = j2.getCompany();
		int score2 = j2.getScore();
		String location2 = j2.getLocation();
		
		
		JavaBean4 j4 = new JavaBean4();
		j4.setAddress("seoul");
		
		System.out.println(j4.toString());
	}
}
