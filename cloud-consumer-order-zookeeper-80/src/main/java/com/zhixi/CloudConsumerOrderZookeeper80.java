package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName CloudConsumerOrderZookeeper80
 * @Author zhangzhixi
 * @Description
 * @Date 2023-04-06 17:45
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrderZookeeper80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderZookeeper80.class, args);
    }
}
