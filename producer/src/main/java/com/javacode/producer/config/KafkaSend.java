package com.javacode.producer.config;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSend {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSend(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String key, String message) {
        kafkaTemplate.send(topic, key, message);
    }
}
