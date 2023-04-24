package com.zhixi.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName GateWayConfig
 * @Author zhangzhixi
 * @Description gateway配置路由
 * @Date 2023-04-13 17:28
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        // 创建路由
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 创建一个新的 Route，其中：参数1是路由的唯一标识，参数2是目标uri
        routes.route("path_route_atguigu",
                r -> r.path("/孙笑川")
                        .uri("https://tieba.baidu.com//f?kw=")).build();

        return routes.build();
    }
}
