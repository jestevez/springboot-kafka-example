package com.joseluisestevez.kafka.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageProducer {
    @Value("${spring.kafka.consumer.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        log.info("TOPIC: [{}];\nPAYLOAD: [{}] ", message, topic);
        this.kafkaTemplate.send(topic, message.getId() + "", message);
    }
}