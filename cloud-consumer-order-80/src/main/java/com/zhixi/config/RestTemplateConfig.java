package com.zhixi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfig
 * @Author zhangzhixi
 * @Description RestTemplate配置类
 * @Date 2023-04-03 10:39
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
