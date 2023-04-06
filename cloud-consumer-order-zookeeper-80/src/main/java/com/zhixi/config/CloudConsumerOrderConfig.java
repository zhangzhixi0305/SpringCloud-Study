package com.zhixi.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName CloudConsumerOrderConfig
 * @Author zhangzhixi
 * @Description
 * @Date 2023-04-06 17:46
 * @Version 1.0
 */
@Configuration
public class CloudConsumerOrderConfig {
    @Bean
    @LoadBalanced // 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
