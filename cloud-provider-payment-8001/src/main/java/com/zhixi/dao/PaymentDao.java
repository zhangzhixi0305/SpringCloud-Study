package com.zhixi.dao;


import com.zhixi.pojo.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 支付模块dao层
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@Repository
public interface PaymentDao {
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
