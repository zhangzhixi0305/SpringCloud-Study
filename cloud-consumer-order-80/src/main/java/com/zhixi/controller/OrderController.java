package com.zhixi.controller;

import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    /**
     * 测试zipkin链路追踪
     * http://localhost/consumer/payment/zipkin
     * @return 从服务端返回的字符串
     */
    @GetMapping("/zipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject(paymentUrl + "/payment/zipkin", String.class);
        return result;
    }
}
