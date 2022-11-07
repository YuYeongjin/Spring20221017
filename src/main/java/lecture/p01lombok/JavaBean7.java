package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final 필드 초기화하는 생성자 생성
@AllArgsConstructor
//@NoArgsConstructor
public class JavaBean7 {

	private final String name;
	private final int age;
	private String address;
	

}
