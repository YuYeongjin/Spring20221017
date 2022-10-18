package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {

	@GetMapping("sub01")
	public void method1() {
		System.out.println("method1");
	}
	@GetMapping(value="sub01", params="name")
	public void method2() {
		System.out.println("method2");
	}
	
	//get sub02 경로
	@GetMapping("sub02")
	public void method3() {
		System.out.println("method3");
	}
	//get sub02 경로 'address' requset parameter
	@GetMapping(value="sub02", params ="address")
	public void method4() {
		System.out.println("method4");
	}
	@GetMapping(value="sub03", params ="address")
	public void method5() {
		System.out.println("method5");
	}
	@GetMapping(value="sub03", params ="address=seoul")
	public void method6() {
		System.out.println("method6");
	}
	@GetMapping(path="sub03")
	public void method7() {
		System.out.println("method7");
	}
	@GetMapping(path="sub04")
	public void method08() {
		System.out.println("method8");
	}

	@GetMapping(path="sub04" , params= {"name","age"})
	public void method09() {
		System.out.println("method9");
	}

	
}
