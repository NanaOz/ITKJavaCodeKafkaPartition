package com.javacode.consumer.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class WebEventsConsumer {
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "web-logs-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
