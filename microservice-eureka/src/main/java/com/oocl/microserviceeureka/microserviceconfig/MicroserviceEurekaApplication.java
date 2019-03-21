package com.oocl.microserviceeureka.microserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EnableEurekaServer 声明这个项目是Eureka服务端，注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaApplication.class, args);
    }

}
