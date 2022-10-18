package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {
		
	
	// 좀 더 구체적으로 requsetmapping을 작성한 메소드가 우선권
	// @RequestMappint(value="sub01", method=RequsetMethod.GET)
	@GetMapping("sub01")
	public void method1() {
		System.out.println("method1");
	}
	@RequestMapping("sub01")
	public void method2() {
		System.out.println("method2");
	}
}
