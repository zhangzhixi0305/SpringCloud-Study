package com.zhixi.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhixi.handler.CustomerBlockHandler;
import com.zhixi.pojo.Payment;
import com.zhixi.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult<Payment> byResource() {
        return new CommonResult<>(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult<Payment> handleException(BlockException exception) {
        return new CommonResult<>(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            // 自定义限流处理类
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult<Payment> customerBlockHandler() {
        return new CommonResult<>(200, "按客戶自定义", new Payment(2020L, "serial003"));
    }
}
