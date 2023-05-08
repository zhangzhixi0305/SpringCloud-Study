package com.zhixi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 订单实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    // 订单id
    private Long id;
    // 用户id
    private Long userId;
    // 产品id
    private Long productId;
    // 产品数量
    private Integer count;
    // 产品单价
    private BigDecimal money;
    // 订单状态：0：创建中；1：已完结
    private Integer status;
}
