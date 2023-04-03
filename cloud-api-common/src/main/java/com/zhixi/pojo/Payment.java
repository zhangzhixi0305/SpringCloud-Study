package com.zhixi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 支付模块实体类
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
