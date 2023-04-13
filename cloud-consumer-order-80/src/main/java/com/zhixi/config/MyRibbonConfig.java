package com.zhixi.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyRibbonConfig
 * @Author zhangzhixi
 * @Description 自定义Ribbon负载均衡策略
 * @Date 2023-04-06 22:03
 * @Version 1.0
 */
@Configuration
public class MyRibbonConfig {

    /**
     * 自定义负载均衡策略
     *
     * @return IRule
     */
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
