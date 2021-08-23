package com.eurekaclient1.controller;

import com.eurekaclient1.dto.Persion;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class OrderController {

    @Value("${server.port}")
    Integer port;

    @RequestMapping("/postUser")
    public Persion postUser(@RequestBody Persion p){
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        p.setUserName(p.getUserName() + port);
        return p;
    }
}
