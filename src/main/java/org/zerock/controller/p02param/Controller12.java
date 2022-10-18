package org.zerock.controller.p02param;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex12")
public class Controller12 {
	// /ex12/sub01?city=seoul&city=nu&city=tokyo
	@GetMapping("sub01")
	public void method1(@RequestParam String city) {
		System.out.println(city);
	}
	
	// /ex12/sub02?city=seoul&city=nu&city=tokyo
	@GetMapping("sub02")
	public void method2(@RequestParam String[] city) {
		System.out.println(city.length);
		System.out.println(Arrays.toString(city));
	}
	
	@GetMapping("sub03")
	public void method3(@RequestParam List<String> city) {
		System.out.println(city.size());
		System.out.println(city);
	}
	
	@GetMapping("sub04")
	public void method4(String name, String address, int age, String email, String password) {
		System.out.println("회원정보");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("암호 : " + password);
		
	}
}
