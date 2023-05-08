package com.zhixi.controller;

import com.zhixi.pojo.CommonResult;
import com.zhixi.pojo.Order;
import com.zhixi.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult<Order> create(Order order) {
        orderService.create(order);
        return new CommonResult<>(200, "订单创建成功");
    }
    // 根据id查询订单
    @GetMapping("/order/getOrderById")
    public CommonResult<Order> getOrderById(Long id) {
        Order order = orderService.getOrderById(id);
        return new CommonResult<>(200, "订单查询成功", order);
    }
}
