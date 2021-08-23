package com.example.eurekaclient2.controller;

import com.example.eurekaclient2.dto.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/postRest")
    private String postRest(){
        Persion ps = new Persion();
        ps.setUserName("卢大宝");
        //包含响应的一些信息
        ResponseEntity<Persion> pp = restTemplate.postForEntity("http://LUDB-CLIENT-1/postUser", ps, Persion.class);
        Persion p = pp.getBody();
        return p.getUserName();
    }

    @RequestMapping("/postFegin")
    private String postFegin(){
        Persion ps = new Persion();
        ps.setUserName("卢大宝");
        //包含响应的一些信息
        ResponseEntity<Persion> pp = restTemplate.postForEntity("http://LUDB-CLIENT-1/postUser", ps, Persion.class);
        Persion p = pp.getBody();
        return p.getUserName();
    }
}
