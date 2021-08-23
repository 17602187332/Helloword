package com.eurekaclient3.feign.impl;

import com.eurekaclient3.dto.Persion;
import com.eurekaclient3.feign.FeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component //注入IOC容器
public class FeignImplService implements FeignService {

    @Override
    public ResponseEntity<Persion> postUser(Persion p) {
        return null;
    }
}
