package com.longwanli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy包含了@EnableZuulServer，设置该类是⽹关的启动类。
@EnableZuulProxy
//@EnableAutoConfiguration可以帮助Spring Boot应⽤将所有符合条件的@Configuration配置，加载到当前Spring Boot创建并使⽤的IoC容器中。
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}