package org.zerock.controller.lecture.p07mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.lecture.Mapper09;

@Controller
@RequestMapping("ex35")
public class Controller35 {
	
	@Autowired
	private Mapper09 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		String name1 = mapper.getCustomerNameById(1);
		String name2 = mapper.getCustomerNameById(2);
		
		System.out.println(name1);
		System.out.println(name2);
		
	}
	@RequestMapping("sub02")
	public void method2() {
		String name1 = mapper.getEmployeeFirstNAmeById(1);
		String name2 = mapper.getEmployeeFirstNAmeById(2);

		System.out.println(name1);
		System.out.println(name2);

	}
	@RequestMapping("sub03")
    public void method3() {
		List<String> berlin = mapper.getCustomerNameByCityAndCountry("Germany", "Berlin");
		List<String> london = mapper.getCustomerNameByCityAndCountry("UK", "london");

		System.out.println(berlin);
		System.out.println(london);
    }
}
