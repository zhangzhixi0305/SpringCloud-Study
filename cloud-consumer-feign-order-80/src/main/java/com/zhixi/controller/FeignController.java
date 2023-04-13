package com.zhixi.controller;

import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import com.zhixi.service.PaymentClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName FeignController
 * @Author zhangzhixi
 * @Description feign的controller层
 * @Date 2023-04-10 12:57
 * @Version 1.0
 */
@RestController
@RequestMapping("/feign")
@Slf4j
public class FeignController {

    @Resource
    private PaymentClient paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        return paymentFeignService.create(payment);
    }

    /**
     * 测试OpenFeign的超时控制：OpenFeign客户端一般默认等待1秒钟*
     *
     * @return 返回数据
     */
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
