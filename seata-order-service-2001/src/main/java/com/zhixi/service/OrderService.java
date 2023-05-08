package com.zhixi.service;


import com.zhixi.pojo.Order;

public interface OrderService {
    void create(Order order);

    Order getOrderById(Long id);
}

