package org.zerock.controller.lecture.p09fetch;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ex45")
public class Controller45 {
    @RequestMapping("sub")
    public void method(){

    }


    @GetMapping("sub01")
    public ResponseEntity method1(){
//        return ResponseEntity.ok().build();
        return  ResponseEntity.status(500).build();
    }
    @GetMapping("sub03")
    public ResponseEntity method2(){
       return ResponseEntity.ok().header("My-Header", "My-Value").build();
    }

    @GetMapping("sub05")
    public ResponseEntity<String> method5(){
        return ResponseEntity.ok()
                .body("hello");
    }

    @GetMapping("sub06")
    public  ResponseEntity<JavaBean01> method6(){
        JavaBean01 bean = new JavaBean01();
        bean.setAddress("서울");
        bean.setEmail("abc@");
        bean.setName("홍");

        return ResponseEntity.ok().body(bean);
    }

    @GetMapping("sub08")
    public  ResponseEntity<JavaBean19> method8(){
        JavaBean19 data = new JavaBean19();
    data.setDate(LocalDate.now());
    data.setDateTime(LocalDateTime.now());
    return ResponseEntity.ok().body(data);
    }
    @GetMapping("sub09")
    public ResponseEntity<JavaBean15> method09(){
        JavaBean15 data = new JavaBean15();
        JavaBean14 sub = new JavaBean14();
    data.setId(1);
    data.setName("a");
    sub.setName("b");
    sub.setPrice(40.0);
    data.setProduct(sub);
        return ResponseEntity.ok(data);
    }

    @GetMapping("sub10")
    @ResponseBody
    public JavaBean15 method10(){
        JavaBean15 data = new JavaBean15();
        JavaBean14 sub = new JavaBean14();
        data.setId(1);
        data.setName("a");
        sub.setName("b");
        sub.setPrice(40.0);
        data.setProduct(sub);
        return data;
    }

    @GetMapping("sub11")
    @ResponseBody
    public JavaBean15 method11(){
        JavaBean15 data = new JavaBean15();
        data.setName("홍");
        return data;
    }
    @GetMapping("sub14")
    @ResponseBody
    public Map<String,Object> method14(){
        Map<String,Object> map = new HashMap<>();
        map.put("address","부산");
        map.put("age",33);
        map.put("data","data");
        JavaBean15 sub = new JavaBean15();
        sub.setName("홍");
        map.put("sub", sub);
        return map;
    }
}
