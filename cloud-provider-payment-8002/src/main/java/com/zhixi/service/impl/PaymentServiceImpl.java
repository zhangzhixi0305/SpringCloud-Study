package com.zhixi.service.impl;

import com.zhixi.dao.PaymentDao;
import com.zhixi.pojo.Payment;
import com.zhixi.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Author zhangzhixi
 * @Description 支付模块service层实现类
 * @Date 2023-04-03 11:20
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
