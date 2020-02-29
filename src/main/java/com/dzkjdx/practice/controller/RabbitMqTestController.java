package com.dzkjdx.practice.controller;

import com.dzkjdx.practice.service.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RabbitMqTestController {
    @Autowired
    private RabbitMqService rabbitMqService;
}
