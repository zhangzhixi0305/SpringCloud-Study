package com.zhixi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName ConsumerController
 * @Author zhangzhixi
 * @Description
 * @Date 2023-04-06 17:47
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${spring.cloud.zookeeper.payment.service.name}")
    private String paymentServiceName;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject("http://" + paymentServiceName + "/payment/zk", String.class);
    }
}
