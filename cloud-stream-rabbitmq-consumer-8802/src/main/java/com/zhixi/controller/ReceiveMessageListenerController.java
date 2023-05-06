package com.zhixi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 消息发送控制器
 * @date 2023-04-17 18:07
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;

    /**
     * 消息接收
     *
     * @param message 服务端发送的是什么类型的消息，这里接收的就是什么类型的消息
     */
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者1号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
    }
}
