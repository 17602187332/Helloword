package com.springbootzuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class RouteFilter extends ZuulFilter {
    //过滤器类型：pre、routing、post、error
    @Override
    public String filterType() {return null;}
    //执行顺序
    @Override
    public int filterOrder() {return 0;}
    //执行条件（开关）
    @Override
    public boolean shouldFilter() { return false;}

    //具体业务逻辑
    @Override
    public Object run() throws ZuulException {return null; }
}
