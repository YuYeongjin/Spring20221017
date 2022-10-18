package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Controller03 {
	
	@RequestMapping({"sub01","sub02","sub03"})
	public void method1() {
		System.out.println("ex03 method1");
	}
	@RequestMapping({"sub04","sub05"})
	// /ex03/sub04
	// /ex03/sub05
	public void method2() {
		System.out.println("ex03 method2");
	}
//	@RequestMapping("sub06")
	@RequestMapping(value="sub06")
	public void method4() {
		
	}
	@RequestMapping(path="sub07")
	public void method5() {
		
	}
}
