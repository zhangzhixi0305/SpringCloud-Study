package com.zhixi.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-05-04 15:48
 */
@Service
public class TestService {
    /**
     * @return 返回值
     * @SentinelResource: 注解中的value值是资源名，可以任意取名，但是要保证唯一性
     */
    @SentinelResource("common")
    public String common() {
        return "common";
    }
}
