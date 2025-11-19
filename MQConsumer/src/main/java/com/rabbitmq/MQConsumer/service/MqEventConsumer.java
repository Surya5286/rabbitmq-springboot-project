package com.rabbitmq.MQConsumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MqEventConsumer {

    @RabbitListener(queues =  "${rabbitmq.queue.name}")
    public void consumeMqEvents(Map<String, String> eventData) {
        System.out.println("Received event data: " + eventData);
    }
}
