package com.zhixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName CloudConsumerFeignOrder80
 * @Author zhangzhixi
 * @Description 开启Feign的功能
 * @Date 2023-04-10 12:51
 * @Version 1.0
 */
@EnableFeignClients
@SpringBootApplication
public class CloudConsumerFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80.class, args);
    }
}
