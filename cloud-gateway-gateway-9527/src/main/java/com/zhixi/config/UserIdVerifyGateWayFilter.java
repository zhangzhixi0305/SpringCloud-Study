package com.zhixi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description gateway过滤器，验证userId是否为空或者小于0
 * @date 2023-04-13 17:29
 */
@Component
@Slf4j
public class UserIdVerifyGateWayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String userId = exchange.getRequest().getQueryParams().getFirst("userId");
        // 如果userId为空，或者小于0，就拦截
        if (userId == null || userId.isEmpty() || Integer.parseInt(userId) < 0) {
            log.info("userId is empty or less than 0");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
