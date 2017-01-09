package com.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/getOrderId/{ltUserId}")
    public String getOrderId(@PathVariable("ltUserId") Long ltUserId) {
        String res = "{}";
        return res;
    }
}
