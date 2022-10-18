package org.zerock.controller.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {

	@GetMapping("sub01")
	public void method1(@RequestParam(name = "address") String a) {

	}

	// sub02 경로
	// get 방식
	// name request param을 받을 수 있는 @RequsetParam

	@GetMapping("sub02")
	public void method2(@RequestParam(value = "name") String s) {
		System.out.println(s);
	}

	@GetMapping("sub05")
	public void method3(@RequestParam("name") String a, @RequestParam("address") String b) {
		System.out.println("name : " + a);
		System.out.println("address : " + b);
	}

	@GetMapping("sub06")
	public void method4(@RequestParam("q") String a, @RequestParam("age") String b) {
		System.out.println("q : " + a);
		System.out.println("age : " + b);
	}
	// request param -> method param 바인딩 될 때
	// 자동 형변환되는 type :
	// String , 기본타입(primitive), wrapper

	@GetMapping("sub08")
	public void method5(@RequestParam("num1") int a, @RequestParam("num2") int b) {
		System.out.println("number1 : " + a + "/  number2 : " + b + " sum : " + (a + b));
	}

	@GetMapping("sub09")
	public void method6(@RequestParam("a") String a,
						@RequestParam("b") double b,
						@RequestParam("c") Double c,
						@RequestParam("d") Integer d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
