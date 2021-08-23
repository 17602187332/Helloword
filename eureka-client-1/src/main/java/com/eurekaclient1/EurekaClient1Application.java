package com.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//如果配置文件配置了注册中心相关配置，则默认开启注册中心注解（@EnableEurekaClient）
@EnableEurekaClient
@EnableHystrix
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }

}
