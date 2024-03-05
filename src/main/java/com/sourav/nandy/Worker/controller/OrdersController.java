package com.sourav.nandy.Worker.controller;

import com.sourav.nandy.Worker.model.Tester;
import com.sourav.nandy.Worker.repository.TesterRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order/v1")
public class OrdersController {

    private static Logger logger = LoggerFactory.getLogger(OrdersController.class);

    @Autowired
    private TesterRepo testerRepo;

    @GetMapping("/ping")
    ResponseEntity<String> ping(){
        logger.info("Received request in OrdersController");
        Tester t=new Tester("C123","This is the data");
        testerRepo.save(t);
        return ResponseEntity.ok("SUCESS");
    }
}
