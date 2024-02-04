package com.sourav.nandy.Worker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order/v1")
public class OrdersController {

    private static Logger logger = LoggerFactory.getLogger(OrdersController.class);

    @GetMapping("/ping")
    ResponseEntity<String> ping(){
        logger.info("Received request in OrdersController");
        return ResponseEntity.ok("SUCESS");
    }
}
