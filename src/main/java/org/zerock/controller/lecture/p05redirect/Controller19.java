package org.zerock.controller.lecture.p05redirect;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex19")
public class Controller19 {
		
	
	@RequestMapping("sub01")
	public void method1(HttpServletResponse response) throws Exception {
		
		//redirect response
		String location ="sub02";
		response.sendRedirect(location);
		
	}
	
	@RequestMapping("sub03")
	public String method3() {
		
		return "redirect:sub04";
	}
	
	@RequestMapping("sub05")
	public String method5() {
		return "redirect:sub06";
	}

	
	@RequestMapping("sub07")
	public void method7(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		String location = request.getContextPath()+"/ex19/sub08";
		response.sendRedirect(location);
	}
	
	@RequestMapping("sub09")
	public String method9() {
		return "redirect:/ex19/sub10";
	}
	
	@RequestMapping("sub11")
	public String method11() {
		return "redirect:/ex19/sub12";
	}
	
	
}
