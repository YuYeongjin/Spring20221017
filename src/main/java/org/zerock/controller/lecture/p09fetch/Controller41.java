package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex41")
public class Controller41 {

    @RequestMapping("sub0")
    public void method0(){

    }
    @GetMapping("sub01")
    public void method1(){

    }
    @GetMapping("sub02")
    public void method2(String email, Integer age){
        System.out.println(email);
        System.out.println(age);
    }
}
