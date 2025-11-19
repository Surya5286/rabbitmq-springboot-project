package com.rabbitmq.MQProducer.controller;

import com.rabbitmq.MQProducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/producer")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> produceMessage(@RequestBody Map<String, String> message) {
        producerService.sendMessage(message);
        System.out.println("Message sent to RabbitMQ");
        return ResponseEntity.ok("Message sent to RabbitMQ");
    }
}
