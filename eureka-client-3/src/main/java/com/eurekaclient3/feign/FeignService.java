package com.eurekaclient3.feign;

import com.eurekaclient3.dto.Persion;
import com.eurekaclient3.feign.impl.FeignImplService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component //注入IOC容器
@FeignClient(name = "LUDB-CLIENT-1", fallback = FeignImplService.class) //OpenFeign注解,取要掉用的服务名
public interface FeignService {

    @RequestMapping(value = "/postUser")
    ResponseEntity<Persion> postUser(@RequestBody Persion p);

}
