package com.zhixi.service;

import com.zhixi.service.impl.PaymentHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentHystrixService
 * @Author zhangzhixi
 * @Description 服务提供者的接口
 * @Date 2023-04-11 18:38
 * @Version 1.0
 */
@FeignClient(
        // 服务提供者的名称
        value = "cloud-provider-hystrix-payment",
        // 服务降级的类,比如服务提供者挂了，就会调用这个类的方法
        fallback = PaymentHystrixServiceImpl.class)
public interface PaymentHystrixService {
    /**
     * 正常访问
     *
     * @param id id
     * @return result
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfoOk(@PathVariable("id") Integer id);

    /**
     * 超时访问
     *
     * @param id id
     * @return result
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
