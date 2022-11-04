package org.zerock.controller.lecture.p09fetch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.mapper.lecture.Mapper11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ex47")
public class Controller47 {
    @Autowired
    private Mapper11 mapper;

    @RequestMapping("sub")
    public void method() {

    }

    @GetMapping("sub01")
    @ResponseBody
    public Map<String, String> method1() {
        return Map.of("address", "seoul", "name", "son");
    }

    @GetMapping("sub02")
    @ResponseBody
    public Map<String, Object> method2() {
        return Map.of("color", List.of("red", "blue"), "name", "son");
    }

    @GetMapping("sub04")
    @ResponseBody
    public JavaBean18 method4() {
        return mapper.getCustomerById(30);

    }


    @DeleteMapping("sub05/{id}")
    @ResponseBody
    public Map<String, Object> method14(@PathVariable int id) {
        Map<String, Object> map = new HashMap<>();
        int cnt = mapper.deleteCustomer(id);
        if (cnt == 1) {
            map.put("message", id + " 번 고객 삭제");
        } else {
            map.put("message", id + " 번 고객 삭제안됌");
        }
        return map;
    }
}
