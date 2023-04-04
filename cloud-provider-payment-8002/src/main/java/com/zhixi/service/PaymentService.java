package com.zhixi.service;

import com.zhixi.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 支付模块service层
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment 实体对象
     * @return 影响行数
     */
    public int create(Payment payment);

    /**
     * 根据id查询
     *
     * @param id 主键
     * @return 实体对象
     */
    public Payment getPaymentById(@Param("id") Long id);
}