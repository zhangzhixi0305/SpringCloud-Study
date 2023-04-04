package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName CloudEurekaServer7001
 * @Author zhangzhixi
 * @Description Eureka服务端启动类
 * @Date 2023-04-04 9:49
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class, args);
    }
}
