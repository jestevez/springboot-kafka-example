package com.joseluisestevez.kafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseluisestevez.kafka.message.Message;
import com.joseluisestevez.kafka.message.MessageProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final MessageProducer producer;

    @Autowired
    KafkaController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody Message message) {
        this.producer.sendMessage(message);
    }
}