package com.zhixi;

import com.zhixi.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain80
 * @Author zhangzhixi
 * @Description 订单服务消费者
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * name: 指定要使用的Ribbon负载均衡策略的服务名称 configuration: 指定自定义的Ribbon负载均衡策略类
 */
@RibbonClient(name = "cloud-payment-service", configuration = MyRibbonConfig.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}