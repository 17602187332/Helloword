package com.eurekaclient3.controller;

import com.eurekaclient3.dto.Persion;
import com.eurekaclient3.feign.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private FeignService feignService;


    @RequestMapping("/postFeign")
    public String postFeign(){
        Persion ps = new Persion();
        ps.setUserName("卢大宝");
        ResponseEntity<Persion> pp = feignService.postUser(ps);
        if(null == pp){
            return "连接超时";
        }
        Persion ss = pp.getBody();
        return ss.getUserName();
    }

    @RequestMapping("/postFeign2")
    @HystrixCommand(fallbackMethod = "postFeign2FallBack")
    public String postFeign2(){
        Persion p = new Persion();
        p.setUserName("卢大宝");
        int s = 10/0;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return p.getUserName();
    }

    public String postFeign2FallBack(){
        return "请稍后重试";
    }
}
