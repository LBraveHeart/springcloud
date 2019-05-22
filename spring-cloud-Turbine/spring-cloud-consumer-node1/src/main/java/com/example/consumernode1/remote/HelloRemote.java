package com.example.consumernode1.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloRemote
 * @Description TODO
 * @Author liuyy
 * @Date 2019/5/20 14:11
 **/
@FeignClient(name = "springcloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello1(@RequestParam("name") String name);
}
