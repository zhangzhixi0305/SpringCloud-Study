package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderNacosMain84
 * @Author zhangzhixi
 * @Description Sentinel服务注册与发现-服务消费者
 * @Date 2023-05-06 10:16
 * @Version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}

