package com.eurekaclient3;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

//约定大于配置：如果配置文件配置了注册中心相关配置，则默认开启注册中心注解（@EnableEurekaClient）
@SpringBootApplication
@EnableFeignClients("com.eurekaclient3.feign")
@EnableHystrix
public class EurekaClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient3Application.class, args);
    }

}
