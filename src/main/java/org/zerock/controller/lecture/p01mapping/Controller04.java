package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	
	@RequestMapping("sub01")
	private void method1() {
		System.out.println("메소드1 일함");
	}
	@RequestMapping(value="sub02", method=RequestMethod.GET)
	private void method2() {
		System.out.println("메소드2 일함");
	}
	@RequestMapping(value="sub02", method=RequestMethod.POST)
	public void method3() {
		System.out.println("메소드3 일함");
	}
	@RequestMapping(value="sub03", method= {RequestMethod.GET,RequestMethod.POST})
	public void method4() {
		System.out.println("메소드4 일함");
	}
	
	// 요청 경로 : /ex04/sub04
	// 요청 방식 : get, post
	// 일하는 메소드 작성
	
	@RequestMapping(value="sub04", method = {RequestMethod.GET,RequestMethod.POST})
	public void method5() {
		System.out.println("메소드5 일함");
	}
	
}
