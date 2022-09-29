package com.example.springdubbo.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Service {

    @Value("${info:hello mic!}")
    public String info;

    @GetMapping("/info")
    public String info(){
        return info;
    }
}
