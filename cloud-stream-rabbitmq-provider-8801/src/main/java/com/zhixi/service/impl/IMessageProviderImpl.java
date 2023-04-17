package com.zhixi.service.impl;

import com.zhixi.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 业务发送接口实现类
 * @description @EnableBinding(Source.class) 定义消息的推送管道
 * @date 2023-04-17 18:07
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " + serial);
        return null;
    }
}
