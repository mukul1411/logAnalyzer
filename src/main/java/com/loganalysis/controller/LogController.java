package com.loganalysis.controller;

import com.loganalysis.kafka.KafkaLogProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logs")
public class LogController {

    private final KafkaLogProducer kafkaLogProducer;

    public LogController(KafkaLogProducer kafkaLogProducer) {
        this.kafkaLogProducer = kafkaLogProducer;
    }

    @PostMapping("/send")
    public String sendLog(@RequestParam String message) {
        kafkaLogProducer.sendLog(message);
        return "Log sent: " + message;
    }
}