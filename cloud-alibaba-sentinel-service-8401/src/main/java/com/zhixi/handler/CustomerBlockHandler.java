package com.zhixi.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhixi.result.CommonResult;


public class CustomerBlockHandler {
    public static CommonResult<Object> handlerException(BlockException exception) {
        return new CommonResult<>(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult<Object> handlerException2(BlockException exception) {
        return new CommonResult<>(4444, "按客戶自定义,global handlerException----2");
    }
}
