package com.example.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuyy
 * @className HelloController
 * @description TODO
 * @date 2019/5/24 15:07
 **/
@Controller
public class HelloController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return hello;
    }
}
