package com.zhixi.controller;

import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Author zhangzhixi
 * @Description 订单控制器
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/consumer/payment")
@SuppressWarnings("all")
public class OrderController {

    @Value("${order.payment.service.url}")
    private String paymentUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(paymentUrl + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(paymentUrl + "/payment/get/" + id, CommonResult.class);
    }
}
