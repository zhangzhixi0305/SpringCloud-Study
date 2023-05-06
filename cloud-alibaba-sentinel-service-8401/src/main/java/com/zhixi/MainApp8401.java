package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MainApp8401
 * @Author zhangzhixi
 * @Description Sentinel服务注册与发现-服务提供者
 * @Date 2023-05-03 22:50
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }
}

