package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {
	
	@RequestMapping("sub01")
	public String method1(Model model) {
		model.addAttribute("name","park ji sung");
		
		return "redirect:/ex22/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(Model model) {
		boolean hasName = model.containsAttribute("name");
		System.out.println(hasName);
	}
	
	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name","park ji sung");
		
		return "redirect:/ex22/sub04";
	}
	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = session.getAttribute("name").toString();
		System.out.println(name);
	}
	
	// sub05 요청
	// /ex22/sub06 redirect
	// session에 attribute 넣는 코드 추가
	
	@RequestMapping("sub05")
	public String method5(HttpSession session) {
		Student s = new Student();
		s.setName("park");
		s.setClassName("soccer");
		s.setStudentNumber("13");
		session.setAttribute("student", s);
				
		return "redirect:/ex22/sub06";
	}
	@RequestMapping("sub06")
	public void method6(HttpSession session) {
		Student s = (Student) session.getAttribute("student");
		System.out.println(s.getClassName());
		System.out.println(s.getName());
		System.out.println(s.getStudentNumber());
	
	}
	
	//RedirectAttributes 로 객체 넘기기
	@RequestMapping("sub07")
	public String method7(RedirectAttributes rttr) {
		Student student = new Student();
		student.setName("lee");
		student.setClassName("spring");
		student.setStudentNumber("99");
		// 세션을 통해 어트리뷰트로 넘김
		rttr.addFlashAttribute(student);
		
		return "redirect:/ex22/sub08";
	}
	
	@RequestMapping("sub08")
	public void method8(Student student) {
		System.out.println(student);
		
	}
	
	//sub09 요청 /ex22/sub10 리다이렉트 
	// redirectattributes 사용 // 객체 타입 javabean03
	// sub10 모델에 있는 객체 내용 출력
	
	@RequestMapping("sub09")
	public String method9(RedirectAttributes rttr) {
		JavaBean03 javabean03 = new JavaBean03();
		javabean03.setAvg(9.99);
		javabean03.setClassName("academy");
		javabean03.setLocation("gangnam");
		javabean03.setScore(99);
		javabean03.setStudentNumber("coding");
		rttr.addFlashAttribute("j",javabean03);
		
		return "redirect:/ex22/sub10";
	}
	
	@RequestMapping("sub10")
	public void method10(@ModelAttribute("j") JavaBean03 j) {
		
		System.out.println(j);
	}
	
}
