package lecture.p01lombok;

import lombok.Data;

@Data // 아래 5f개의 어노테이션을 한번에 적용
//@RequiredArgsConstructor
//@Tostring
//@getter
//@setter
//@equalsandhashcode
public class JavaBean5 {
	private String name;
	private int score;
}
