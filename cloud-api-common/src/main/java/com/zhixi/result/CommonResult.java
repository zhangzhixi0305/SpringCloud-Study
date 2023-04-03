package com.zhixi.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SpringCloudProviderPayment
 * @Author zhangzhixi
 * @Description 统一返回结果类
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 返回结果码
     */
    private Integer code;
    /**
     * 返回结果信息
     */
    private String message;
    /**
     * 返回结果数据
     */
    private T data;


    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
