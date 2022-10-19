package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;
@Controller
@RequestMapping("ex17")
public class Controller17 {
	
	@RequestMapping("sub01")
	public void method1(Model model) {
		model.addAttribute("myName","cha bum");
	}
	
	// ex17 sub02 요청  및 포워드 email attribute
	@RequestMapping("sub02")
	public void method2(Model model) {
		model.addAttribute("email", "abc@daun.net");
	}
	@RequestMapping("sub03")
	public void method3(Model model) {
		model.addAttribute("name", "honggildong");
		model.addAttribute("age", "50");
		model.addAttribute("address", "seoul");
		model.addAttribute("email", "abc@daun.net");
	}
	
	@RequestMapping("sub04")
	public void method4(Model model) {
		JavaBean03 obj = new JavaBean03();
		obj.setAvg(9.99);
		obj.setClassName("spring");
		obj.setLocation("seoul");
		obj.setStudentNumber("s50");
		model.addAttribute("student",obj);
	}
	@RequestMapping("sub05")
	public void method5(Model model) {
		Student s= new Student();
		s.setName("park ji sung");
		s.setClassName("soccer");
		s.setStudentNumber("13");
		
//		model.addAttribute("student",s);
		model.addAttribute(s);
		
	}
	
}













