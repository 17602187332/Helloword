package com.example.eurekaclient2;

import com.example.eurekaclient2.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@LoadBalancerClients(defaultConfiguration = {RibbonConfig.class})
@SpringBootApplication
//如果配置文件配置了注册中心相关配置，则默认开启注册中心注解（@EnableEurekaClient）
public class EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
}
