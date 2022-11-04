package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex40")
public class Controller40 {

    @RequestMapping("sub01")
    private void method1(){

    }
    @GetMapping("sub01")
    public void method11(){
        System.out.println("get방식");
    }
    @GetMapping("sub02")
    public void method2(){
        System.out.println("post방식");
    }
}
