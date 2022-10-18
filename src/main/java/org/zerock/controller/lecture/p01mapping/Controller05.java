package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex05")
public class Controller05 {

	@RequestMapping(value="sub01", method=RequestMethod.GET)
	public void method1() {
		System.out.println("method1");
	}
	// @RequestMapping(method=requsetmethod.get)
	@GetMapping("sub02")
	public void method2() {
		System.out.println("method2");
	}
	// @RequestMapping(method=requsetmethod.post)
	@PostMapping("sub03")
	public void method3() {
		System.out.println("method3");
	}
	//	get sub04
	
	@GetMapping("sub04")
	public void method4() {
		System.out.println("method4");
	}
	// post sub05
	@PostMapping("sub05")
	public void method5() {
		System.out.println("method5");
	}
	
}
