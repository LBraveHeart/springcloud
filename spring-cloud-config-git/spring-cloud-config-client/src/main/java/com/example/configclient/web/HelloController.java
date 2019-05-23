package com.example.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyy
 * @className HelloController
 * @description TODO
 * @date 2019/5/23 15:25
 **/
@RestController
// 当配置中心信息更改时，自动将新的配置更新
@RefreshScope
public class HelloController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping()
    private String hello(){
        return this.hello;
    }
}
