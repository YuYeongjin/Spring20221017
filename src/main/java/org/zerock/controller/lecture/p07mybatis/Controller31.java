package org.zerock.controller.lecture.p07mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean05;
import org.zerock.domain.lecture.JavaBean06;
import org.zerock.mapper.lecture.Mapper04;

@Controller
@RequestMapping("ex31")
public class Controller31 {
	
	@Autowired
	private Mapper04 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		List<JavaBean06> productList = mapper.getProductList();
		productList.forEach(System.out::println);
	}
	
	@RequestMapping("sub02")
	public void method2() {
		List<JavaBean05> employeeList = mapper.getEmployeeList();
		employeeList.forEach(System.out::println);
	}
}










