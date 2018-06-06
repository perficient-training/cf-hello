package com.perficient.training.cf.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${message:Hello}")
    private String message;

    @GetMapping("/")
    public String message() {
        return message;
    }
}
