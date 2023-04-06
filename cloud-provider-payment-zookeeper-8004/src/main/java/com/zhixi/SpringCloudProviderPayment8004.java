package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 支付服务提供者
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@SpringBootApplication
// 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class SpringCloudProviderPayment8004 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderPayment8004.class, args);
    }
}
