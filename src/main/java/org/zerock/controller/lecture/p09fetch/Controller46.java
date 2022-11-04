package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ex46")
public class Controller46 {
    @RequestMapping("sub")
    public void method(){

    }

    @GetMapping("sub01")
    @ResponseBody
    public String method1(){
        return "Hello";
    }
}
