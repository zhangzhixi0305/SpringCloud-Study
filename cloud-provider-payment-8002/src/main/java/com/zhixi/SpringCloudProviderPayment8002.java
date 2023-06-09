package com.zhixi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 支付服务提供者
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.zhixi.dao")
public class SpringCloudProviderPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderPayment8002.class, args);
    }
}
