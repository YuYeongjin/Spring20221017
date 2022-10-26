package org.zerock.controller.lecture.p07mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.lecture.Mapper02;

@Controller
@RequestMapping("ex29")
public class Controller29 {

    @Autowired
    private Mapper02 mapper;

    @RequestMapping("sub01")
    public void method1() {
        List<String> names = mapper.getCustomerNames();
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
    }
}