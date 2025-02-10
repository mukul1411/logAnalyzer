package com.loganalysis.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaLogConsumer {

    @KafkaListener(topics = "${kafka.topic}", groupId = "log-group")
    public void consume(String log) {
        System.out.println("Received Log: " + log);
    }
}