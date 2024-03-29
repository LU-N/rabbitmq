package com.itheima.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author JinLu
 * @date 2019/11/26 21:21
 */
public class MyListener {
    /**
     * 监听某个队列的消息
     *
     * @param message 接收到的消息
     */
    @RabbitListener(queues = "item_queue")
    public void myListener1(String message) {
        System.out.println("消费者接收到的消息为:" + message);
    }
}
