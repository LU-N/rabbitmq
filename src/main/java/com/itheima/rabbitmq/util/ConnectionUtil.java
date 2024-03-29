package com.itheima.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author JinLu
 * @date 2019/11/26 19:43
 */
public class ConnectionUtil {
    public static Connection getConnection() throws Exception {
        //1. 创建连接工厂（设置RabbitMQ的连接参数）；
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //主机；默认localhost
        connectionFactory.setHost("localhost");
        //连接端口；默认5672
        connectionFactory.setPort(5672);
        //虚拟主机；默认/
        connectionFactory.setVirtualHost("/itcast");
        //用户名；默认guest
        connectionFactory.setUsername("heima");
        //密码；默认guest
        connectionFactory.setPassword("heima");

        //2. 创建连接；
        return connectionFactory.newConnection();
    }
}
