package org.zerock.controller.lecture.p03forward;

import javax.imageio.IIOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
	// 1 요청
	// 2,3 리퀘스트 파라미터 수집/ 가공
	// 4 business logic
	// 5 add attribute
	// 6 forward/redirect
	
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("메소드 1번 일함!");
		String path = "/WEB-INF/views/ex14/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, res);
		
	}
	
	@RequestMapping("sub02")
	public String method2() {
		System.out.println("method2 일함");
		
		return "abc";
	}
	// sub03 경로 
	// /WEB-INF/view/xyz.jsp 메소드 작성
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("메소드 3번 일함");
		return "xyz";
	}
	
	@RequestMapping("sub04")
	public String method4() {
		
		
		// /WEB-INF/views/ex14/sub04.jsp	
		return "ex14/sub04";
	}
	// sub05 경로 /WEB-INF/views/ex14/sub05.jsp	로 forward
	
	@RequestMapping("sub05")
	public String method5() {
		
		return "ex14/sub05";
	}
	
	
	
}
