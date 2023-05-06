package com.zhixi.service.impl;

import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import com.zhixi.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}

