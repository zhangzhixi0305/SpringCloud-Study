package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName StreamMQMain8801
 * @Author zhangzhixi
 * @Description Stream整合RabbitMQ-消息生产者
 * @Date 2023-04-04 9:49
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
    }
}
