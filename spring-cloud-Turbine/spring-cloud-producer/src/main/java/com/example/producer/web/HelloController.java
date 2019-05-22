package com.example.producer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author liuyy
 * @Date 2019/5/20 11:49
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello " +name;
    }

}
