package com.example.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloRemote
 * @Description TODO
 * @Author liuyy
 * @Date 2019/5/20 14:11
 **/
@FeignClient(name = "springcloud-producer")
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name);
}
