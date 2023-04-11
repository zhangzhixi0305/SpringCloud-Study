package com.zhixi.service;

import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @author zhixi
 * OpenFeign的客户端接口，用于调用服务提供者的接口
 */
@FeignClient(value = "cloud-payment-service")
public interface PaymentClient {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @PostMapping(value = "/payment/create")
    CommonResult create(@RequestBody Payment payment);

    /**
     * 测试OpenFeign的超时控制
     *
     * @return 服务端的返回值
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}