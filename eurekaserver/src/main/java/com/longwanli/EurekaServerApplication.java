package com.longwanli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明该类是Spring Boot服务的⼊⼝
@SpringBootApplication
//声明该类是⼀个Eureka Server微服务，提供服务注册和服务发现功能，即注册中⼼。
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}