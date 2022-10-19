package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex18")
public class Controller18 {
	
	// /ex18/sub01?name=park&address=seoul&email=abc@daum.net
	@RequestMapping("sub01")
	public void method1(@ModelAttribute("bean") JavaBean01 b) {
		
	}
	
	// @ModelAttribute annotation 사용해서 
	//bean2 라는 이름의 attribute를 model에 추가
	// bean2 의 type = javabean2
	
	@RequestMapping("sub02")
	public void method2(@ModelAttribute("bean2") JavaBean02 b) {
		
	}
	
	@RequestMapping("sub03")
	public void method03(@ModelAttribute() Student s) {
		s.setClassName("soccer");
		s.setName("cha");
		s.setStudentNumber("13");
	}
	
	@RequestMapping("sub04")
	public String method04(Student s) {
		s.setClassName("football");
		s.setName("son");
		s.setStudentNumber("7");
		return "ex18/sub03";
	}
	
	
}
