package com.zhixi.service.impl;

import com.zhixi.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentHystrixServiceImpl
 * @Author zhangzhixi
 * @Description
 * @Date 2023-04-11 22:06
 * @Version 1.0
 */
@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
