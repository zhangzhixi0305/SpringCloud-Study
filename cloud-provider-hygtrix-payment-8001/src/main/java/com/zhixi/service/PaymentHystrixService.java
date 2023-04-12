package com.zhixi.service;

/**
 * @ClassName PaymentHystrixService
 * @Author zhangzhixi
 * @Description 服务提供者接口
 * @Date 2023-04-11 18:09
 * @Version 1.0
 */
public interface PaymentHystrixService {


    /**
     * 正常访问
     *
     * @param id id
     * @return result
     */
    String paymentInfoOk(Integer id);


    /**
     * 超时访问
     *
     * @param id id
     * @return result
     */
    String paymentInfoTimeOut(Integer id);

    /**
     * 服务熔断
     *
     * @param id id
     * @return result
     */
    String paymentInfoTimeOutBak(Integer id);

    /**
     * 服务熔断
     *
     * @param id id
     * @return result
     */
    String paymentCircuitBreaker(Integer id);
}
