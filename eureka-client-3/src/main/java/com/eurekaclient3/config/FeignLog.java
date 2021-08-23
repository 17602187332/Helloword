package com.eurekaclient3.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Logger.Level 您可以为每个客户端配置的对象告诉 Feign 要记录多少。选择是：
 *      NONE，无日志记录（默认）。
 *      BASIC, 只记录请求方法和 URL 以及响应状态码和执行时间。
 *      HEADERS, 记录基本信息以及请求和响应标头。
 *      FULL, 记录请求和响应的标头、正文和元数据。
 */
@Configuration
public class FeignLog {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
