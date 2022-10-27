package org.zerock.controller.lecture.p07mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.lecture.Mapper08;


@Controller
@RequestMapping("ex34")
public class Controller34 {


    @Autowired
    private Mapper08 mapper08;

    
    // 쿼리어세 특수기호 처리
    @RequestMapping("sub03")
    public void method3(){
        mapper08.getProductName().forEach(System.out::println);
    }
    @RequestMapping("sub04")
    public void method4(){
        mapper08.getProductName2().forEach(System.out::println);

    }
    
}
