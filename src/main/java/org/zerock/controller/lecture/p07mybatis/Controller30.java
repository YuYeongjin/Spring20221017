package org.zerock.controller.lecture.p07mybatis;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean05;
import org.zerock.domain.lecture.JavaBean06;
import org.zerock.mapper.lecture.Mapper03;

@Controller
@RequestMapping("ex30")
public class Controller30 {

    @Setter(onMethod_ = {@Autowired})
    private Mapper03 mapper;

    @RequestMapping("sub01")
    public void method1(){
        JavaBean04 customer = mapper.getCustomer();
        System.out.println(customer);
    }

    @RequestMapping("sub02")
    public void method2(){
        JavaBean05 employee = mapper.getEmployee();
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
    }
    @RequestMapping("sub03")
    public void method3(){
        JavaBean05 employee = mapper.getEmployee2();
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
    }
    @RequestMapping("sub04")
    public void method4(){
        JavaBean04 customer = mapper.getCustomer2();
        System.out.println(customer.getName());
        System.out.println(customer.getCountry());
    }

    @RequestMapping("sub05")
    private void method5(){
        JavaBean06 prod = mapper.getProduct();
        System.out.println(prod.getName());
        System.out.println(prod.getPrice());
    }
}