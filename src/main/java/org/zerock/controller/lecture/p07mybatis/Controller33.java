package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean12;
import org.zerock.mapper.lecture.Mapper06;


@Controller
@RequestMapping("ex33")
public class Controller33 {

    @Autowired
    private Mapper06 mapper;

    @RequestMapping("sub01")
    private void method1(){
        System.out.println(mapper.getCategory());
    }

    @RequestMapping("sub02")
    private void method2(){
        JavaBean12 supplier= mapper.getSupplier();
        System.out.println(supplier.getId());
        System.out.println(supplier.getName());
        System.out.println(supplier.getProductName());
    }
}
